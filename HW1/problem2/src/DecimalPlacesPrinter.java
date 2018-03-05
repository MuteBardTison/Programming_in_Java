/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 1, Problem 2
 * Created on: 2nd March, 2018
 * Last Modified on: 4th March, 2018
 * This class represents a decimal places printer
 */

public class DecimalPlacesPrinter{
    private double number;          //number to print
    private int decimalPlaces;      //decimal places of number to print

    /**
     * Constructor of DecimalPlacesPrinter instance
     * @param number number to print
     * @param decimalPlaces decimal places of number to print
     */
    public DecimalPlacesPrinter(double number, int decimalPlaces) {
        this.number = number;
        this.decimalPlaces = decimalPlaces;
    }

    /**
     * printing function 
     * which print decimal number according to its decimal places
     */
    public void print() {
        double number = this.number;
        /* determine length of the integer part*/
        System.out.print((int)number);
        System.out.print(this.decimalPlaces == 0 ? "" : ".");
        number = number < 0 ? -number : number;
        for(int i = 0; i < this.decimalPlaces; ++i) {
            number /= 0.1;
            System.out.print((int)number % 10);
        }
        System.out.println();
    }
}