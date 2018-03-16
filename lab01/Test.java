/**
 * This class tests the Fraction class.
 * 
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 */

public class Test {
	/** Number of successfully passed test cases */
	int countSuccess = 0;
	/** Number of failed test cases */
	int countFailure = 0;
	
	/**
	 * Tests the basic functionality of {@link Fraction} class.
	 * @param args
	 */
	public static void main(String[] args) {
		final Test test = new Test();
		// checking for logical equality
		test.checkEquals(new Fraction(2, 4), new Fraction(1, 2));
		// checking addition
		final Fraction add1 = new Fraction(1,3);
		final Fraction add2 = new Fraction(1,2);
		test.checkEquals(Fraction.add(add1, add2), new Fraction(5,6));
		// checking subtraction
		final Fraction minuend = new Fraction(1,2);
		final Fraction subtrahend = new Fraction(1,3);
		test.checkEquals(Fraction.subtract(minuend, subtrahend), new Fraction(1,6));
		// checking multiplication
		final Fraction mult1 = new Fraction(1,3);
		final Fraction mult2 = new Fraction(1,2);
		test.checkEquals(Fraction.multiply(mult1, mult2), new Fraction(1,6));
		// checking division
		final Fraction dividend = new Fraction(1,3);
		final Fraction divisor = new Fraction(1,2);
		test.checkEquals(Fraction.divide(dividend, divisor), new Fraction(2,3));
		
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
