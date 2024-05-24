package arrays;
import java.util.*;
public class DivisibleTwoThree {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Declare arrays
	        int[] userInputArray = new int[10];
	        int[] divisibleByTwoArray = new int[10]; // Max size is 10 assuming all numbers are divisible by 2
	        int[] divisibleByThreeArray = new int[10]; // Max size is 10 assuming all numbers are divisible by 3

	        // Take user input
	        System.out.println("Enter 10 numbers:");
	        for (int i = 0; i < userInputArray.length; i++) {
	            userInputArray[i] = scanner.nextInt();
	        }

	        // Check divisibility by 2 and 3 and add to respective arrays
	        int indexTwo = 0;
	        int indexThree = 0;
	        for (int num : userInputArray) {
	            if (num % 2 == 0) {
	                divisibleByTwoArray[indexTwo++] = num;
	            }
	            if (num % 3 == 0) {
	                divisibleByThreeArray[indexThree++] = num;
	            }
	        }

	        // Print arrays
	        System.out.println("Numbers divisible by 2:");
	        for (int i = 0; i < indexTwo; i++) {
	            System.out.println(divisibleByTwoArray[i]);
	        }

	        System.out.println("Numbers divisible by 3:");
	        for (int i = 0; i < indexThree; i++) {
	            System.out.println(divisibleByThreeArray[i]);
	        }
	    }

}
