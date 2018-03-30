import java.io.IOException;
import java.util.*;


/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 3 Problem 5
 * Created on: 30th March, 2018
 * Last Modified on: 30th March, 2018
 * Driver class for the class ProductRecords. Using it user can add, modify or find the
 * product records in the database. On every start the program restores the values from
 * the saved file and on every exit it stores them back to the file.
 */
public class Driver {

	/**
	 * Simple main function that repeatedly takes command from user and modifies the database.
	 * @throws IOException if something goes wrong when storing the database.
	 */
	public static void main(String[] args) throws IOException {
		final ProductRecords db = new ProductRecords();
		final Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("Enter command. 1 - add, 2 - find, 3 - modify, 4 quit");
			final int command = scan.nextInt();
			scan.nextLine();
			switch (command) {
			case 1:
				System.out.println("Enter the name of product:");
				final String name = scan.nextLine();
				System.out.println("Enter the quantity of product:");
				final int quantity = scan.nextInt();
				System.out.println("Enter the price of product:");
				final double price = scan.nextDouble();
				db.add(name, quantity, price);
				break;
			case 2:
				System.out.println("Enter the name of product:");
				final String findName = scan.nextLine();
				db.findProduct(findName);
				break;
			case 3:
				System.out.println("Enter the name of product:");
				final String nameModify = scan.nextLine();
				System.out.println("Enter the quantity of product:");
				final int quantityModify = scan.nextInt();
				System.out.println("Enter the price of product:");
				final double priceModify = scan.nextDouble();
				db.modifyProduct(nameModify, quantityModify, priceModify);
				break;
			case 4:
				System.out.println("Saving the data...");
				db.saveValues();
				scan.close();
				System.out.println("Exiting the program.");
				return;
			default:
				System.out.println("Invalid command!!!");
				break;
			}
		}
	}

}
