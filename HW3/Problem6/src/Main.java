/**
 * Homework 3.6
 * 
 * Own Test implementations
 * 
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * 
 * @date 29/03/2018
 */
import java.io.FileNotFoundException;
import bhandari.hw03.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		
		// Testing the German -> English translation
		System.out.println("Testing German to English Translation:");
			// Instance of GermanEnglishTranslator
		GermanEnglishTranslator GermanToEnglish = new GermanEnglishTranslator();
		System.out.println("Your Translation: " + GermanToEnglish.translate("haarlos"));
		
		// Testing the French -> English translation
		System.out.println("Testing French to English Translation:");
			// Instance of FrenchEnglishTranslator
		FrenchEnglishTranslator FrenchToEnglish = new FrenchEnglishTranslator();
		System.out.println("Your Translation: " + FrenchToEnglish.translate("dériver"));		
	}
}