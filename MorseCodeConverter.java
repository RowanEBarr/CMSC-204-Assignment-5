import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/** 
 * This is a class that takes either a string of morse code or a file that contains
 * morse code and converts it into english. It also prints out the MorseCodeTree
 * that this class uses to translate the code.
 * 
 * @author Rowan Barr
 *
 */
public class MorseCodeConverter {

	static MorseCodeTree tree = new MorseCodeTree();
	
	/**converts morse code from inside a file into an english string
	 * 
	 * @param input A file containing morse code
	 * @return The english translation of the code inside the file
	 * @throws FileNotFoundException
	 */
	public static String convertToEnglish(File input) throws FileNotFoundException {	
		Scanner sc;
		if (input!=null) {
			sc = new Scanner(input);
		}
		else
		{
			throw new FileNotFoundException();
		}
		String englishString = "";
		String codeString = "";
		while (sc.hasNextLine())
		{
			codeString += sc.nextLine();
		}
		
		String[] array = codeString.split(" ");
		for (int i = 0; i < array.length;i++)
		{
			if (array[i].contentEquals("/"))
			{
				englishString+= " ";
			}
			else
			{
				englishString += tree.fetch(array[i]);
			}
				
		}
		return englishString;
	}

	/**converts the tree of letters used to translate morse code into a string
	 * of letters (in inorder traversal order)
	 * @return a string of the letters in the tree in inorder order
	 */
	public static String printTree() {
		String printTree = "";
		ArrayList list = tree.toArrayList();
		for (int i = 0; i < list.size();i++)
		{
			printTree += " " + list.get(i);
				
		}
		return printTree;
	}

	/**converts a string of morse code into an english string
	 * 
	 * @param string a string of morse code
	 * @return a string of the english translation of the code
	 */
	public static String convertToEnglish(String string) {
		
		String englishString = "";
		String[] array = string.split(" ");
		for (int i = 0; i < array.length;i++)
		{
			if (array[i].contentEquals("/"))
			{
				englishString+= " ";
			}
			else
			{
				englishString += tree.fetch(array[i]);
			}
				
		}
		return englishString;
	}

}
