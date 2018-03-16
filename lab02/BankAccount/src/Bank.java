/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 2
 * Created on: 12th March, 2018
 * Last Modified on: 16th March, 2018
 * This class represents a bank class with main.
 */
import java.util.Scanner;

public class Bank {
	public static final int HUNDRED = 100;
	/**
	 * @param args
	 */
	public static int validateInput(String amount){
		amount = amount.trim();
		if(amount.charAt(0) == '$'){
			amount = amount.substring(1, amount.length()-1);
		}
		if(amount.charAt(0) == '.'){
			amount = amount.substring(0, amount.length()-2);
		}
		int result = Integer.parseInt(amount);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your amount in decimal format: ");
		String amount = scanner.nextLine();
		System.out.println(Integer.parseInt(amount));	
		int result = validateInput(amount);
		SavingsAccount accountSave = new SavingsAccount();
		CheckingAccount accountCheck = new CheckingAccount();
		accountSave.setBalance(result);
		accountCheck.writeCheck(result);
		scanner.close();
	}

}
