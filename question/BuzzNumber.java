//1. Wap to input a number and check whether its buzz no or not.(Buzz no ends with 7 and divisible by 7)
package question;
import java.util.*; //to import scanner class
public class BuzzNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//making object of scanner class to take user input
		
		//taking user input
		System.out.println("Enter a number: ");
		int num = sc.nextInt(); //storing user input in num 
		
		//condition to check if num ends with 7 0r it is divissible by 7
		if(num % 10 == 7 || num % 7 == 0) 
		{
			System.out.println(num+" is a buzz number"); //if condition is true 
		}
		else 
		{
			System.out.println(num+" is not a buzz number"); //if condition is false
		}
	}//closing main method

}//closing class
