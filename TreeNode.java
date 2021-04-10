/** 
 * This is a generic class that creates a tree node that holds data and
 * a reference to a left child node and a right child node.
 * 
 * @author Rowan Barr
 *
 */
public class TreeNode<T> {

	private T data;
	private TreeNode<T> lChild;
	private TreeNode<T> rChild;
	
	/**creates a new node with the data and the two child nodes set to null
	 * @param nodeData the data to be stored in the node
	 */
	public TreeNode (T nodeData)
	{
		data = nodeData;
		lChild = null;
		rChild = null;
	}
	
	/**creates a copy of an existing node
	 * @param tNode the node to be copied
	 */
	public TreeNode (TreeNode<T> tNode)
	{
		lChild = tNode.getLChild();
		rChild = tNode.getRChild();
		data = tNode.data;
	}

	/**returns the data in the node
	 * 
	 * @return the data in the node
	 */
	public T getData()
	{
		return data;
	}
	
	/**sets the data in the node
	 * 
	 * @param nodeData the data to be stored in the node
	 */
	public void setData(T nodeData)
	{
		data = nodeData;
	}
	
	/**sets the data in the left child
	 * 
	 * @param nodeData the data to be stored in the left child
	 */
	public void setLChild(T nodeData)
	{
		lChild = new TreeNode(nodeData);
	}
	
	/**sets the data in the right child
	 * 
	 * @param nodeData the data to be stored in the right child
	 */
	public void setRChild(T nodeData)
	{
		rChild = new TreeNode(nodeData);
	}
	
	/**returns the left child of the node
	 * 
	 * @return the left child node
	 */
	public TreeNode <T> getLChild()
	{
		
		return lChild;
	}
	
	/**returns the right child of the node
	 * 
	 * @return the right child node
	 */
	public TreeNode <T> getRChild()
	{
		return rChild;
	}
}
