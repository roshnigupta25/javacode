package roshni;
import java.util.Scanner;

public class CalcOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		
		int a,b,ch;
		
		
		System.out.println("1. Addition");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Division");
		System.out.println("Enter your choice: ");
		ch = scanner.nextInt();
		System.out.println("Enter value of a: ");
		a = scanner.nextInt();
		System.out.println("Enter value of b: ");
		b = scanner.nextInt();
		switch(ch) {
		case 1:
			int sum = a + b;
			System.out.println("Addition is: "+sum);
			break;
		case 2:
			int sub = a - b;
			System.out.println("Subtraction is: "+sub);
			break;
		case 3:
			int mul = a * b;
			System.out.println("Multiplication is: "+mul);
			break;
		case 4:
			int div = a / b;
			System.out.println("Division is: "+div);
			break;
		default:
			System.out.println("Invalid input!!!");
			break;
		}
	}

}
