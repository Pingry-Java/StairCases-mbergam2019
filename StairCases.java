import java.util.Scanner; //Import scanner to get user input

/**
 * This class creates two staircases (ascending and descending) based on user input recursively
 * @version 1.0
 * @author Miro Bergam
 */

public class StairCases //same name as doc
{	
	/**
	* Main method demonstrates the other two methods by calling each of them.
	* @param args Standard array of commandline String arguments. Not used in this program.
	*/

	public static void main(String[] args)
	{
		Scanner keys = new Scanner(System.in); //establishes scanner
		System.out.println("What size do you want your staircases to be?"); 
		int size = keys.nextInt();  //saves the player's size in the variable "size"

		printAscending(size); //calls the ascending staircase method
		printDescending(size);//calls the descending staircase method
	}
	/**
	* Method prints a descending staircase
	* @param size The int used to measure the height and width of the descending staircase
   */
	public static void printAscending(int size)
	{
		if (size > 0)
			printAscending(size-1);
		for (int n = 0; n < size; n++)
		{
			System.out.print("X");
		}
		System.out.println();
	}
  /**
   * Method prints a ascending staircase
   * @param size The int used to measure the height and width of the ascending staircase
   */
	public static void printDescending(int size)
	{
		for (int n = 0; n < size; n++)
		{
			System.out.print("X");
		}
		System.out.println();
		if (size > 0)
			printDescending(size-1);
	}


} //close public class
