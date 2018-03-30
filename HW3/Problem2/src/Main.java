/**
 * Homework 3.2
 * 
 * This program copies files recursively from a directory to another directory, 
 * keeping the directory structure. The user may specify a file type to copy only files with a 
 * certain extension (e.g., .txt or .java). If no extension is given as the 3rd argument, all 
 * files will be copied recursively.
 * 
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * 
 * @date 29/03/2018
 */
import java.io.File;
import java.io.IOException;

public class Main {
	/**
	 * Function to display information about structure of command
	 */
	private static void structPrint(){
		System.out.println("----- The Structure of printing----");
		System.out.println("java Main <src directory> <dst directory> <file extension: optional>");
		System.out.println();
	}
	public static void main(String[] args) throws IOException {
		String extension ="";
		// The argument length must not be greater than 3 and less than 2
		if(args.length < 2){
			System.out.println("Not enough arguments provided!");
			structPrint();
			System.exit(0);
		}
		if(args.length > 3) {
			System.out.println("Too many arguments provided!");
			structPrint();
			System.exit(1);
		}
		
		// If only two arguments provided: copy all
		if (args.length < 3){
			extension = "";
		// If there are exact three arguments: copies files with provided extension
		} else if(args.length == 3){
			extension = args[2];
		}
		File sourceFolder = new File(args[0]);
		File destFolder = new File(args[1]);
		CopyAll.copyFolderContent(sourceFolder, destFolder, extension);
	}

}
