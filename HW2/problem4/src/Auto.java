/**
 * @author Sabin Bhandari 30000374
 * @author Shikhat Karkee 30000394
 * @author Temirlan Ulugbek uulu 30000294
 * @author Zihan Qi 30000612
 * Assignment 2, Problem 4
 * Created on: 17th March, 2018
 * Last Modified on: 18th March, 2018 
 * This class provides the backbone of the abstract auto class with it's setters and getters.
 */

abstract class Auto {
	private String carMake;
	protected int price;
	
	/** empty constructor
	 * */
	public Auto(){
		this.carMake = null;
		this.price = 0;
	}
	
	/** car make setter
	 * @param carmake is a string which is the name of the car maker
	 * */
	public void setCarMake(String carmake){
		this.carMake = carmake;
	}
	
	/** abstract price setter
	 * */
	public abstract void setPrice();
	
	/** car make getter
	 * @return returns the car maker
	 * */
	public String getCarMake(){
		return this.carMake;
	}
	
	/** price getter
	 * @return returns the price of the car
	 * */
	public int getPrice(){
		return this.price;
	}
} 
