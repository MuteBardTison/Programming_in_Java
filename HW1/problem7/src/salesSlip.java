/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 1, Problem 7
 * Created on: 2nd March, 2018
 * Last Modified on: 4th March, 2018
 * This class is a tracking class where all tracking of the sales slip, the id number and the number of boxes is done and winner class is computed.
 */
import java.util.Arrays;
public class salesSlip {
	private int row;
	private int [][] values;
	
	/**normal constructor
	 * @param row Takes number of slips to create an array with row rows
	 * */
	public salesSlip(int row){
		this.row = row;
		this.values = new int[row][2];
	}
	
	/**setter
	 * @param id Array for storing identification numbers
	 * @param boxes_sold Array for storing number of boxes sold
	 * */
	public void setValues(int [] id, int [] boxes_sold){
		for (int counter = 0; counter < this.row; counter++){
			this.values[counter][0] = id[counter];
			this.values[counter][1] = boxes_sold[counter];
		}
	}
	
	/**getter
	 * @return returns a copy of 2D array values
	 * */
	public int[][] getValues(){
		return (int[][]) Arrays.copyOf(values, values.length);
	}
	
	/**method for winner computation
	 * @return returns the class with highest number of boxes sold
	 * */
	public int getWinner(){
		int ID_RANGE = 10;
		int [] readBoxes = new int[ID_RANGE];
		/**Placing the identification number and the number of boxes in 2 different arrays*/
		for (int counter2 = 0; counter2 < this.row; counter2++){
			int value_of_id = this.values[counter2][0];
			int value_of_boxes = this.values[counter2][1];
			readBoxes[value_of_id-1] += value_of_boxes;
		}
		
		/**Determining the winner by going through the array*/
		int winnerClass = 0;
		for (int counter3 = 1; counter3 < ID_RANGE; counter3++){
			if (readBoxes[counter3] > readBoxes[winnerClass]){
				winnerClass = counter3;
			}
		}
		return winnerClass;
	}
}
