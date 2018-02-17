public class Fraction {
    private int numerator;
    private int denominator;

    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b) {
            if (a > b) a = a - b; 
            else b = b - a;
        }
        return a; 
    }
    public static Fraction reduce(Fraction fractionOne) {
        if (fractionOne.numerator == 0) {
            fractionOne.denominator = 1;
            return fractionOne;
        }
        int gcdNum = gcd(fractionOne.numerator, fractionOne.denominator);
        
        fractionOne.numerator = fractionOne.numerator / gcdNum;
        fractionOne.denominator = fractionOne.denominator / gcdNum;
        return fractionOne;
    }
    public Fraction(int num, int den) {
        if (den == 0){
            throw new IllegalArgumentException("The denominator is zero.");
        }
        numerator = num;
        denominator = den;
    }
    @Override
    public boolean equals(Object o) {
        if ( o instanceof Fraction) {
            Fraction fraction2 = (Fraction) o;

        }
        if (divide(this, (Fraction)o).numerator / divide(this, (Fraction)o).denominator 
        == (int)(divide(this, (Fraction)o).numerator / divide(this, (Fraction)o).denominator)){
            return true;
        }
        else return false;
    }
    @Override
    public String toString() {
        if(denominator!=1)
            return numerator + "/" + denominator;
        else
            return numerator + "";
    }
    public static Fraction add(Fraction fractionOne, Fraction fractionTwo) {
        return reduce(new Fraction(fractionOne.numerator * fractionTwo.denominator + fractionOne.denominator * fractionTwo.numerator,
        fractionOne.denominator * fractionTwo.denominator));
    }
    public static Fraction substract(Fraction fractionOne, Fraction fractionTwo) {
        return reduce(new Fraction(fractionOne.numerator * fractionTwo.denominator - fractionOne.denominator * fractionTwo.numerator,
        fractionOne.denominator * fractionTwo.denominator));
    }
    public static Fraction multiply(Fraction fractionOne, Fraction fractionTwo) {
        return reduce(new Fraction(fractionOne.numerator * fractionTwo.numerator, fractionOne.denominator * fractionTwo.denominator));
    }
    public static Fraction divide(Fraction fractionOne, Fraction fractionTwo) {
        return reduce(new Fraction(fractionOne.numerator * fractionTwo.denominator, fractionOne.denominator * fractionTwo.numerator));
    }
   
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(4, 6);
        System.out.println(add(f1, f2));
        System.out.println(substract(f1, f2));
        System.out.println(multiply(f1, f2));
        System.out.println(divide(f1, f2));
        System.out.println(f1.equals(f2));
    }
}