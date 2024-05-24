package constructor;
import java.util.*;
public class CalculatorConstructor {
	int x,y;
/*	public CalculatorConstructor()//default constructor 
	{
		x=0;
		y=0;
	}*/
	public CalculatorConstructor()//no-args constructor used for output
	{
		System.out.println("Welcome");
	}
	public CalculatorConstructor(int a, int b)//parameterized
	{
		int sum = a+b;
		int diff = a-b;
		int prod = a*b;
		int div = a/b;
		System.out.println("Sum is: "+sum);
		System.out.println("Difference is: "+diff);
		System.out.println("Product is: "+prod);
		System.out.println("Division is: "+div);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorConstructor cc = new CalculatorConstructor(); //default
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int c = sc.nextInt();
		int d = sc.nextInt();
		CalculatorConstructor cc1 = new CalculatorConstructor(c,d);//parameter
	}

}
