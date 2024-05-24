package arrays;
import java.util.*;
public class Volume {
	public int volumeShapes(int s) 
	{
		int a = s*s*s;
		return a;
	}
	public double volumeShapes(double l, double b, double h) 
	{
		double d = l*b*h;
		return d;
	}
	public double volumeShapes(double r) 
	{
		double c = (4/3)*3.14*r*r*r;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volume v = new Volume();
		Scanner sc = new Scanner(System.in);
		double length, breadth, height, radius;
		int  side;
		System.out.println("Enter side of a cube: ");
		side = sc.nextInt();
		System.out.println("Enter length, breadth and height of a cuboid: ");
		length = sc.nextDouble();
		breadth = sc.nextDouble();
		height = sc.nextDouble();
		System.out.println("Enter radius of a sphere: ");
		radius = sc.nextDouble();
		
		System.out.println("Volume of cube is: "+v.volumeShapes(side));
		System.out.println("Area of square is: "+v.volumeShapes(length, breadth, height));
		System.out.println("Area of square is: "+v.volumeShapes(radius));
	}

}
