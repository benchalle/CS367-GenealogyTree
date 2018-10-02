/////////////////////////////////////////////////////////////////////////////
// Semester:         CS367 Fall 2017 
// PROJECT:          Program 4/ Ancestor finder
// FILE:             Stack.java
//
// TEAM:    Benjamin Challe
// Authors: Benjamin Challe, bchalle@wisc.edu, bchalle,002 
//
// ---------------- OTHER ASSISTANCE CREDITS 
// Persons: Lecture notes
// 
// Online sources: Online lecture modules
//////////////////////////// 80 columns wide //////////////////////////////////
import java.util.EmptyStackException;
/**
 * This Class creates and implements a stack. This includes popping, pushing,
 * peeking, and checking to see if the stack is empty
 *
 * <p>Bugs: none that I am aware of
 *
 * @author Benjamin Challe
 */
public class Stack<T> implements StackADT<T> {
	private LinkedList<T> items; //create a linkedlist
	int numItems; //create a num items counter
	public Stack(){
		items = new LinkedList<T>(); //initialize the linkedlist
		numItems = 0; // initialize the number of items
	}
    /**
     * This method returns true iff there are items in the queue
	 *
     * @return true iff numItems equals 0
     */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return numItems ==0; // return true iff numitems equals 0
	}
	/**
	 * This method takes the item the user wants to add and adds it
	 * to the stack and increases the number of items
	 *
	 * PRECONDITIONS: list has been created
	 * 
	 * POSTCONDITIONS: items will not be in the same position
	 *
	 * @param item <T> the item you want to add
	 * @return nothing
	 */
	@Override
	public void push(T data) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if(data == null) throw new IllegalArgumentException(); // if data equals null throw exception
		items.add(data); // otherwise add the data to the linkedlist
		numItems++; // increase the number of items
		
	}
	/**
	 * This method looks at the first item in the stack without removing it
	 * and returns the found items
	 *
	 * PRECONDITIONS: list has been created
	 * 
	 * POSTCONDITIONS: none
	 *
	 * @param none
	 * @return item at top of stack
	 */
	@Override
	public T peek() throws EmptyStackException {
		if(numItems == 0) throw new EmptyStackException(); // if the list is empty throw exception
		return items.get(0); // return the first item in the list
		// TODO Auto-generated method stub
		
	}
	/**
	 * This method removes item at the top of the stack and returns it
	 *
	 * PRECONDITIONS: there is list created
	 * 
	 * POSTCONDITIONS: less items in the list
	 *
	 * @return the item at the top of the stack
	 */
	@Override
	public T pop() throws EmptyStackException {
		// TODO Auto-generated method stub
		if(numItems == 0) throw new EmptyStackException();  // if the list is empty throw exception
		--numItems; //decrease the number of items counter
		return items.remove(0); // return the removed item
	}
	/**
	 * This method creates a new stack and save in it the reverse of the original
	 * stack wile maintaining the original
	 * 
	 * POSTCONDITIONS: none
	 *
	 * @return the reversed stack
	 */
	@Override
	public StackADT<T> reverse() {
		Stack<T> stack = new Stack<T>(); // create a new stack
		if(!isEmpty()){ // if the stack is not empty
			for(int x=0; x<numItems; x++){ // for each item in the stack
				stack.push(items.get(x)); // add the item at x to the new stack
			}
		}
		return stack; // return the stack
		
		// TODO Auto-generated method stub

	}

}
