/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 2, Problem 3
 * Created on: 17th March, 2018
 * Last Modified on: 17th March, 2018
 * This class store Fiction and NonFiction books.
 */

package test;

import src.*;
import java.util.ArrayList;

public class BookArray {
    /**
	 * Tests functionalities of {@link Book} class 
     * and {@link Fiction } {@link NonFiction} subclasses.
	 * @param args command line arguments
	 */
    public static void main(String[] args) {
        ArrayList<Book> bookArray = new ArrayList<Book>();

        /** Construct some Fiction and NonFiction books */
        bookArray.add(new Fiction("1984"));
        bookArray.add(new Fiction("To Kill a Mockingbird"));
        bookArray.add(new Fiction("The Great Gatsby"));
        bookArray.add(new Fiction("The Hunger Games"));
        bookArray.add(new Fiction("The Catcher in the Rye"));
        bookArray.add(new Fiction("The Kite Runner"));
        bookArray.add(new Fiction("The Hobbit"));
        bookArray.add(new NonFiction("Eat, Pray, Love"));
        bookArray.add(new NonFiction("Night"));
        bookArray.add(new NonFiction("A Brief History of Time"));

        /** Display fields of each objects */
        for(int i = 0; i < bookArray.size(); i++) {
            System.out.println(bookArray.get(i) + "\n");
        }    
    }
}