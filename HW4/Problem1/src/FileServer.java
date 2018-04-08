/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 4, Problem 1
 * Created on: 6th April, 2018
 * Last Modified on: 8th April, 2018
 * This class represents a Multithreaded Network File Server.
 */

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class FileServer {
   static final int LISTENING_PORT = 8080;
   /**
    * Main function
    * @param args command line arguments
    */
   public static void main(String[] args) {
      /** Directory which contains the collection of files */
      File directory;
      /** Listens for connection requests */
      ServerSocket listener;
      /** Socket for communicating with a client */
      Socket connection;

      /** Check is argument is valid, otherwise print the usage */
      if (args.length == 0) {
         System.out.println("Usage: java FileServer <directory>");
         return;
      }
      /**
       * Read the directory name from command, and check is it exists
       * and is a directory.
       */

      directory = new File(args[0]);
      if (!directory.exists()) {
         System.out.println("Specified directory does not exist.");
         return;
      }
      if (!directory.isDirectory()) {
         System.out.println("The specified file is not a directory.");
         return;
      }
      try {
         listener = new ServerSocket(LISTENING_PORT);
         System.out.println("Listening on port " + LISTENING_PORT);
         while (true) {
            connection = listener.accept();
            handleConnection(directory,connection);
         }
      }
      catch (Exception e) {
         System.out.println("Server shut down unexpectedly.");
         System.out.println("Error:  " + e);
         return;
      }

   }

   /**
    * Method which processes the connection with one client
    * @param directory directory of files
    * @param connection connection with clients
    */
   private static void handleConnection(File directory, Socket connection) {
      Scanner incoming;
      PrintWriter outgoing;
      String command = "Command not read";
      try {
         incoming = new Scanner( connection.getInputStream() );
         outgoing = new PrintWriter( connection.getOutputStream() );
         command = incoming.nextLine();
         if (command.equalsIgnoreCase("index")) {
            sendIndex(directory, outgoing);
         }
         else if (command.toLowerCase().startsWith("get")){
            String fileName = command.substring(3).trim();
            sendFile(fileName, directory, outgoing);
         }
         else {
            outgoing.println("ERROR unsupported command");
            outgoing.flush();
         }
         System.out.println("OK    " + connection.getInetAddress()
               + " " + command);
      }
      catch (Exception e) {
         System.out.println("ERROR " + connection.getInetAddress()
               + " " + command + " " + e);
      }
      finally {
         try {
            connection.close();
         }
         catch (IOException e) {
         }
      }
   }

   /**
    * Method which sends the list of files in response to "INDEX" command
    * @param directory directory of files
    * @param outgoing output
    */
   private static void sendIndex(File directory, PrintWriter outgoing) throws Exception {
      String[] fileList = directory.list();
      for (int i = 0; i < fileList.length; i++)
         outgoing.println(fileList[i]);
      outgoing.flush();
      outgoing.close();
      if (outgoing.checkError())
         throw new Exception("Error while transmitting data.");
   }

   /**
    * Method which sends message "ok" or "error"
    * in response to "GET <fileName>" command
    * @param fileName file name to get
    * @param directory directory of files
    * @param outgoing output
    */
   private static void sendFile(String fileName, File directory, PrintWriter outgoing) throws Exception {
      File file = new File(directory,fileName);
      if ( (! file.exists()) || file.isDirectory() ) {
         outgoing.println("ERROR");
      }
      else {
         outgoing.println("OK");
         BufferedReader fileIn = new BufferedReader( new FileReader(file) );
         while (true) {
            String line = fileIn.readLine();
            if (line == null)
               break;
            outgoing.println(line);
         }
      }
      outgoing.flush(); 
      outgoing.close();
      if (outgoing.checkError())
         throw new Exception("Error while transmitting data.");
   }
}