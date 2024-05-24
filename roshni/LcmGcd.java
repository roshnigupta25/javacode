package roshni;

import java.util.Scanner;

public class LcmGcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);//to take user input
        
        //Take user input
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		int gcd = 1; //initializing gcd with the value of 1
		
		// Calculate GCD using loops
        int smaller = (num1 < num2) ? num1 : num2;
        for (int i = 1; i <= smaller; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        // Calculate LCM using GCD
        int lcm = (num1 * num2) / gcd;

        // Print the result
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
	}

}
