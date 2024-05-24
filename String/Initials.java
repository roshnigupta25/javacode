package String;
import java.util.Scanner; // Import the Scanner class for user input

public class Initials {

    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a name containing three words
        System.out.println("Enter a name : ");
        String input = sc.nextLine();

        // Close the Scanner object
        sc.close();

        // Variable to hold the initials
        String initials = "";

        // Initialize a flag to detect the start of a word
        boolean isStartOfWord = true;

        // Iterate over each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a space
            if (ch == ' ') {
                // Set the flag to true to detect the next word's start
                isStartOfWord = true;
            } else if (isStartOfWord) {
                // Append the character (initial of the word) to the initials string
                initials += ch;
                // Set the flag to false since the start of the word is processed
                isStartOfWord = false;
            }
        }

        // Display the resulting initials
        System.out.println("Initials: " + initials.charAt(0) + " " + initials.charAt(1) + " " + initials.charAt(2));
    }
}
