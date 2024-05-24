package loops;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		int rem=0,sum=0;
		int copy = a;
		while(a>0)
		{
		rem=a%10;  //121->1
		sum=sum*10+rem;//0+1->1
		a=a/10;     //121/10->12
		}
		if(sum==copy) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}

}
