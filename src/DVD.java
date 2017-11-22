/**
 * This class contains a constructor, setters, and getters for DVDs
 * @author Edgar
 * @date 11/21/2017
 */

public class DVD {
	private String title;
	private double cost;
	private boolean available;
	public DVD(String name, double cost, boolean isAvailable) {
		// The constructor 
		this.title = name;
		this.cost = cost;
		this.available = isAvailable;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		// Makes sure user does not input a null value for DVD title.. a null value wouldn't make sense.
		if (title != null && !title.isEmpty()) {
			this.title = title;
		} else {
			System.out.println("Error. Invalid input.");
		}
	}
	
	public double getCost() {
		return this.cost;
	}
	
	public void setCost(double cost) {
		// Makes sure that user does not put a negative price for rent
		if (cost > 0) {
			this.cost = cost;
		} else {
			System.out.println("Error. Invalid input.");
		}
	}
	
	public boolean getAvailability() {
		return this.available;
	}
	
	// Used to indicate that once DVD is rented, it is no longer available
	public void rent() {
		this.available = false;
	}
	
	// Used to indicate that once DVD is returned, it is now available
	public void returnDVD() {
		this.available = true;
	}
	
}
