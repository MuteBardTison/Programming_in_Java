/**
 * This class provides simple Fraction class with basic operations.
 * 
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 */
public class Fraction {
	
	/** Numerator of the Fraction */
	private int numerator;
	/** Denominator of the Fraction */
	private int denominator;
	
	/**
	 * Constructor to create a Fraction.
	 * @param numerator
	 * @param denominator (which can not be zero)
	 * 
	 * @throws IllegalArgumentException in case if denominator is zero
	 */
	public Fraction(final int numerator, final int denominator){
		if (denominator == 0)
			throw new IllegalArgumentException("Denominator can't be zero");
		final int gcd = gcd(numerator, denominator);
		this.numerator = numerator/gcd;
		this.denominator = denominator/gcd;
	}
	
	/**
	 * This method adds two fractions passed as argument and returns the result.
	 * @param fraction1 addend 1
	 * @param fraction2 addend 2
	 * @return the sum of two fractions
	 */
	public static Fraction add(final Fraction fraction1, final Fraction fraction2){
		final int resultNum = fraction1.numerator*fraction2.denominator + fraction1.denominator*fraction2.numerator;
		final int resultDen = fraction1.denominator*fraction2.denominator;
		return new Fraction(resultNum, resultDen);
	}
	
	/**
	 * This method subtracts second argument from the first and returns the result.
	 * @param fraction1 minuend
	 * @param fraction2 subtrahend
	 * @return the difference of two fractions
	 */
	
	public static Fraction subtract(final Fraction fraction1, final Fraction fraction2){
		final int resultNum = fraction1.numerator*fraction2.denominator - fraction1.denominator*fraction2.numerator;
		final int resultDen = fraction1.denominator*fraction2.denominator;
		return new Fraction(resultNum, resultDen);
	}
	
	/**
	 * This method multiplies two fractions passed as argument and returns the product.
	 * @param fraction1 multiplicand 1
	 * @param fraction2 multiplicand 2
	 * @return the product of two fractions
	 */
	
	public static Fraction multiply(final Fraction fraction1, final Fraction fraction2){
		final int resultNum = fraction1.numerator*fraction2.numerator;
		final int resultDen = fraction1.denominator*fraction2.denominator;
		return new Fraction(resultNum, resultDen);
	}
	
	/**
	 * This method divides two fractions passed as argument and returns the result.
	 * @param fraction1 dividend
	 * @param fraction2 divisor
	 * @return the division of two fractions
	 */
	
	public static Fraction divide(final Fraction fraction1, final Fraction fraction2){
		final int resultNum = fraction1.numerator*fraction2.denominator;
		final int resultDen = fraction1.denominator*fraction2.numerator;
		return new Fraction(resultNum, resultDen);
	}
	
	/**
	 * This method computes the greatest common divisor of passed two number
	 * @param a first number
	 * @param b second number
	 * @return the gcd of two numbers
	 */
	public final static int gcd(int a, int b){
		a = Math.abs(a);
		b = Math.abs(b);
		while(a!= b){
			if (a > b) a = a - b;
			else b = b - a;
		}
		return a;
	}
	
	@Override
	public boolean equals(Object o){
		if (o instanceof Fraction){
			final Fraction fraction = (Fraction) o;
			return (this.numerator == fraction.numerator) && (this.denominator == fraction.denominator);
		}
		return false;
	}
}
