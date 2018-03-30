/**
 * @author Sabin Bhandari 30000374
 * @author Shikhat Karkee 30000394
 * @author Temirlan Ulugbek uulu 30000294
 * @author Zihan Qi 30000612
 * Assignment 3, Problem 1
 * Created on: 29th March, 2018
 * Last Modified on: 30th March, 2018
 * This class provides the main function that reads a text file and computes the relative frequency of each of the letters of the
alphabet.
 */

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Frequency {

	/**
	 * @param args Main function
	 * @throws java.io.IOException in some circumstance
	 */
	
	public static void main(String[] args)  throws IOException{
		FileReader in = null;
		int[] frequencyStore = new int[26];
		try {
			System.out.println("Enter filename for the words: ");
			Scanner input = new Scanner(System.in);
			String filename = input.next();
			in = new FileReader(filename);
			int c; 
			while ((c = in.read()) != -1) {
				if (Character.isLetter(c)){
					frequencyStore[Character.toLowerCase(c) - 'a'] += 1;
				}
			}
			input.close();
		} finally {
			if(in != null) in.close();
		}
		System.out.println("Character and Frequency given below: \n");
		for (int i = 0; i < 26; i++){
			if (frequencyStore[i] != 0){
				System.out.println(Character.toString ((char) (i + 97)));
				System.out.println(" = ");
				System.out.println(frequencyStore[i]);
			}
		}
	}

}
