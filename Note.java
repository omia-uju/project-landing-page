package controlflow;
import java.util.Scanner;
public class Note {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int number;
	        // this loop will run until the user enters a postive number
	        do {
	            System.out.print("Enter a number (postive to quit): ");
	            number = scanner.nextInt();
	            if (number < 0) {
	                System.out.println("You entered: " + number);
	            } else {
	                System.out.println("Exiting...");
	            }
	        } while (number < 0);
	        scanner.close();

		
           
		 }
	}
           
	

  