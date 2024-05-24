package loops;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,i;
		long fact=1;
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		for(i = 1; i<=num;i++) {
			fact *= i;//fact = fact * i;
		}
		System.out.println("factorial of "+num +" is "+fact);
	}

}
