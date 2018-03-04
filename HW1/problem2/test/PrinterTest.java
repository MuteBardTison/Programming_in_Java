/**
 * This class represents a test class for DecimalPlacesPrinter class
 * which test the functionalities of a printer instance
 * 
 * @author Zihan Qi
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 */

//package test;
//import src.DecimalPlacesPrinter;

public class PrinterTest{
    /**
	 * Tests functionalities of {@link DecimalPlacesPrinter} class.
	 * @param args command line arguments
	 */
    public static void main(String[] args) {
        final double numberOne = 1349.9431;
        final double numberTwo = 0;
        final double numberThree = -1234.5678;
        final double numberFour = 1024;
        final double numberFive = -2;
        /* test positive number with decimal part */
        DecimalPlacesPrinter printerOne = new DecimalPlacesPrinter(numberOne, 3);
        printerOne.print();
        DecimalPlacesPrinter printerTwo = new DecimalPlacesPrinter(numberOne, 2);
        printerTwo.print();
        DecimalPlacesPrinter printerThree = new DecimalPlacesPrinter(numberOne, 1);
        printerThree.print();
        /* test decimal place value of 0 */
        DecimalPlacesPrinter printerFour = new DecimalPlacesPrinter(numberOne, 0);
        printerFour.print();

        /* test zero */
        printerOne = new DecimalPlacesPrinter(numberTwo, 3);
        printerOne.print();
        printerTwo = new DecimalPlacesPrinter(numberTwo, 2);
        printerTwo.print();
        printerThree = new DecimalPlacesPrinter(numberTwo, 1);
        printerThree.print();

        /* test negative number with decimal part */
        printerOne = new DecimalPlacesPrinter(numberThree, 3);
        printerOne.print();
        printerTwo = new DecimalPlacesPrinter(numberThree, 2);
        printerTwo.print();
        printerThree = new DecimalPlacesPrinter(numberThree, 1);
        printerThree.print();

        /* test positive number without decimal part */
        printerOne = new DecimalPlacesPrinter(numberFour, 3);
        printerOne.print();
        printerTwo = new DecimalPlacesPrinter(numberFour, 2);
        printerTwo.print();
        printerThree = new DecimalPlacesPrinter(numberFour, 1);
        printerThree.print();

        /* test negative number without decimal part */
        printerOne = new DecimalPlacesPrinter(numberFive, 3);
        printerOne.print();
        printerTwo = new DecimalPlacesPrinter(numberFive, 2);
        printerTwo.print();
        printerThree = new DecimalPlacesPrinter(numberFive, 1);
        printerThree.print();
    }
}