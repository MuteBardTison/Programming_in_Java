/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 2
 * Created on: 12th March, 2018
 * Last Modified on: 16th March, 2018
 * This class represents a checking account class.
 */

public class CheckingAccount extends BankAccount {
	public String dollarsToWords(int dollarValue){
		String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"
        };
        String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
		if(dollarValue < 20){
			return ones[dollarValue];
		} else {
			if(dollarValue%10 == 0){
				return tens[dollarValue/10];
			}
			return tens[dollarValue/10]+ones[dollarValue%10];
		}
	}

	public String writeCheck(int cents){
		if(withdraw(cents) == false){
			return "INSUFFUCIENT FUNDS";
		}
		if(cents < 100){
			return cents + " CENTS.";
		}
		int dollarValue = cents/10;
		int centValue = cents%10;
		String result = dollarsToWords(dollarValue);
		if(centValue != 0){
			return result + centValue + " CENTS.";
		} else {
			return result;
		}
	}
}