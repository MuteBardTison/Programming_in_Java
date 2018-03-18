/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 2, Problem 3
 * Created on: 17th March, 2018
 * Last Modified on: 17th March, 2018
 * This class represents a Book class.
 */

package src;

public abstract class Book {
    /** The title of a Book */
    private String title;
    /** The price of a Book */
    protected double price;

    /**
     * Constructor of Book instance
     * @param title the title of the book
     */
    public Book(final String title) {
        this.title = title;
    }

    /**
     * Getting method which returns the title of book
     * @return title of book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Getting method which returns the price of book
     * @return price of book
     */
    public double getPrice() {
        return price;
    }

    /**
     * Abstract setting method
     */
    public abstract void setPrice();

    @Override
    public String toString() {
        return "Title: " + getTitle()
            + "\nPrice: " + getPrice() + "$";
    }
}