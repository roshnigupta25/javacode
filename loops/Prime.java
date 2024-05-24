package loops;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,i;
		boolean isPrime=true;
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		for(i = 2; i<num;i++) {
			if( num % i ==0) {
				isPrime = false;
				break;
			}
			
		}
		if(isPrime && num > 1) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
	}
}
