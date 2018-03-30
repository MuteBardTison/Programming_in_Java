/**
 * Homework 3.6
 * 
 * This is a class responsible for translating from German to English (weeks).
 * 
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * 
 * @date 29/03/2018
 */
package progjv.hw03;

public class TinyTranslator {

	public String translate(String germanWord) {
		if ("Montag".equals(germanWord)) {
			return "monday";
		} else if ("Dienstag".equals(germanWord)) {
			return "tuesday";
		} else if ("Mittwoch".equals(germanWord)) {
			return "wednesday";
		}
		return null;
	}

}
