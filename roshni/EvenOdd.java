package roshni;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n1 = sc.nextInt();
		String x = ((n1%2)==0)? "It is an Even Number": "It is an odd number";
		System.out.println("Result: "+x);

	}

}
