import java.util.Scanner;

/**
 * This class provides simple board class that emulates the checker board.
 * 
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 */

public class Board {
	
	/**
	 * square is a property of the class which is the multidimensional array.
	 * size is the property that denotes size of the board
	 */
	
	private char[][] square;
	private int size;
	
	/**
	 * Constructor to create a Board with the passed size.
	 * @param size 
	 * 
	 */
	public Board(final int size){
		this.size = size;
		square = new char[size][size];
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				square[i][j]='?';
			}
		}
	}
	
	/**
	 * Constructor to create a Board with the passed size and array.
	 * @param size 
	 * @param arr
	 */
	public Board(final char[][] arr, final int size){
		this.size = size;
		square = new char[size][size];
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				square[i][j]= arr[i][j];
			}
		}
	}
	
	/**
	 * method to check equality.
	 * @param o
	 * 
	 */
	@Override
	public boolean equals(Object o){
		if (o instanceof Board){
			final Board board = (Board) o;
			int check = 0;
			for(int i = 0; i < this.size; i++){
				for(int j = 0; j < this.size; j++){
					if(this.square[i][j] == board.square[i][j]){
						check++;
					}
				}
			}
			if(check == (this.size* this.size)) return true;
		}
		return false;
	}
	
	/**
	 * method to place a symbol into the Board.
	 * @param symbol 
	 * 
	 */
	public void placeSymbol(char symbol){
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				this.square[i][j] = symbol;
			}
		}
	}
	
	/**
	 * method to place two symbols alternately like in checker board into the Board.
	 * @param symbol1 
	 * @param symbol2
	 * 
	 */
	public void placeSymbols(char symbol1, char symbol2){
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				if(i % 2 == 0){
					square[i][j] = ((j % 2) == 0) ? symbol1 : symbol2;
				} else{
					square[i][j] = ((j % 2) == 0) ? symbol2 : symbol1;
				}
				
			}
		}
	}
	

	/**
	 * method to place a symbol in specific x and y position in the Board.
	 * @param symbol
	 * @param posx
	 * @param posy
	 * 
	 * @throws  ArrayIndexOutOfBoundsException if someone tries to access illegal position.
	 */
	public void placeValue(char symbol, int posx, int posy){
		while(true){
			if(posx >= size || posx < 0){
				System.out.println("Invalid index in row! Enter the correct index: ");
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				posx = sc.nextInt();
			} else if(posy >= size || posy < 0){
				System.out.println("Invalid index in column! Enter the correct index: ");
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				posy = sc.nextInt();
			} else{
				break;
			}
		} 
		square[posx][posy] = symbol;
	}
	
	/**
	 * method to print the contents of the Board.
	 * 
	 */
	public void print(){
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				System.out.print(square[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
