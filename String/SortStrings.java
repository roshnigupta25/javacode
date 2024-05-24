package String;
import java.util.Arrays; // Import the Arrays class for sorting
import java.util.Scanner; // Import the Scanner class for user input

public class SortStrings {

    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner sc = new Scanner(System.in);
        // Ask the user for the number of strings
        System.out.println("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        // Create an array of strings with user-defined size
        String[] strArray = new String[n];
        // Read strings from the user
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            strArray[i] = sc.nextLine();
        }
        // Print the original array
        System.out.println("Original array:");
        for (String str : strArray) {
            System.out.println(str);
        }
        // Sort the array in ascending order
        Arrays.sort(strArray);
        // Print the sorted array
        System.out.println("\nSorted array:");
        for (String str : strArray) {
            System.out.println(str);
        }
        // Close the Scanner object
        sc.close();
    }
}
