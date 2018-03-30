/**
 * Homework 3.6
 * 
 * This is a class responsible for holding 2 Strings: a German word and its 
 * English translation.
 * 
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * 
 * @date 29/03/2018
 */
package bhandari.hw03;

public class DictEntry {
	// Word to be translated
	private String word;
	// Translation of the word
	private String translation; 
	
	/**
	 * @param newWord : String (the word to be translated)
	 * @param newTranslation : String (its translation)
	 */
	public DictEntry(String newWord, String newTranslation) {
		this.word = newWord;
		this.translation = newTranslation;
	}
	/**
	 * Setter method for word
	 * @param word : given word
	 */
	public void setWord(String word) {
		this.word = word;
	}
	/**
	 * Getter method for word
	 * @return : word of the entry of the dictionary
	 */
	public String getWord() {
		return word;
	}
	/**
	 * Setter method for translation
	 * @param translation : user given translation as parameter
	 */
	public void setTranslation(String translation) {
		this.translation = translation;
	}
	/**
	 * Getter method for translation
	 * @return : the required translation
	 */
	public String getTranslation() {
		return translation;
	}
}