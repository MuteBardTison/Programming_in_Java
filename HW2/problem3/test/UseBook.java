/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 2, Problem 3
 * Created on: 17th March, 2018
 * Last Modified on: 17th March, 2018
 * This class test Book class and its subclasses.
 */

package test;

import src.*;

public class UseBook {
    /**
	 * Tests functionalities of {@link Book} class 
     * and {@link Fiction } {@link NonFiction} subclasses.
	 * @param args command line arguments
	 */
    public static void main(String[] args) {
        /** Construct a Fiction and a NonFiction book */
        Fiction fiction = new Fiction("1984");
        NonFiction nonFiction = new NonFiction("Eat, Pray, Love");

        /** Display fields of each objects */
        System.out.println("Fiction:\n" + fiction + "\n");
        System.out.println("NonFiction:\n" + nonFiction + "\n");
    }
}