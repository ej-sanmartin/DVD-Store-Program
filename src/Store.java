import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class creates an empty ArrayList of DVDs, where we could input DVD informations into.
 * We, also, set up a variable to keep track of how much money the store is making with the rentals.
 * And, finally, we created methods to check through the list of DVDs and outputs DVDs information, as well
 * as check for the DVDs availability. 
 * @author Edgar
 * @ date 11/22/2017
 */

public class Store {
	
	List<DVD> dvds;
	double money;
	
	public Store() {
		dvds = new ArrayList<DVD>();
		// Testing
		dvds.add(new DVD("The Matrix", 15.00, true));
		dvds.add(new DVD("Frozen", 13.00, true));
	}
	
	public void listDVDs() {
		// Iterates and looks through the list of DVDs that our store(s) have
		Iterator itr = dvds.iterator();
		while (itr.hasNext()) {
			DVD dvd = (DVD)itr.next();
			System.out.println(dvd.getTitle() + "\tPrice:" + dvd.getCost() + "\tIs availble:" + dvd.getAvailability());
		}
	}
	
	public boolean rentDVD(String name) {
		// Iterators through DVD list to see if store has the DVD requested and if that DVD is available
		Iterator itr = dvds.iterator();
		while (itr.hasNext()) {
			DVD dvd = (DVD)itr.next();
			if (dvd.getTitle().equals(name)) {
				
				if (dvd.getAvailability()) {
					// Rent
					this.money += dvd.getCost();
					dvd.rent();
					System.out.println("The DVD was rented. \n");
					// Succeeded at giving customer a DVD
					return true;
				} else {
					// We can't rent
					System.out.println("Dvd is already taken. Sorry!");
					// Failed at giving customer a DVD because DVD not available
					return false;
				}
 			}
		}
		// Failed at giving customer a DVD because the DVD title was not found
		System.out.println("DVD is not in our list. Sorry!");
		return false;
	}
	
	public void addDVD(String name, double cost) {
		dvds.add(new DVD(name, cost, true));
		
	}
}
