/////////////////////////////////////////////////////////////////////////////
// Semester:         CS367 Fall 2017 
// PROJECT:          Program 4/ Ancestor finder
// FILE:             Queue.java
//
// TEAM:    Benjamin Challe
// Authors: Benjamin Challe, bchalle@wisc.edu, bchalle,002 
//
// ---------------- OTHER ASSISTANCE CREDITS 
// Persons: Lecture notes
// 
// Online sources: Online lecture modules
//////////////////////////// 80 columns wide //////////////////////////////////
/**
 * This Class creates and implements queue including enqueueing an item and
 * dequeueing an item and checking to see if the queue is empty
 *
 * <p>Bugs: none that I am aware of
 *
 * @author Benjamin Challe
 */
public class Queue<T> implements QueueADT<T> {
	private LinkedList<T> items; // create a linkedlist
	int numItems; // create a item counter
	public Queue(){

		items =  new LinkedList<T>(); //initialize the list
		numItems = 0; // set the nnumber of items to 0
		
	}
	   /**
     * This method returns true iff there are items in the queue
	 *
     * @return true iff numItems equals 0
     */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return numItems==0; // returns true iff the number of items is 0
	}
	/**
	 * This method takes the item the user wants to add and adds it
	 * to the queue
	 *
	 * PRECONDITIONS: list is valid
	 * 
	 * POSTCONDITIONS: number of items will be different
	 *
	 * @param data <T> the item you want to add
	 * @return nothing
	 */
	@Override
	public void enqueue(T data) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if(data == null) throw new IllegalArgumentException(); //if the data is null throw exception
		items.add(data); // add the data to the list
		numItems++; // increment the item counter
		
	}
	/**
	 * This method removes the next item up in the queue and returns it
	 *
	 * PRECONDITIONS: list is valid
	 * 
	 * POSTCONDITIONS: number of items will be different
	 *
	 * @param none
	 * @return T the item removed
	 */
	@Override
	public T dequeue() throws EmptyQueueException {
		if(numItems == 0) throw new EmptyQueueException(); // if the number of items is 0 throw an exception
		numItems --; //decrement the number of items
		return items.remove(0); //return the removed item
		
		// TODO Auto-generated method stub

	}
	/**
	 * This method looks at the next item in the queue but doesnt remove it.
	 * returns the item at the beginning of the queue
	 *
	 * PRECONDITIONS: list is valid
	 * 
	 * POSTCONDITIONS: none
	 *
	 * @param none
	 * @return T the item and the beginning of queue
	 */
	@Override
	public T element() throws EmptyQueueException {
		if(numItems == 0) throw new EmptyQueueException(); // if the number of items is 0 throw an exception
		
		// TODO Auto-generated method stub
		return items.get(0); //return the item at the beginning of the queue
	}


}
