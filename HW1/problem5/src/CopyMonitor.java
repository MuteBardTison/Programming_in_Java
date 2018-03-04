/**
 * Homework 1.5
 * 
 * This class monitors the copy machine. Keeps track of printed pages, toner level 
 * and services done.
 * 
 * @author Sabin Bhandari
 * @author Shikhat Karkee
 * @author Temirlan Ulugbek uulu
 * @author Zihan Qi
 * 
 * @date 4/03/2018
 */
public class CopyMonitor {
	/** The max numbers of papers machine can print without servicing */
	public static final int MAX_PAPERS_PRINT = 100000;
	/** The level of toner, below which, machine needs service*/
	public static final float TONER_LOW = 0.05f;
	/** Indicates if toner level is too low*/
	private boolean tonerLevelLow;
	/** Indicates if upper limit of printed papers is reached */
	private boolean printLimitReached;
	/** Toner level of the machine */
	private float tonerLevel = 0;
	/** Number of papers printed after the last service */
	private int printCount = 0;
	
	
	/**
	 * Makes the necessary printing. Updates the counters and indicators.
	 * 
	 * @throws Exception if toner level is zero, it is impossible to print.
	 */
	public void print() throws Exception{
		/* may take some parameter to print */
		if (tonerLevel == 0.0f) throw new Exception("No toner! Can't print!");
		/*
		 * PRINT
		 * As the questions states, it is assumed that this part makes the machine print.
		 */
		updateCounters();
		updateIndicators();
	}
	
	/**
	 * Updates the counters according to the recent print job done
	 */
	private void updateCounters(){
		// Assumed that this is implemented
		// (according to the problem statements
	}
	
	/**
	 * Updates indicator values, by checking the counters.
	 */
	private void updateIndicators() {
		tonerLevelLow = tonerLevel < TONER_LOW;
		printLimitReached = printCount < MAX_PAPERS_PRINT;
	}
	
	/**
	 * Reports the state of the machine.
	 * 
	 * @return state of copy machine (so far just tells if service is needed)
	 */
	public String reportState(){
		String state = "Service "+(tonerLevelLow || printLimitReached ? "" : " not")+" needed";
		return state;
	}
	
	/**
	 * The method is called to do servicing.
	 */
	public void doServicing(){
		// Do service (assumed that service is implemented)
		
		//reset counters
		tonerLevel = 1.0f;
		printCount = 0;
		updateIndicators();
	}
	
}
