package loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of terms: ");
	        int n = scanner.nextInt();
	        scanner.close();

	        int firstTerm = 0, secondTerm = 1;

	        System.out.println("Fibonacci Series:");

	        for (int i = 1; i <= n; ++i) {
	            System.out.print(firstTerm + " ");

	            int nextTerm = firstTerm + secondTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	        }
	}

}
