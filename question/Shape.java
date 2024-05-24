package question;
import java.util.*;
public class Shape {
	public double area(double r) //circle
	{
		double a = 3.14*r*r;
		return a;
	}
	public int area(int x) //square
	{
		int side = x*x;
		return side;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		Scanner sc = new Scanner(System.in);
		int a;
		double b;
		System.out.println("Enter: ");
		a = sc.nextInt();
		b = sc.nextDouble();
		
		System.out.println("Area of circle is: "+s.area(b));
		System.out.println("Area of square is: "+s.area(a));
	}

}
