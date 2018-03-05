/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 1, Problem 4
 * Created on: 2nd March, 2018
 * Last Modified on: 4th March, 2018
 * 
 * This class represents a driver for donor class
 * which test the functionalities of a donor instance
 */

public class DonorDriver{
    /**
	 * Tests functionalities of {@link Donor} class.
	 * @param args command line arguments
	 */
    public static void main(String[] args) {
        /* Constructor test*/
        Donor donorOne = new Donor("Alex", "high");
        Donor donorTwo = new Donor("Kevin", "none");
        /* test for invalid argument value of rating */
        //Donor donorThree = new Donor("Steven", "very high");

        /* Getting methods test */
        System.out.println("Name of Donor One: " + donorOne.getName());
        System.out.println("Rating of Donor One: " + donorOne.getRating());

        /* Setting methods test */
        System.out.println("Name of Donor Two: " + donorTwo.getName());
        System.out.println("Rating of Donor Two: " + donorTwo.getRating());
        donorTwo.setName("Bob");
        System.out.println("Name of Donor Two after change: " + donorTwo.getName());
        donorTwo.setRating("high");
        System.out.println("Rating of Donor Two after change: " + donorTwo.getRating());
        /* test for invalid argument value of rating */
        //donorTwo.setRating("Superb");
    }
}