import java.util.Scanner; //Import scanner to get user input

/**
 * This class creates two staircases (ascending and descending) based on user input
 * @version 0.1
 * @author Miro Bergam
 */

public class StairCases
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
  	for (int height = 0; height < size; height++) //measures the rows
  	{
		for (int length = 0; length < height + 1; length++)//measures the columns 
		{
			System.out.print("x ");
		}
		System.out.println();
	}
  }
  /**
   * Method prints a ascending staircase
   * @param size The int used to measure the height and width of the ascending staircase
   */
  public static void printDescending(int size)
  {
  	for (int height = size; height > 0; height = height- 1) //measures the rows
	{
		for (int length = height; length > 0; length = length - 1) //measures the columns
		{
			System.out.print("x "); 
		}
		System.out.println();
	}
  }



}
