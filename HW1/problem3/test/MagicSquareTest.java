/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 1, Problem 3
 * Created on: 2nd March, 2018
 * Last Modified on: 4th March, 2018
 * 
 * This class represents a test class for MagicSquareChecker class
 * which test the functionalities of a checker instance
 */

import java.util.Scanner;

public class MagicSquareTest{
    /**
	 * Tests functionalities of {@link MagicSquareChecker} class.
	 * @param args command line arguments
	 */
    public static void main(String[] args) {
        final int sideLength = 3;
        int[][] magicSquare = new int[sideLength][sideLength];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < sideLength; ++i) {
            for(int j = 0; j < sideLength; ++j) {
                magicSquare[i][j] = scanner.nextInt();
            }
        }

        MagicSquareChecker checker = new MagicSquareChecker();
        checker.printCheck(sideLength, magicSquare);
        scanner.close();
    }
}