/**
 * 
 * @author Sabin Bhandari 30000374
 * @author Shikhat Karkee 30000394
 * @author Temirlan Ulugbek uulu 30000294
 * @author Zihan Qi 30000612
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
