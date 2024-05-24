package roshni;

import java.util.Scanner;

public class TypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the number 2: ");
		int n2 = sc.nextInt();
		double z = n1 + n2;//implicit
		System.out.println("Result: "+z);
		int a = (int) z+n1+n2;//explicit conversion done by compiler
		System.out.println("Result: "+a);
	}

}
