/**
 * 
 * @author Sabin Bhandari 30000374
 * @author Shikhat Karkee 30000394
 * @author Temirlan Ulugbek uulu 30000294
 * @author Zihan Qi 30000612
 * Assignment 2 Problem 2
 * Created on: 18th March, 2018
 * Last Modified on: 18th March, 2018
 * This class represents a FederalState and contains the name of the land.
 * The class is "Singleton" class and no new instances of it can be created.
 * Only the existing 16 instances, which represent 16 German lands, can be used.
 */
public class FederalState {
	
	// All the lands of Germany are static fields of the class
	private static final FederalState BADEN_W = new FederalState("Baden-Wuerttemberg");
	private static final FederalState BAVARIA = new FederalState("Bavaria");
	private static final FederalState BERLIN = new FederalState("Berlin");
	private static final FederalState BRANDENBURG = new FederalState("Brandenburg");
	private static final FederalState BREMEN = new FederalState("Bremen");
	private static final FederalState HAMBURG = new FederalState("Hambrug");
	private static final FederalState HESSE = new FederalState("Hesse");
	private static final FederalState LOWER_SAXONY = new FederalState("Lower Saxony");
	private static final FederalState MECKLENBURG_V = new FederalState("Mecklenburg-Vorpommern");
	private static final FederalState NORTH_R_W = new FederalState("North Rhine-Westphalia");
	private static final FederalState RHINELAND_P = new FederalState("Rhineland-Palatinate");
	private static final FederalState SAARLAND = new FederalState("Saarland");
	private static final FederalState SAXONY = new FederalState("Saxony");
	private static final FederalState SAXONY_A = new FederalState("Saxony-Anhalt");
	private static final FederalState SCHLESWIG_H = new FederalState("Schleswig-Holstein");
	private static final FederalState THURINGIA = new FederalState("Thuringia");
	/** Name of the land */
	private final String name;
	
	/**
	 * Private constructor, which creates a Federal state with the given name.
	 * @param name the name of the federal state to be created.
	 */
	private FederalState(final String name){
		this.name = name;
	}
	
	/**
	 * Gets the name of the state
	 * @return name
	 */
	public String getName(){
		return name;
	}
	
	
	/**
	 * The method returns the Federal state with certain name if such state exists.
	 * @param name the name of the wanted Federal state
	 * @return The federal state which has the provided name, if such exists. Otherwise {@code null}
	 */
	public static FederalState getState(final String name){
		FederalState result = null;
		switch(name){
		case "Baden-Wuerttemberg":
			result = BADEN_W;
			break;
		case "Bavaria":
			result = BAVARIA;
			break;
		case "Berlin":
			result = BERLIN;
			break;
		case "Brandenburg":
			result = BRANDENBURG;
			break;
		case "Bremen":
			result = BREMEN;
			break;
		case "Hambrug":
			result = HAMBURG;
			break;
		case "Hesse":
			result = HESSE;
			break;
		case "Lower Saxony":
			result = LOWER_SAXONY;
			break;
		case "Mecklenburg-Vorpommern":
			result = MECKLENBURG_V;
			break;
		case "North Rhine-Westphalia":
			result = NORTH_R_W;
			break;
		case "Rhineland-Palatinate":
			result = RHINELAND_P;
			break;
		case "Saarland":
			result = SAARLAND;
			break;
		case "Saxony":
			result = SAXONY;
			break;
		case "Saxony-Anhalt":
			result = SAXONY_A;
			break;
		case "Schleswig-Holstein":
			result = SCHLESWIG_H;
			break;
		case "Thuringia":
			result = THURINGIA;
			break;
		}
		return result;
	}
	
}
