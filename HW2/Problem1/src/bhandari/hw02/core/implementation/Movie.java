/**
 * Homework 2.1
 * 
 * This is a top level Movie class that mainly stores the information of a movie.
 * 
 * @author Sabin Bhandari 30000374
 * @author Shikhat Karkee 30000394
 * @author Temirlan Ulugbek uulu 30000294
 * @author Zihan Qi 30000612
 * 
 * @date 15/03/2018
 */
package bhandari.hw02.core.implementation;

public class Movie {
	/** Title of the movie. */
	private String title;
	/** The year of release of the movie. */
	private int year;
	/** The score/ratings obtained by the movie */
	private double score;
	
	/**
	 * Constructor for initializing the movie class.
	 */
	public Movie(){
		title = "";
		year = 0;
		score = 0.0;
	}
	/**
	 * Parametric constructor to set the properties.
	 * @param title title of the movie
	 * @param year year of release
	 * @param score ratings
	 */
	public Movie(String title, int year, double score){
		super();
		this.title = title;
		this.year = year;
		this.score = score;
	}
	/**
	 * Getter for title
	 * @return title
	 */
	public String getTitle(){
		return title;
	}
	/**
	 * Getter for year
	 * @return year
	 */
	public int getYear(){
		return year;
	}
	/**
	 * Getter for score
	 * @return score
	 */
	public double getScore(){
		return score;
	}
	/**
	 * Setter for title
	 * @param title
	 */
	public void setTitle(String title){
		this.title = title;
	}
	/**
	 * Setter for score
	 * @param score
	 */
	public void setScore(long score){
		this.score = score;
	}
	/**
	 * Setter for year
	 * @param year
	 */
	public void setYear(int year){
		this.year = year;
	}
	/**
	 * Method to print the results in specific manner
	 * @param i
	 * @return The desired printing structure
	 */
	public String resultString(int i){
		return i+") "+"[title: " + title + "]    [year: " + year + "]   [score: " + score + "] ";
	}
}
