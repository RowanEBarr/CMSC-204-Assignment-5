import java.util.ArrayList;

/** 
 * This is a class that builds a tree to convert letters to morse code
 * and vice versa. It builds a tree that has left corresponding to dot
 * and right to dash, and as you move down the tree, letters are stored in
 * the correct position according to the dots and dashes of morse code.
 * You can fetch a specific letter from the tree with its code, and also
 * access a list of the letters in Inorder traversal order.
 * 
 * @author Rowan Barr
 *
 */
public class MorseCodeTree <T> implements LinkedConverterTreeInterface{

	private TreeNode<String> root = new TreeNode("");
	public MorseCodeTree tree;
	private String alphabet = null;
	
	/**
	 * Creates a new MorseCodeTree by calling the buildTree method
	 * 
	 */
	public MorseCodeTree()
	{
		buildTree();
	}

	/**
	 * Returns a reference to the root
	 * @return reference to root
	 */
	public TreeNode<String> getRoot()
	{
		return root;
	}
	
	/**
	 * sets the root of the Tree
	 * @param newNode a TreeNode<T> that will be the new root
	 */
	public void setRoot(TreeNode newNode)
	{
		TreeNode<String> newNodeCopy = newNode;
		root = newNodeCopy;
	}
	
	/**
	 * Adds result to the correct position in the tree based on the code
	 * This method will call the recursive method addNode
	 * 
	 * @param code the code for the new node to be added
	 * @return the MorseCodeTree with the new node added
	 */
	public MorseCodeTree insert(String code, String letter) {
		addNode(root, code, letter);
		return tree;
	}
	
	/**
	 * This is a recursive method that adds element to the correct position 
	 * in the tree based on the code.
	 * 
	 * @param root the root of the tree
	 * @param code the code for this particular recursive instance of addNode
	 * @param letter the data of the new TreeNode to be added
	 */
	public void addNode(TreeNode root, String code, String letter) {
		if (code.length() == 1)
		{
			if (code.charAt(0) == '.')
			{
				root.getLChild().setData(letter);
			}
			if (code.charAt(0) == '-')
			{
			
				root.getRChild().setData(letter);
			}
		}
		else
		{
			if (code.charAt(0) == '.')
			{
				root = root.getLChild();
				addNode(root, code.substring(1, code.length()),letter);
			}
			if (code.charAt(0) == '-')
			{
				root = root.getRChild();
				addNode(root, code.substring(1, code.length()),letter);
			}
		}
		
	}

	/**
	 * Fetch the data in the tree based on the code
	 * This method will call the recursive method fetchNode
	 * 
	 * @param code the code that describes the traversals within the tree
	 * @return the result that corresponds to the code
	 */
	public String fetch(String code) {
		return fetchNode(root,code);
	}

	/**
	 * This is the recursive method that fetches the data of the TreeNode
	 * that corresponds with the code
	 * 
	 * @param root the root of the tree 
	 * @param code the code for this particular recursive instance of fetchNode
	 * @return the data corresponding to the code
	 */
	public String fetchNode(TreeNode<String> root, String code) {
		if (code.length() == 1)
		{
			if (code.charAt(0) == '.')
			{
				alphabet = root.getLChild().getData();
			}
			if (code.charAt(0) == '-')
			{
				alphabet = root.getRChild().getData();
			}
		}
		else
		{
			if (code.charAt(0) == '.')
			{
				root = root.getLChild();
				fetchNode(root, code.substring(1, code.length()));
			}
			if (code.charAt(0) == '-')
			{
				root = root.getRChild();
				fetchNode(root, code.substring(1, code.length()));
			}
		}
		return alphabet;
	}

	/**
	 * This operation is not supported
	 * @param data data of node to be deleted
	 * @return reference to the current tree
	 * @throws UnsupportedOperationException
	 */
	public  MorseCodeTree delete(String data) throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

	/**
	 * This operation is not supported for a LinkedConverterTree
	 * @return reference to the current tree
	 * @throws UnsupportedOperationException
	 */
	public  MorseCodeTree update() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

