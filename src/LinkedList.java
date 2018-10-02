/////////////////////////////////////////////////////////////////////////////
//Semester:         CS367 Fall 2017 
//PROJECT:          Program 2: Train Hub
//FILE:             LinkedList.java
//
//TEAM:    Benjamin Challe
//Authors: Benjamin Challe, bchalle@wisc.edu, 002
//
//---------------- OTHER ASSISTANCE CREDITS 
//Persons: none
//
//Online sources: none
////////////////////////////80 columns wide //////////////////////////////////
/**
 * An Iterable list that is implemented using a singly-linked chain of nodes
 * with a header node and without a tail reference.
 * 
 * The "header node" is a node without a data reference that will 
 * reference the first node with data once data has been added to list.
 * 
 * The iterator returned is a LinkedListIterator constructed by passing 
 * the first node with data.
 * 
 * CAUTION: the chain of nodes in this class can be changed without
 * calling the add and remove methods in this class.  So, the size()
 * method must be implemented by counting nodes.  This counting must
 * occur each time the size method is called.  DO NOT USE a numItems field.
 * 
 * COMPLETE THIS CLASS AND HAND IN THIS FILE
 */
public class LinkedList<E> implements ListADT<E> {

	private Listnode<E> head; //create a lisnode named head
	
	/** Constructor **/
	public LinkedList(){
		head = new Listnode<E>(null,null); // initialize head to null
	}
	//	 TODO: YOU MUST IMPLEMENT THE LINKED LIST CLASS AS FOLLOWS:
	//	 
	//	 It must be a SINGLY-LINKED chain of ListNode<E> nodes
	//	 It must have a "header node" ("dummy node" without data)
	//	 It must NOT have a tail reference
	//	 It must NOT keep a number of data items
	//       NOTE: in this program, the chains of nodes in this program may be 
	//   	 changed outside of the LinkedList class, so the actual data count 
	//       must be determined each time size is called.
	//
	//	 It must return a LinkedListIterator<E> as its iterator.
	//	 
	//	 Note: The "header node"'s data reference is always null and 
	//	 its next references the node with the first data of the list.
	//	 
	//	 Be sure to implement this LinkedList<E> using Listnode
	//	       you must use LinkedListIterator<E> instead of Iterator<E>
	//	

	/** 
	 * Returns a reference to the header node for this linked list.
	 * The header node is the first node in the chain and it does not 
	 * contain a data reference.  It does contain a reference to the 
	 * first node with data (next node in the chain). That node will exist 
	 * and contain a data reference if any data has been added to the list.
	 * 
	 * NOTE: Typically, a LinkedList would not provide direct access
	 * to the headerNode in this way to classes that use the linked list.  
	 * We are providing direct access to support testing and to 
	 * allow multiple nodes to be moved as a chain.
	 * 
	 * @return a reference to the header node of this list. 0
	 */
	public Listnode<E> getHeaderNode() {
		return head; // return the pointer head
		//TODO implement this method
	}

	/**
	 * Must return a reference to a LinkedListIterator for this list.
	 */
	public LinkedListIterator<E> iterator() {
		return new LinkedListIterator<E>(head); // return a new iterator with start at head
		//TODO implement this method
	}

