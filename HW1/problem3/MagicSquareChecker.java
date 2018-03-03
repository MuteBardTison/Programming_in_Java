/**
 * This class represents a magic square
 * which is an 𝑁 × 𝑁 matrix of numbers 
 * in which every number from 1 to 𝑁^2 
 * must appear just once and every row, 
 * column and diagonal must add up to the same total
 * 
 * Naming accords to Google Java Style
 * 
 * @author Zihan Qi
 */

public class MagicSquareChecker{

    public boolean CheckMagicSquare(int sideLength, int[][] magicSquare) {
        int rowSum = 0, colSum = 0, mainDiagSum = 0, antiDiagSum = 0, index = 0;
        int[] sumArray = new int[2 * (sideLength + 1)];

        for(int i = 0; i < sideLength; ++i) {
            for(int j = 0; j < sideLength; ++j) {
                if(i == j) mainDiagSum += magicSquare[i][j];
                if(i + j == sideLength - 1) antiDiagSum += magicSquare[i][j];
                rowSum += magicSquare[i][j];
                colSum += magicSquare[j][i];
            }
            sumArray[index++] = rowSum;
            sumArray[index++] = colSum;
            rowSum = 0;
            colSum = 0;
        }
        sumArray[index++] = mainDiagSum;
        sumArray[index] = antiDiagSum;

        for(int val: sumArray) {
            if(val != sumArray[0])
                return false;
        }
        return true;
    }

    public void printCheck(int sideLength, int[][] magicSquare) {
        boolean isMagicSquare = CheckMagicSquare(sideLength, magicSquare);
        String message = isMagicSquare ? "This is a magic square" : "This is not a magic square";
        System.out.println(message);
    }
}