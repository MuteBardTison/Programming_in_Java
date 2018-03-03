/**
 * This class represents a test class for MagicSquareChecker class
 * which test the functionalities of a checker instance
 * 
 * Naming accords to Google Java Style
 * 
 * @author Zihan Qi
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