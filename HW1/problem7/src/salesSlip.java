/**
 * This class is a tracking class where all tracking of the sales slip, the id number and the number of boxes is done.
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 */
import java.util.Arrays;
public class salesSlip {
	private int row;
	private int [][] values;
	
	//normal constructor
	public salesSlip(int row){
		this.row = row;
		this.values = new int[row][2];
	}
	
	//setter
	public void setValues(int [] id, int [] boxes_sold){
		for (int counter = 0; counter < this.row; counter++){
			this.values[counter][0] = id[counter];
			this.values[counter][1] = boxes_sold[counter];
		}
	}
	
	//getter
	public int[][] getValues(){
		return (int[][]) Arrays.copyOf(values, values.length);
	}
}
