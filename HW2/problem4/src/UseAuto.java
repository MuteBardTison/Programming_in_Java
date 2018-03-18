/**
 * @author Sabin Bhandari 30000374
 * @author Shikhat Karkee 30000394
 * @author Temirlan Ulugbek uulu 30000294
 * @author Zihan Qi 30000612
 * Assignment 2, Problem 4
 * Created on: 17th March, 2018
 * Last Modified on: 18th March, 2018
 * This class is provides the main method to use the Auto class and subclasses to display information about different cars.
 */

public class UseAuto {
	public static void main(String[] args) {
		
		/**Creating an instace of new auto for ford*/
		Auto auto1 = new Ford();
		auto1.setCarMake("Ford");
		auto1.setPrice();
		
		/**Creating an instace of new auto for chevy*/
		Auto auto2 = new Chevy();
		auto2.setCarMake("Chevy");
		auto2.setPrice();
		
		/**Using getters to print*/
		System.out.println("The first auto is by: ");
		System.out.println(auto1.getCarMake());
		System.out.println("And it's price is: ");
		System.out.println(auto1.getPrice());
		
		System.out.println("The second auto is by: ");
		System.out.println(auto2.getCarMake());
		System.out.println("And it's price is: ");
		System.out.println(auto2.getPrice());
		
		
	}
}
