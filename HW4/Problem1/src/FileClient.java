/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 4, Problem 1
 * Created on: 6th April, 2018
 * Last Modified on: 8th April, 2018
 * This class represents a File Client.
 */

import java.net.*;
import java.io.*;

public class FileClient {
    static final int LISTENING_PORT = 8080;

    /**
     * Main function
     * @param args command line arguments
     */
    public static void main(String[] args) {
        /** Name of the Server */
        String computer;
        /** Socket for communicating with the Server */
        Socket connection;
        /** Stream for sending a command to the Server */
        PrintWriter outgoing;
        /** Stream for reading data from the connection */
        BufferedReader incoming;
        /** Command to send */
        String command;
    
        if (args.length == 0 || args.length > 3) {
            System.out.println("Usage:  java FileClient <server>");
            System.out.println("    or  java FileClient <server> <file>");
            System.out.println("    or  java FileClient <server> <file> <local-file>");
            return;
        }
        
        /** Get the server name and the message to send to the server. */
        computer = args[0];
        if (args.length == 1)
            command = "INDEX";
        else
            command = "GET " + args[1]; 
        try {
            connection = new Socket(computer, LISTENING_PORT);
            incoming = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            outgoing = new PrintWriter(connection.getOutputStream());
            outgoing.println(command);
            outgoing.flush();
        }
        catch (Exception e) {
            System.out.println("Can't make connection to server at \"" + args[0] + "\".");
            System.out.println("Error:  " + e);
            return;
        }
        
        /* Read and process the server's response to the command. */
        try {
            if (args.length == 1) {
                System.out.println("File list from server:");
                while (true) {
                    String line = incoming.readLine();
                    if (line == null)
                        break;
                    System.out.println("   " + line);
                }
            }
            else {
                String message = incoming.readLine();
                if (! message.equalsIgnoreCase("OK")) {
                    System.out.println("File not found on server.");
                    System.out.println("Message from server: " + message);
                    return;
                }
                PrintWriter fileOut;
                if (args.length == 3) {
                    fileOut = new PrintWriter( new FileWriter(args[2]) );
                }
                else {
                    File file = new File(args[1]);
                    if (file.exists()) {
                        System.out.println("A file with that name already exists.");
                        System.out.println("To replace it, use the three-argument");
                        System.out.println("version of the command.");
                        return;
                    }
                    fileOut = new PrintWriter( new FileWriter(args[1]) );
                }
                while (true) {
                    String line = incoming.readLine();
                    if (line == null)
                        break;
                    fileOut.println(line);
                }
                if (fileOut.checkError()) {
                    System.out.println("Some error occurred while writing the file.");
                    System.out.println("Output file might be empty or incomplete.");
                }
            }
        }
        catch (Exception e) {
            System.out.println("Sorry, an error occurred while reading data from the server.");
            System.out.println("Error: " + e);
        }
        finally {
            try {
                connection.close();
            }
            catch (IOException e) {
            }
        }    
    }
}
