/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 2 Problem 2
 * Created on: 18th March, 2018
 * Last Modified on: 18th March, 2018
 * This class is used for testing the FederalState class.
 */
public class TestFederalState {

	/**
	 * Gets and prints some instances of Federal state class.
	 * @param args
	 */
	public static void main(String[] args) {
		// The following will not compile
		//final FederalState bremen = new FederalState("Bremen");
		
		// However the following works fine
		final FederalState bremen = FederalState.getState("Bremen");
		System.out.print("Succesfully got the state " + bremen.getName());
	}

}
