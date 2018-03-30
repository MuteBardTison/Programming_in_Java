import java.io.*;
import java.nio.ByteBuffer;
import java.util.*;


/**
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * Assignment 3 Problem 5
 * Created on: 30th March, 2018
 * Last Modified on: 30th March, 2018
 * Class serves as Database for product records. It stores names, quantities and prices.
 * On every creation it tries to restore the values from STORAGE_FILENAME. And on request,
 * can store them back into that file.
 */
public class ProductRecords {
	/** Place to store the data in */
	private static final String STORAGE_FILENAME = "productRecords.ser";
	/** Map: Product name -> quantity*/
	private Map<String, Integer> nameToQuantity = new HashMap<>();
	/** Map: Product name -> price */
	private Map<String, Double> nameToPrice = new HashMap<>();
	
	public ProductRecords(){
		try {
			restoreValues();
		} catch (IOException e) {
			System.out.println("Something went wrong when restoring database values.");
		}
	}
	
	public void add(final String name, final Integer quantity, final Double price){
		if (name.length() > 30) {
			System.out.println("The product name must have at most 30 characters!");
			return;
		}
		if (nameToQuantity.containsKey(name)) {
			System.out.println("The product cannot be added! It already exists in the database.");
			return;
		}
		putValues(name, quantity, price);
	}
	
	public void modifyProduct(final String name, final Integer quantity, final Double price){
		if (!nameToQuantity.containsKey(name)) {
			System.out.println("The product cannot be modified! It does not exist in the database.");
			return;
		}
		putValues(name, quantity, price);
	}
	
	private void putValues(final String name, final Integer quantity, final Double price){
		nameToQuantity.put(name, quantity);
		nameToPrice.put(name, price);
	}
	
	public void findProduct(final String name){
		if (!nameToQuantity.containsKey(name)) {
			System.out.println("It does not exist in the database.");
			return;
		}
		System.out.println("Product name: " + name);
		System.out.println("Product quantity: " + nameToQuantity.get(name));
		System.out.println("Product price: " + nameToPrice.get(name));
	}

	@SuppressWarnings("unchecked")
	public void restoreValues() throws IOException{
		ObjectInputStream objstream = null;
		try {
			objstream = new ObjectInputStream(new FileInputStream(STORAGE_FILENAME));
			try {
				final Object nameQuantity = objstream.readObject();
				final Object namePrice = objstream.readObject();
				nameToQuantity = (Map<String, Integer>) nameQuantity;
				nameToPrice = (Map<String, Double>) namePrice;
			} catch (final ClassCastException | ClassNotFoundException e){
				System.out.println("Couldn't restore the data. Input file contains wrong format");
				e.printStackTrace();
				return;
			}
		} catch (final IOException e){
			System.out.println("Couldn't restore the data. Failed to open " + STORAGE_FILENAME);
			return;
		} finally{
			if(objstream != null) objstream.close();
		}
		
	}
	
	public void saveValues() throws IOException{
		ObjectOutputStream objstream = null;
		try {
			objstream = new ObjectOutputStream(new FileOutputStream(STORAGE_FILENAME));
			objstream.writeObject(nameToQuantity);
			objstream.writeObject(nameToPrice);
		} catch (final IOException e){
			System.out.println("Couldn't restore the data. Failed to open " + STORAGE_FILENAME);
			return;
		} finally{
			if(objstream != null) objstream.close();
		}
	}
	
}
