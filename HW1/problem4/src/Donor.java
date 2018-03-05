/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 1, Problem 4
 * Created on: 2nd March, 2018
 * Last Modified on: 4th March, 2018
 * 
 * This class represents a Donor
 */

import java.util.Arrays;

public class Donor{
    private String name;        //name of donor
    private String rating;      //rating of donor

    /**
     * Constructor of donor instance
     * @param name name of donor to be constructed
     * @param rating rating of donor to be constructed
     * @throws IllegalArgumentException throw exception if rating argument is not in the list
     */
    public Donor(String name, String rating) {
        if(!Arrays.asList("high", "medium", "none").contains(rating)) {
            throw new IllegalArgumentException("Invalid rating argument");
        }
        this.name = name;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Name: " + this.name
            + "\nRating: " + this.rating;
    }

    @Override
	public boolean equals(Object o){
		if (o instanceof Donor){
			Donor donor = (Donor) o;
            return (this.name == donor.name) && (this.rating == donor.rating);
		}
		return false;
    }
    
    /**
     * Getting method which returns the name of donor
     * @return name of donor
     */
    public String getName() {
        return name;
    }

    /**
     * Getting method which returns the rating of donor
     * @return rating of donor
     */
    public String getRating() {
        return rating;
    }

    /**
     * Setting method which sets the name of donor
     * @param newName new name of donor
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * Setting method which sets the rating of donor
     * @param newRating new rating of donor
     * @throws IllegalArgumentException throw exception if rating argument is not in the list
     */
    public void setRating(String newRating) {
        if(!Arrays.asList("high", "medium", "none").contains(newRating)) {
            throw new IllegalArgumentException("Invalid rating argument");
        }
        else
            this.rating = newRating;
    }
}