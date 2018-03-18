/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 2, Problem 3
 * Created on: 17th March, 2018
 * Last Modified on: 17th March, 2018
 * This class represents a Fiction class extended from Book class.
 */

package src;

public class Fiction extends Book {
    /**
     * Constuctor of Fiction instance
     * @param title title of Fiction
     */
    public Fiction(final String title) {
        super(title);
        this.setPrice();
    }

    /**
     * Implemented abstract method 
     * which sets price of Fiction to be 24.99$
     */
    public void setPrice() {
        this.price = 24.99;
    }
}