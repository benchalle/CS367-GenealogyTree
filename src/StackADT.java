import java.util.EmptyStackException;

/** 
 * A First In Last Out data structure that also
 * provides a method to return the stack in 
 * reverse order.
 * 
 * DO NOT EDIT OR HAND IN THIS INTERFACE
 */

public interface StackADT<T> {

    /** return true iff if this Stack is empty */
	boolean isEmpty();

    /** 
     * Add the data item to top of the Stack.
     * If data is null, throw IllegalArgumentException
     */
	void push(T data) throws IllegalArgumentException;

    /** 
     * Returns the element from the top of Stack,
     * without removing it from the stack.
     * 
     * If the stack is empty, throws java.util.EmptyStackException
     */
	T peek() throws EmptyStackException;
	
    /** 
     * Returns and removes the element from the top of Stack,
     * 
     * If the stack is empty, throws java.util.EmptyStackException
     */
	T pop() throws EmptyStackException;

	/** 
	 * Creates a new Stack with the items of this stack
	 * in the reverse order.  
	 * The items in this stack remainin in the same order.
	 *   
	 * If this stack is empty, the reverse order stack is also empty.
	 */
	StackADT<T> reverse();

}
