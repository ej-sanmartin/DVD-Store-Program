import java.util.Scanner;

/**
 * This class contains the main method and is the starting point to run the rest of the java files in this file.
 * Also contains method to display the menu screen to user, which gives users options to interact with program.
 * @author Edgar
 * @date 11/22/2017
 */

public class Controller {

	public static void main(String[] args) {
		System.out.println("Welcome to our DVD store!");
		Controller c = new Controller();
		// Create store object to be run in this class
		Store store = new Store();
		
		//All scanners needed to retrieve user inputs from welcome screen
		Scanner scan = new Scanner(System.in);
		Scanner doubleScanner = new Scanner(System.in);
		
		int input = -1;
		
		while (input != 0) {
		
			input = c.displayMenu();
			if (input == 1) {
				//Display all DVDs
				store.listDVDs();
			} else if (input == 2){
				// Rent a DVD (ask the user for the DVD name
				String name = scan.nextLine();
				store.rentDVD(name);
			} else if (input == 3) {
				// Add a DVD
				System.out.print("Enter the DVD name to add: ");
				String name = scan.nextLine();
				System.out.print("Enter the DVD cost to add: ");
				double cost = doubleScanner.nextDouble();
				store.addDVD(name, cost);
			}
		}
	}
	
	private int displayMenu() {
		System.out.println("\n\nPress 0 to exit;");
		System.out.println("Press 1 to display all available DVDs;");
		System.out.println("Press 2 to rent a DVD;");
		System.out.println("Press 3 to add a DVD.");
		System.out.print("Enter your choice: ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		return input;
	}	
}
