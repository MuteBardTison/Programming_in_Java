/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 1, Problem 1
 * Created on: 2nd March, 2018
 * Last Modified on: 4th March, 2018
 * This class represents a driver for pet class
 * which test the functionalities of a pet instance
 */
public class PetDriver{
    /**
	 * Tests functionalities of {@link Pet} class.
	 * @param args command line arguments
	 */
    public static void main(String[] args) {
        /* Constructor test*/
        Pet petOne = new Pet("Charlie", "Dog", 0.5, 40.0);
        System.out.println("Pet One:\n" + petOne + "\n");
        Pet petTwo = new Pet("Kitty", "Cat", 0.2, 20.0);
        System.out.println("Pet Two:\n" + petTwo + "\n");
        /* Getting methods test*/
        System.out.println("Getting Methods:");
        System.out.println("Get Name for Pet One: " + petOne.getName());
        System.out.println("Get Species for Pet One: " + petOne.getSpecies());
        System.out.println("Get Height for Pet One: " + petOne.getHeight());
        System.out.println("Get Weight for Pet One: " + petOne.getWeight());
        /* Setting methods test*/
        System.out.println("\nSetting Methods:");
        petTwo.setName("Daisy");
        petTwo.setSpecies("Monkey");
        petTwo.setHeight(0.8);
        petTwo.setWeight(30.0);
        System.out.println("Pet Two:\n" + petTwo + "\n");
        /* Equality test*/
        System.out.println("Pet One equals Pet Two: " + petOne.equals(petTwo));
        Pet petThree = new Pet("Charlie", "Dog", 0.5, 40.0);
        System.out.println("Pet One equals Pet Three: " + petOne.equals(petThree));
    }
}