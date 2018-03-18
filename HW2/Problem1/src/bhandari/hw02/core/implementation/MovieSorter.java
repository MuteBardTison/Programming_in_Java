/**
 * Homework 2.1
 * 
 * This class extends to MovieServices and implements the sorting methods.
 * 
 * @author Sabin Bhandari 30000374
 * @author Shikhat Karkee 30000394
 * @author Temirlan Ulugbek uulu 30000294
 * @author Zihan Qi 30000612
 * 
 * @date 15/03/2018
 */
package bhandari.hw02.core.implementation;

import java.util.Arrays;
import java.util.Comparator;

import bhandari.hw02.core.MovieServices;

public class MovieSorter extends MovieServices {
	/**
	 * The class CompareTitle implements the interface Comparator to compare the
	 * title of the movie
	 * compare method compares the titles and returns 1 if movie1 comes 
	 * first 0 otherwise.
	 * @author sabin
	 *
	 */
	private class CompareTitle implements Comparator<Movie> {
        public int compare(Movie movie1, Movie movie2){
            return movie1.getTitle().compareToIgnoreCase(movie2.getTitle());
        }
    };
    /**
	 * The class CompareYear implements the interface Comparator to compare the
	 * year of the movie
	 * compare method compares the year and returns 1 if year of movie1
	 * is greater negative if less 0 otherwise.
	 * @author sabin
	 *
	 */
    private class CompareYear implements Comparator<Movie> {
    	public int compare(Movie movie1, Movie movie2){
    		return movie1.getYear() - movie2.getYear();
    	}
    };
    /**
	 * The class CompareScore implements the interface Comparator to compare the
	 * scores of the movie
	 * compare method compares the scores and returns 1 if score of movie1 is
	 * higher -1 if it is lower 0 otherwise.
	 * @author sabin
	 *
	 */
    private class CompareScore implements Comparator<Movie> {
    	public int compare(Movie movie1, Movie movie2){
    		if(movie1.getScore() < movie2.getScore())
    			return -1;
    		if(movie1.getScore() > movie2.getScore())
    			return 1;
    		return 0;
    	}
    };
    
	/**
	 * Uses the sort method for the arrays to arrange the title, year and score
	 * on the basis of the results obtained from the class above.
	 */
	public void sortByTitle(Movie[] titleArray){
		Arrays.sort(titleArray,new CompareTitle());
	}
	public void sortByYear(Movie[] titleArray){
		Arrays.sort(titleArray,new CompareYear());
	}
	public void sortByScore(Movie[] titleArray){
		Arrays.sort(titleArray,new CompareScore());
	}

}
