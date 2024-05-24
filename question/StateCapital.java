//5.	Write a program to accept 10 states and 10 capitals of country in two different single dimensional array. 
//Now, enter a state of the country to display its capital. If it is present then display its capital otherwise, display a relevant message. 
//Sample input: enter the state and the capital Bihar Patna West Bengal Kolkata and so on------------ 
//sample Output: enter the state whose capital is to be searched: West Bengal The capital is Kolkata

package question;
import java.util.Scanner; //to import scanner class

public class StateCapital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //making object of scanner class to take user input
        
        // Create arrays to store states and capitals
        String[] states = new String[10]; //declaring array for states
        String[] capitals = new String[10]; //declaring array for capitals
        
        // Accept names of 10 states and their capitals
        System.out.println("Enter the names of 10 states and their capitals:");
        for (int i = 0; i < 10; i++) 
        {
            System.out.print("Enter state " + (i + 1) + ": ");
            states[i] = scanner.nextLine();						//storing states in array by user input
            System.out.print("Enter capital of " + states[i] + ": ");
            capitals[i] = scanner.nextLine();					//storing capitals in array by user input
        }
        
        // Enter a state to search for its capital
        System.out.print("\nEnter the name of the state whose capital is to be searched: ");
        String stateToSearch = scanner.nextLine();
        
        // Search for the entered state in the states array
        boolean found = false;  //declare found as false
        for (int i = 0; i < 10; i++) {
            if (states[i].equalsIgnoreCase(stateToSearch)) //condition for checking state
            {
                System.out.println("The capital is " + capitals[i]); //if state is searched
                found = true;
                break;
            }
        }
        
        // If state not found, display relevant message
        if (!found) {
            System.out.println("State not found in the list."); //if state is not found
        }
    }//closing main method
}//closing class
