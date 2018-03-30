/**
 * Homework 3.6
 * 
 * This is a class responsible for translating from German to French.
 * 
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * 
 * @date 29/03/2018
 */

package bhandari.hw03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import progjv.hw03.Translator;

public class FrenchEnglishTranslator implements Translator {
	// Dictionary as map.
	private Map<String,String> dict;
	/**
	 * Constructor for reading data from the file, creates entries in dictionary 
	 *  and stores them in a HashMap.
	 * @throws FileNotFoundException
	 */
	public FrenchEnglishTranslator() throws FileNotFoundException {
		dict = new HashMap<String, String>();
		BufferedReader inFile = new BufferedReader(new FileReader("../src/fr2en.txt"));
		String line;
		try {
			try {
				// Reading the file line by line until null character is obtained 
				while ((line = inFile.readLine()) != null) {
					
					// The German and English words are separated by --.
					String[] words = line.split("--");
					
					// Eliminating the empty spaces at the end of both the words.
					String frenchWord = words[0].trim();
					String englishWord = words[1].trim();
					
					// The entry of dictionary with German and English word.
					DictEntry dictEntry = new DictEntry(frenchWord, englishWord);
					
					// Adding the words to the dictionary.
					dict.put(dictEntry.getWord(), dictEntry.getTranslation());
				}

			}
			// Closing file after completion of work.
			finally {
				inFile.close();
			}
		}				
		// Catching IOExceptions	
		catch (IOException e ) {
			System.out.println(e.getMessage());
		}
	}
	/** Finds the English translation
	 * @return returns the translated word
	 */
	public String translate(String sourceWord) {
		return dict.get(sourceWord);
	}

}