	@Override
	/**
	 * this method adds a item to the end of the list
	 * and increments to pointer
	 *
	 * @param (parameter name) item you want to add
	 * @return nothing
	 */
	public void add(E item) {
		if(item == null) throw new IllegalArgumentException(); // if the item is null throw exception
		Listnode<E> newNode = new Listnode<E>(item); // create a new listnode with data item
		Listnode<E> curr = head; // create new pointer
		while(curr.getNext() != null){ // while there is another node loop
			curr = curr.getNext(); // increase the pointer
			
		}
		curr.setNext(newNode); // link the last node to the new node
		// TODO Auto-generated method stub
		
	}
	/**
	 * This method adds an item at a certain position pos and increments 
	 * the counter
	 * @param item the item you want to add
	 * @param pos the position you want to add it to in the list
	 * @return void
	 */
	@Override
	public void add(int pos, E item) {
		if(item == null) throw new IllegalArgumentException();// if the item is null through exception
		if(pos< 0 ||pos > size())throw new IndexOutOfBoundsException(); // if the position is invalid return exception
		Listnode<E> curr = getHeaderNode(); // get the header node
		for(int x =0; x< pos; x++){ 
			curr = curr.getNext(); // get the pointer into the correct postion
			
		}
		curr.setNext(new Listnode<E>(item, curr.getNext()));// set the node with item into the correct position and link it correctly
		// TODO Auto-generated method stub
		
	}
	/**
	 * returns whether or not there is an item in the list
	 *
	 * PRECONDITIONS: there is a list
	 * 
	 *
	 * @param item the item you want to know about
	 * @return true if there is the same item in the list
	 */
	@Override
	public boolean contains(E item) {
		Listnode<E> curr = head; // save the head pointer
		while(!(curr.getNext() == null)){ // as long as there is another node
			if(curr.getData() == item){ // if the nodes data equals item
				return true; // return true
			}
			curr = curr.getNext(); // increment the pointer
		}
		// TODO Auto-generated method stub
		return false; // if it is not in the list return false
	}

	@Override
	/**
	 * Gets an item at a postion in the list and returns the item
	 *
	 * PRECONDITIONS: there is a list
	 *
	 * @param pos the position of the item you want to get
	 * @returns the item at that position
	 */
	public E get(int pos) {
		if(pos <0 || pos > size()){ //test to see if the postion is valid
			throw new IndexOutOfBoundsException(); // if its not throw exception
	}
		Listnode<E> curr = head.getNext(); // set the set curr to the next node in head
		for(int x =0; x<pos ; x++){
			curr = curr.getNext(); //loop to correct position
		}
		return curr.getData(); // return the data at that postion
		
		// TODO Auto-generated method stub
	}

	/**
	 * this method tells the user whether or the the list is empty
	 *
	 * PRECONDITIONS: there is a list
	 *
	 * @param none
	 * @return true iff there is an item in the list
	 */
	@Override
	public boolean isEmpty() {
		if(head.getNext()==null){ // test to see if head has a item
			return true; // return true if it doesnt
		}else{
		// TODO Auto-generated method stub
		return false; // if it does return false
		}
	}
	/**
	 * this method removes the item at a certain postion in the list and returns it
	 * PRECONDITIONS: there is a list
	 * 
	 *
	 * @param pos the pos of the item you want removed
	 
	 * @returns the item removed
	 */
	@Override
	public E remove(int pos) {
		if(pos <0 || pos >= size()){ // test to see if pos is valid if its not throw exception
			throw new IndexOutOfBoundsException();
	}
		if(pos == 0){ // if postion is 0
			head = head.getNext(); //increment the head pointer
		}else{
		
		Listnode<E> curr = head; // create a new pointer with location head
		for(int x =0; x<=pos-1 ; x++){
			curr = curr.getNext(); // get the correct position
		}
		E item = curr.getNext().getData(); // save the item at that postion
		if(curr.getNext().getNext() == null){ // if the item after that is null
			curr.setNext(null); // set the next to null
		}else{
		curr.setNext(curr.getNext().getNext()); // otherwise link the next node
		}
		return item; // return the item removed
		// TODO Auto-generated method stub
		}
		return null; // if no item found return null
		
	}
	/**
	 *this method returns the size of the list by traversing through it
	 *
	 * 
	 *
	 * @param none
	 * @return the size of the list
	 */
	@Override
	public int size() {
		Listnode<E> curr =head; //create a new pointer
		int num = 0; // create a variable to count the size
		while(curr.getNext() != null){ //whiel curr has an item
			curr = curr.getNext(); // traverse the list
			num++; // increment the count
		}
		// TODO Auto-generated method stub
		return num; //return the size of the list
	}
}