	/**
	 * This method builds the LinkedConverterTree by inserting TreeNodes<T>
	 * into their proper locations
	 * 
	 */
	public void buildTree() {
		root.setData("");
		root.setLChild("");
		root.setRChild("");
		root.getLChild().setLChild("");
		root.getLChild().setRChild("");
		root.getRChild().setLChild("");
		root.getRChild().setRChild("");
		root.getLChild().getLChild().setLChild("");
		root.getLChild().getLChild().setRChild("");
		root.getLChild().getRChild().setLChild("");
		root.getLChild().getRChild().setRChild("");
		root.getRChild().getLChild().setLChild("");
		root.getRChild().getLChild().setRChild("");
		root.getRChild().getRChild().setLChild("");
		root.getRChild().getRChild().setRChild("");
		root.getLChild().getLChild().getLChild().setLChild("");
		root.getLChild().getLChild().getLChild().setRChild("");
		root.getLChild().getLChild().getRChild().setLChild("");
		root.getLChild().getLChild().getRChild().setRChild("");
		root.getLChild().getRChild().getLChild().setLChild("");
		root.getLChild().getRChild().getLChild().setRChild("");
		root.getLChild().getRChild().getRChild().setLChild("");
		root.getLChild().getRChild().getRChild().setRChild("");
		root.getRChild().getLChild().getLChild().setLChild("");
		root.getRChild().getLChild().getLChild().setRChild("");
		root.getRChild().getLChild().getRChild().setLChild("");
		root.getRChild().getLChild().getRChild().setRChild("");
		root.getRChild().getRChild().getLChild().setLChild("");
		root.getRChild().getRChild().getLChild().setRChild("");
		root.getRChild().getRChild().getRChild().setLChild("");
		root.getRChild().getRChild().getRChild().setRChild("");
		insert (".-","a");
		insert ("-...","b");
		insert ("-.-.","c");
		insert ("-..","d");
		insert (".","e");
		insert ("..-.","f");
		insert ("--.","g");
		insert ("....","h");
		insert ("..","i");
		insert (".---","j");
		insert ("-.-","k");
		insert (".-..","l");
		insert ("--","m");
		insert ("-.","n");
		insert ("---","o");
		insert (".--.","p");
		insert ("--.-","q");
		insert (".-.","r");
		insert ("...","s");
		insert ("-","t");
		insert ("..-","u");
		insert ("...-","v");
		insert (".--","w");
		insert ("-..-","x");
		insert ("-.--","y");
		insert ("--..","z");
		
	}

	/**
	 * Returns an ArrayList of the items in the MorseCodeTree in LNR (Inorder) Traversal order
	 * Used for testing to make sure tree is built correctly
	 * @return an ArrayList of the items in the tree
	 */
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<String>();
		LNRoutputTraversal(root, list);
		return list;
	}

	/**
	 * The recursive method to put the contents of the tree in an ArrayList<T> 
	 * LNR (Inorder)
	 * @param root the root of the tree for this particular recursive instance
	 * @param list the ArrayList that will hold the contents of the tree in LNR order
	 */
	public void LNRoutputTraversal(TreeNode root, ArrayList list) {
		list.add(root.getLChild().getLChild().getLChild().getLChild().getData());
		list.add(root.getLChild().getLChild().getLChild().getData());
		list.add(root.getLChild().getLChild().getLChild().getRChild().getData());
		list.add(root.getLChild().getLChild().getData());
		list.add(root.getLChild().getLChild().getRChild().getLChild().getData());
		list.add(root.getLChild().getLChild().getRChild().getData());
		list.add(root.getLChild().getData());
		list.add(root.getLChild().getRChild().getLChild().getLChild().getData());
		list.add(root.getLChild().getRChild().getLChild().getData());
		list.add(root.getLChild().getRChild().getData());
		list.add(root.getLChild().getRChild().getRChild().getLChild().getData());
		list.add(root.getLChild().getRChild().getRChild().getData());
		list.add(root.getLChild().getRChild().getRChild().getRChild().getData());
		list.add(root.getData());
		list.add(root.getRChild().getLChild().getLChild().getLChild().getData());
		list.add(root.getRChild().getLChild().getLChild().getData());
		list.add(root.getRChild().getLChild().getLChild().getRChild().getData());
		list.add(root.getRChild().getLChild().getData());
		list.add(root.getRChild().getLChild().getRChild().getLChild().getData());
		list.add(root.getRChild().getLChild().getRChild().getData());
		list.add(root.getRChild().getLChild().getRChild().getRChild().getData());
		list.add(root.getRChild().getData());
		list.add(root.getRChild().getRChild().getLChild().getLChild().getData());
		list.add(root.getRChild().getRChild().getLChild().getData());
		list.add(root.getRChild().getRChild().getLChild().getRChild().getData());
		list.add(root.getRChild().getRChild().getData());
		list.add(root.getRChild().getRChild().getRChild().getData());	
	}
}
