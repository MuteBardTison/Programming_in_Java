/**
 * Homework 3.6
 * 
 * Test implementations
 * 
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * 
 * @date 29/03/2018
 */
package progjv.hw03;

import java.io.*;
import java.util.Scanner;

import bhandari.hw03.FrenchEnglishTranslator;
import bhandari.hw03.GermanEnglishTranslator;

public class DictConsole {
	// property translator
	private Translator translator;

	public static void main(String[] args) {
		DictConsole dict = new DictConsole();
		
		System.out.println("-- Options for translating the language --");
		System.out.println("Press 1 to translate from German to English!");
		System.out.println("Press 2 to translate from French to English!");
		System.out.println("-----Note----");
		System.out.println("Format: noun, article");
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		// choice variable for translation choice!
		int choice = 0;
		try {
			choice = Integer.parseInt(in.nextLine());
			switch (choice) {
			case 1 : // German -> English
				dict.setTranslator(new GermanEnglishTranslator());
				dict.run();
				break;
			case 2: // French -> English
				dict.setTranslator(new FrenchEnglishTranslator());
				dict.run();
				break;
			default: 
				System.out.println("Warning! Integer chosen should be either 1 or 2!");
				break;
			}
		}
		// Catching exceptions:
		catch (NumberFormatException e){
			e.printStackTrace();
			System.exit(1);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Getter method for translator
	 * @return translator
	 */
	public Translator getTranslator() {
		return translator;
	}
	
	/**
	 * Setter method for translator
	 * @param translator
	 */
	public void setTranslator(Translator translator) {
		this.translator = translator;
	}
	
	/**
	 * Provided Run Method
	 * @throws IOException
	 */
	private void run() throws IOException {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String germanWord, englishWord;
		while (true) {
			System.out.print("Enter a word: ");
			germanWord = in.nextLine();
			englishWord = getTranslator().translate(germanWord);
			System.out.println(germanWord+" := "+englishWord);
		}
	}
}