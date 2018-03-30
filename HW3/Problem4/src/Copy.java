/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 3, Problem 4
 * Created on: 27th March, 2018
 * Last Modified on: 30th March, 2018
 * This class copies one file into another.
 */

package src;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Copy {
    /**
	 * Take two file names from standard input and copy content in file1 to file2
	 * @param args command line arguments
	 */
    public static void main(String [] argv) throws IOException {
        Scanner user = new Scanner(System.in);
        String fileName1, fileName2;

        //System.out.print("File 1 Name: ");
        //fileName1 = user.nextLine().trim();
        //System.out.print("File 2 Name: ");
        //fileName2 = user.nextLine().trim();
        fileName1 = argv[0];
        fileName2 = argv[1];

        try{
            File file1 = new File(fileName1);
            File file2 = new File(fileName2);
            if(file1.exists() && file2.exists()) {
                if(file1.isFile()) {
                    if(file2.isFile()) {
                        Files.copy(file1.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    }
                    else if(file2.isDirectory()) {
                        File newfile2 = new File(file2, fileName1);
                        Files.copy(file1.toPath(), newfile2.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        file1.delete();   
                    }
                }
                else {
                    throw new FileNotFoundException("File 1 should be a file");
                }
            }
            else {
                throw new FileNotFoundException("File Not Found");
            }
        }
        catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            user.close();
        }
    }
 }