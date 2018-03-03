import java.util.Arrays;

/**
 * This class represents a Donor
 * 
 * Naming accords to Google Java Style
 * 
 * @author Zihan Qi
 */

public class Donor{
    private String name;        //name of donor
    private String rating;      //rating of donor

    /**
     * Constructor of donor instance
     * @param name name of donor to be constructed
     * @param rating rating of donor to be constructed
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
     */
    public void setRating(String newRating) {
        if(!Arrays.asList("high", "medium", "none").contains(newRating)) {
            throw new IllegalArgumentException("Invalid rating argument");
        }
        else
            this.rating = newRating;
    }
}