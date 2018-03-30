/**
 * Homework 3.2
 * 
 * This is a class responsible for copy files recursively from src folder to dst
 * folder.
 * 
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * 
 * @date 29/03/2018
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyAll {	
	/**
	 * This function is used to isolate the extension from the file.
	 * @param file
	 * @return extension of that file
	 */
	private static String getExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        	return fileName.substring(fileName.lastIndexOf(".")+1);
        else 
        	return "";
    }
	/**
	 * This function is used to copy contents of file using streams.
	 * @param source source directory from which contents is to be copied from.
	 * @param dest destination directory from which contents is to be copied to.
	 * @throws IOException
	 */
	public static void copyFile(File source, File dest) throws IOException 	{
		InputStream readFile = null;
	    OutputStream writeFile = null;
	    try {
	        readFile = new FileInputStream(source);
	        writeFile = new FileOutputStream(dest);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = readFile.read(buffer)) > 0) {
	        	writeFile.write(buffer, 0, length);
	        }
	    } finally {
	    	readFile.close();
	    	writeFile.close();
	    }
	}
		
	/**
	 * This is the recursive function that is used to copy the contents of the
	 * directory.
	 * @param source source directory from which contents is to be copied from.
	 * @param dest destination directory from which contents is to be copied to.
	 * @param ext extension of the file.
	 * @throws IOException
	 */
	public static void copyFolderContent(File source, File dest, String ext) throws IOException{
		if(source.isDirectory()){
			if(!dest.exists()){
				dest.mkdirs();
			}
			String[] array = source.list();
			for(String file: array){
				File recSource = new File (source, file);
				File recDest = new File(dest, file);
				copyFolderContent(recSource, recDest, ext);
				System.out.println("Directory: "+source.getPath()+ " copied to " + dest.getPath());
			}
		}else{
			if (getExtension(source).equals(ext)|| ext.equals("")){
				copyFile(source, dest);			
			}else{
				System.out.println(source.getPath()+ " omitted because not " + ext.toLowerCase() + ".");
			}
		}
	}
}
