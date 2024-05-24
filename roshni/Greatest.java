package roshni;
import java.util.*;
public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
//		if (n1 > n2 && n1 > n3) {
//			System.out.println("largest number: "+n1);
//		}
//		else if (n2 > n1 && n2 > n3) {
//			System.out.println("largest number: "+n2);
//		}
//		else {
//			System.out.println("largest number: "+n3);
//		}
		
		int x = (n1 > n2)?n1:(n2 > n3)?n2: n3;
		System.out.println("largest number: "+x);
		
		

	}

}
