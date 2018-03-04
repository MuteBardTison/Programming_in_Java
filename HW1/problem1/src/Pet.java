/**
 * This class represents a pet object
 * 
 * @author Zihan Qi
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 */

public class Pet{
    private String name;        // Name of pet
    private String species;     // Species of pet
    private double height;      // Height of pet in meters
    private double weight;      // Weight of pet in kilograms

    /**
     * Constructor of pet instance
     * @param name name of pet to be constructed
     * @param species species of pet to be constructed
     * @param height height of pet to be constructed
     * @param weight weight of pet to be constructed
     */
    public Pet(String name, String species, double height, double weight) {
        this.name = name;
        this.species = species;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name: " + this.name
            + "\nSpecies: " + this.species
            + "\nHeight: " + this.height
            + "\nWeight: " + this.weight;
    }

    @Override
	public boolean equals(Object o){
		if (o instanceof Pet){
			Pet pet = (Pet) o;
            return (this.name == pet.name) && (this.species == pet.species)
            && (this.height == pet.height) && (this.weight == pet.weight);
		}
		return false;
	}

    /**
     * Getting method which returns the name of pet
     * @return name of pet
     */
    public String getName() {
        return name;
    }

    /**
     * Getting method which returns the species of pet
     * @return species of pet
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Getting method which returns the height of pet
     * @return height of pet
     */
    public double getHeight() {
        return height;
    }

    /**
     * Getting method which returns the weight of pet
     * @return weight of pet
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Setting method which sets the name of pet
     * @param newName new name of pet
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * Setting method which sets the species of pet
     * @param newSpecies new species of pet
     */
    public void setSpecies(String newSpecies) {
        this.species = newSpecies;
    }

    /**
     * Setting method which sets the height of pet
     * @param newHeight new height of pet
     */
    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    /**
     * Setting method which sets the weight of pet
     * @param newWeight new weight of pet
     */
    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }
}