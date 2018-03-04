/**
 * This class is provides the main method to check which class sold the most cookies.
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
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
	 * For reading the slips, computation and deciding the winner class.
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
		
		/**Using getters to read the slips*/
		System.out.println("Starting the Computations.......\n");
		int [][] readValues = mySlip.getValues();
		
		/**Placing the identification number and the number of boxes in 2 different arrays*/
		for (int counter2 = 0; counter2 < number_of_slips; counter2++){
			int value_of_id = readValues[counter2][0];
			int value_of_boxes = readValues[counter2][1];
			drive.readBoxes[value_of_id-1] += value_of_boxes;
		}
		
		/**Determining the winner by going through the array*/
		int winnerClass = 0;
		for (int counter3 = 1; counter3 < drive.ID_RANGE; counter3++){
			if (drive.readBoxes[counter3] > drive.readBoxes[winnerClass]){
				winnerClass = counter3;
			}
		}
		System.out.println("The WINNER Class is: ");
		System.out.print(winnerClass+1);
		
		in.close();
	}
}
