import java.util.*;

/** 
 * Represents a single node in a General Tree
 * 
 * Each node has data and a list of children.
 * 
 * There is no limit to the number of children a node can have.
 * The list of children is ordered, but not sorted.
 * The first child added to the list is at index 0,
 * and so on for additional children that are added.
 * 
 * DO NOT EDIT OR HAND IN THIS CLASS
 */

public class TreeNode<T>{

	// FIELDS
    private T data;
    private ListADT<TreeNode<T>> children;

    // CONSTRUCTOR
    public TreeNode(T d){
        data = d;
        children = new LinkedList<TreeNode<T>>();
    }

    /**
     * Return the list of children.
     * @return children as a List
     */
    public ListADT<TreeNode<T>> getChildren(){
        return children;
    }

    /**
     * Add data as a new child TreeNode to this node.
     * @param the data
     */
    public void addChild(T data){
        TreeNode<T> child = new TreeNode<T>(data);
        children.add(child);
    }

    /**
     * Add a TreeNode as a new child TreeNode 
     * to this node.
     * @param a TreeNode with child data
     */
    public void addChild(TreeNode<T> child){
        children.add(child);
    }

    /**
     * Return the data value associated with
     * this node.  
     * @return the data for this node
     */
    public T getData(){
        return data;
    }

    /**
     * Change the data associated with this node.
     * @param the new data item for this node.
     */
    public void setData(T data){
        this.data = data;
    }

    /**
     * Return true if this node is a leaf node (has no children)
     */
    public boolean isLeaf(){
        return children.size() == 0;
    }
}
