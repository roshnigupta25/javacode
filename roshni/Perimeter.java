
package roshni;
import java.util.*;

public class Perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);// to take input from the user
		System.out.println("Program to find Perimeter of");
		System.out.println("1. Square");
		System.out.println("2. Rectangle");
		System.out.println("3. Circle");
		System.out.println("Enter your choice: ");// user has to enter their choice
		int ch = sc.nextInt();
		switch(ch) {
		case 1: 
			// to find perimeter of a square 
			System.out.println("Enter side of a square: ");
			float side = sc.nextFloat();
			float square = 4*side; //formula
			System.out.println("Perimeter of a square is: "+square);
			break;// terminates the case after execution
		case 2:
			// to find perimeter of a rectangle
			System.out.println("Enter length of a rectangle: ");
			float length = sc.nextFloat();
			System.out.println("Enter breadth of a rectangle: ");
			float breadth = sc.nextFloat();
			float rect = 2 * (length + breadth);//formula
			System.out.println("Perimeter of a reactangle is: "+rect);
			break;
		case 3:
			// to find perimeter of a circle
			System.out.println("Enter the radius of a circle: ");
			float radius = sc.nextFloat();
			 float circle = (2*(22/7)*radius);//formula
			System.out.println("Perimeter of a circle is: "+circle);
			break;
		default:
			// if you make choice which is invalid
			System.out.println("Invalid choice!!");
			System.out.println("You have to choose between 1, 2 and 3");
			break;
		} // closing switch case
		
	}//closing public method

}// closing class
