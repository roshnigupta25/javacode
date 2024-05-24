package String;
import java.util.Scanner; // Import the Scanner class for user input

public class NameOrder {

    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a name containing three words
        System.out.println("Enter a name: ");
        String input = sc.nextLine();

        // Close the Scanner object
        sc.close();

        // Split the input string into individual words
        String[] words = input.split(" ");

        // Check if the input contains exactly three words
        if (words.length == 3) {
            // Extract the individual names
            String surname = words[2];
            String firstName = words[0];
            String middleName = words[1];

            // Display the name in the desired order
            System.out.println("Name in desired order: " + surname + " " + firstName + " " + middleName);
        } else {
            // Display an error message if the input format is incorrect
            System.out.println("Please enter a name containing exactly three words.");
        }
    }
}
