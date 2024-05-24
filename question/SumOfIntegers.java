//2. Write a program to input 10 integers and find the sum of two-digit as well as three-digit numbers separately.
package question;
import java.util.*; //to import scanner class

public class SumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //making object of scanner class to take user input
		int twoDigitSum = 0; //declaring variable to store sum of two digit numbers
		int threeDigitSum = 0; ////declaring variable to store sum of three digit numbers
		
		//Accepting user input
		System.out.println("Enter the integers: ");
		for(int i=0; i<=10; i++) 
		{
			int num = sc.nextInt(); //storing user input in num
			
			if(num >= 10 && num <= 99) //condition for checking two digit number
			{
				twoDigitSum += num; //adding two digit numbers and storing in twoDigitSum
			}
			else if(num >= 100 && num <= 999) //condition for checking three digit number
			{
				threeDigitSum += num; //adding three digit numbers and storing in threeDigitSum
			}
		}
		System.out.println("The sum of two digit numbers is: "+twoDigitSum); //to print sum of two digit numbers
		System.out.println("The sum of three digit numbers is: "+threeDigitSum); //to print sum of three digit numbers
	}//closing main method

}//closing class
