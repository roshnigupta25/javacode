package inheritance;
import java.util.Scanner;

//Class to compute the perimeter of different shapes using method overloading
public class Perimeter {

 // Method to compute the perimeter of a square
 public double computePerimeter(double side) {
     return 4 * side;
 }

 // Method to compute the perimeter of a rectangle
 public double computePerimeter(double length, double breadth) {
     return 2 * (length + breadth);
 }

 // Method to compute the perimeter of a circle
 public double computePerimeter(double radius, boolean isCircle) {
     return 2 * (22.0 / 7) * radius;
 }

 // Main method to take user input and compute the perimeter
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Perimeter perimeter = new Perimeter();

     // Compute perimeter of a square
     System.out.print("Enter the side side of the square: ");
     double side = scanner.nextDouble();
     System.out.println("Perimeter of the square: " + perimeter.computePerimeter(side));

     // Compute perimeter of a rectangle
     System.out.print("Enter the length of the rectangle: ");
     double length = scanner.nextDouble();
     System.out.print("Enter the breadth of the rectangle: ");
     double breadth = scanner.nextDouble();
     System.out.println("Perimeter of the rectangle: " + perimeter.computePerimeter(length, breadth));

     // Compute perimeter of a circle
     System.out.print("Enter the radius of the circle: ");
     double radius = scanner.nextDouble();
     System.out.println("Perimeter of the circle: " + perimeter.computePerimeter(radius, true));

     // Close the scanner
     scanner.close();
 }
}
