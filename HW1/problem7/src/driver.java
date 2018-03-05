/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 1, Problem 7
 * Created on: 2nd March, 2018
 * Last Modified on: 4th March, 2018
 * This class is provides the main method to check which class sold the most cookies.
 */
import java.util.Scanner;

public class driver{
	int ID_RANGE = 10;
	int TOTAL_SLIPS = 7;
	int [] identification_numbers = new int[TOTAL_SLIPS];
	int [] number_of_boxes_sold = new int[ID_RANGE];
	int [] readID = new int[TOTAL_SLIPS];
	int [] readBoxes = new int[ID_RANGE];
	/**
	 * For reading the slips and deciding the winner class.
	 * @param args Main function
	 */
	public static void main(String[] args) {
		final driver drive = new driver();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of sales slip: \n");
		int number_of_slips = in.nextInt();
		
		/** An instance of sales slip*/
		salesSlip mySlip = new salesSlip(number_of_slips);
		
		/** Taking input from the data for ID and number of boxes sold*/
		int counter1 = 0;
		while(counter1 < number_of_slips){
			System.out.println("Enter the identification number: \n");
			int id = in.nextInt();
			if (id > 10 || id < 1){
				System.out.println("Invalid identification number!\n");
			}
			else{
				System.out.println("Enter the number of boxes sold: \n");
				int number_of_boxes = in.nextInt();
				drive.identification_numbers[counter1] = id;
				drive.number_of_boxes_sold[counter1] = number_of_boxes;
				counter1++;
			}			
		}
		
		System.out.println("Setting values for the slip.......\n");
		mySlip.setValues(drive.identification_numbers, drive.number_of_boxes_sold);
		
		/**Using method to find the winner*/
		System.out.println("Starting the Computations.......\n");
		int winnerClass = mySlip.getWinner();
		
		
		System.out.println("The WINNER Class is: ");
		System.out.print(winnerClass+1);
		
		in.close();
	}
}
