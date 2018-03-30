import java.io.*;
import java.util.*;

/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 3 Problem 3
 * Created on: 30th March, 2018
 * Last Modified on: 30th March, 2018
 * This class contains only the main function which is a simple program,
 * that takes a file name as command line input and counts the number of characters,
 * words and lines.
 */
public class WordCount {

	/**
	 * Program that counts the number of characters, words and lines in the input file.
	 * @param argv name of the input file.
	 * @throws IOException if it fails to close the reader.
	 */
	public static void main(String [] argv) throws IOException {
		if(argv.length != 1) throw new IllegalArgumentException("Should pass file name as parameter");
		BufferedReader in = null;
		try {
			in =  new BufferedReader(new FileReader("test.txt"));
			final StringBuilder contentBuffer = new StringBuilder();
			String str = "";
			while ( (str = in.readLine()) != null){
				contentBuffer.append(str);
				contentBuffer.append("\n");
			}
			final String content = contentBuffer.toString();
			int numOfChars = content.length() - 1;//last new line shouldn't count
			final Set<Character> uniqueChars = new HashSet<>();
			for(int i = 0; i < content.length(); i++){
				uniqueChars.add(content.charAt(i));
			}
			String[] words = content.split("[^a-zA-Z]");
			int numOfWords = 0;
			int numOfLines = content.split("\\n").length;
			final Set<String> uniqueWords = new HashSet<String>();
			for(String w : words){
				if(!w.isEmpty()){
					uniqueWords.add(w);
					numOfWords++;
				}
			}
			System.out.println(numOfChars + " characters (" + uniqueChars.size() + " different characters)");
			System.out.println(numOfWords + " words (" + uniqueWords.size() + " different words)");
			System.out.println(numOfLines + " lines");
		} catch(final IOException e){
			e.printStackTrace();
		} finally {
			if (in != null) in.close();
		} // end of finally
	} // end of main
	
}
