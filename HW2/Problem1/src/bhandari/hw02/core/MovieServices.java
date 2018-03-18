/**
 * Homework 2.1
 * 
 * This is an abstract class responsible for declaring abstract methods.
 * 
 * @author Sabin Bhandari 30000374
 * @author Shikhat Karkee 30000394
 * @author Temirlan Ulugbek uulu 30000294
 * @author Zihan Qi 30000612
 * 
 * @date 15/03/2018
 */
package bhandari.hw02.core;

import bhandari.hw02.core.implementation.Movie;

public abstract class MovieServices {
	/**
	 * Abstract method for sorting title
	 * @param titleArray array of titles.
	 */
	public abstract void sortByTitle(Movie[] titleArray);
	/**
	 * Abstract method for sorting year
	 * @param yearArray array of year.
	 */
	public abstract void sortByYear(Movie[] yearArray);
	/**
	 * Abstract method for sorting score
	 * @param scoreArray array of scores.
	 */
	public abstract void sortByScore(Movie[] scoreArray);
}
