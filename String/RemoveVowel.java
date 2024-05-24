package String;
import java.util.*;// Import the Scanner class for user input
public class RemoveVowel {

	public static void main(String[] args) {
		
		// Create a Scanner object for reading user input
		Scanner sc = new Scanner(System.in);
		// Prompt the user to enter a string
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		str=str.toLowerCase();
		// Variable to hold the result string without vowels
		String result="";
		 // Iterate over each character in the input string
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			// Check if the character is not a vowel
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
				// Append the character to the result string
				result += ch;
			}
		}
		// Display the resulting string
		System.out.println("String after removing vowels: "+result);
		sc.close();// Close the Scanner object
	}

}
