/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 1, Problem 6
 * Created on: 2nd March, 2018
 * Last Modified on: 4th March, 2018
 * This class tests the Board class to emulate the checker .
 */


public class Test {
	/** Number of successfully passed test cases */
	int countSuccess = 0;
	/** Number of failed test cases */
	int countFailure = 0;
	
	/**
	 * Tests the basic functionality of {@link Board} class.
	 * @param args
	 */
	public static void main(String[] args) {
		final Test test = new Test();
		
		// Testing the creation of the Board and placeSymbol
		final Board checker1 = new Board(5);
		char[][] test_arr1 = new char[][]{
				  { '0', '0', '0', '0', '0' },
				  { '0', '0', '0', '0', '0' },
				  { '0', '0', '0', '0', '0' },
				  { '0', '0', '0', '0', '0' },
				  { '0', '0', '0', '0', '0' }
				};
		final Board checker2 = new Board(test_arr1, 5);
		checker1.placeSymbol('0');
		test.checkEquals(checker1, checker2);
		
		// Testing failure case
		checker2.placeValue('%', 4, 4);
		test.checkEquals(checker1, checker2);
		
		// Testing placeSymbols
		checker1.placeSymbols('1', '0');
		char[][] test_arr2 = new char[][]{
				  { '1', '0', '1', '0', '1' },
				  { '0', '1', '0', '1', '0' },
				  { '1', '0', '1', '0', '1' },
				  { '0', '1', '0', '1', '0' },
				  { '1', '0', '1', '0', '1' }
				};
		final Board checker3 = new Board(test_arr2, 5);
		test.checkEquals(checker1, checker3);
		
		//testing if the print method works
		
		System.out.println("Checker Board 1:");
		checker1.print();
		
		System.out.println("Checker Board 1:");
		checker3.print();
		
		//printing results
		System.out.println("Result:\n" + test.countSuccess +" successes.\n" + test.countFailure + " failures.");
	}
	
	/** 
	 * Checks if the given objects are equal and increments the number of according counter.
	 * @param o1 first object to be compared
	 * @param o2 second object to be compared
	 */
	private void checkEquals(final Object o1, final Object o2){
		try {
			assertEquals(o1, o2);
			countSuccess++;
		} catch (final Exception e){
			countFailure++;
			System.out.println("Failed to pass the case: " + e.getMessage());
		}
	}
	
	/**
	 * Compares if given objects are equals and if not, throws exception.
	 * Note: This function was rewritten instead of using the library due to some problems of 
	 * working with that Assert library.
	 * @param o1 first object to be compared
	 * @param o2 second object to be compared
	 * @throws Exception thrown in case if the given objects are not equals
	 */
	private void assertEquals(final Object o1, final Object o2) throws Exception{
		if (!o1.equals(o2)) throw new Exception("Given instances are not equal");
	}
}
