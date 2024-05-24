package roshni;
import java.util.*;// importing packages
public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Scanner class for taking input from user
		System.out.println("Enter marks obtained in English out of 100: "); //taking user input for marks
		int english = sc.nextInt();//storing input value of user in variable
		System.out.println("Enter marks obtained in Maths out of 100: ");//taking user input for marks
		int maths = sc.nextInt();//storing input value of user in variable
		System.out.println("Enter marks obtained in Science out of 100: ");//taking user input for marks
		int science = sc.nextInt();//storing input value of user in variable
		
		
		if (english >= 80 && maths >= 80 && science >= 80 )//condition for pure science
		{
			System.out.println("According to your percentage eligible stream for you is Pure Science ");
		}
		else if (english >= 60 && maths >= 60 && science >= 60) //condition for pure Commerce
		{
			System.out.println("According to your percentage eligible stream for you is Commerce ");
		}
		else if (english >= 80 && maths >= 80 || science <= 60)//condition for Bio. science
		{
			System.out.println("According to your percentage eligible stream for you is Bio. Science");
		}
		else // if any of the condition is not satisfied
		{
			System.out.println("Better Luck Next Time!");//print this
		}//closing else 
	}//main method is closed

}// class is closed
