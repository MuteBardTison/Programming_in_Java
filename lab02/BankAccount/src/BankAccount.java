/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 2
 * Created on: 12th March, 2018
 * Last Modified on: 16th March, 2018
 * This class represents a bank account object which is an abstract class
 */

public abstract class BankAccount {

	/**
	 * @param args
	 */
	private int balance;
	
	public BankAccount(){
		this.balance = 0;
	}
	public BankAccount(int value){
		this.balance = value;
	}
	
	public int getBalance(){
		return this.balance;
	}
	public void setBalance(int value){
		this.balance = value;
	}
	
	public void printAmount(){
		float value = this.balance/100;
		System.out.println("$"+value);
	}

	public void deposit(int cents){
		this.balance += cents;
	}
	public boolean withdraw(int cents){
		if(this.balance < cents){
			return false;
		}
		this.balance -= cents;
		return true;
	}
	public int balance(){
		return this.balance;
	}
	public static boolean transfer(int cents, BankAccount fromAccount, BankAccount toAccount){
		fromAccount.withdraw(cents);
		toAccount.deposit(cents);
		return true;
	}
}
