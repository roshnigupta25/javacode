package roshni;
import java.util.*;
public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: "); //taking user input for name
		String name = sc.nextLine();//storing name of user in variable
		
		System.out.println("Enter your Annual Income: "); //taking user input for income
		double income = sc.nextDouble();//storing income of user in variable
		System.out.println("Name of the Employee: "+name);//prints employee name
		
		double tax = 0; //initializing tax as 0
		double amount = 0;//initializing amount as 0
		if (income <= 250000) {
			//No tax
			tax= 0;
			System.out.println("Your tax amount is: "+tax);//prints tax 
			amount = income - tax;// amount after tax deduction
			System.out.println("Your income amount after tax deduction is: "+amount);//prints amount
			
		}
		else if(income >= 250001 && income <= 500000) {
			//10% of the income exceeding ₹2,50,000
			tax = (income - 250000)*0.1;
			System.out.println("Tax amount is: "+tax);
			amount = income - tax;
			System.out.println("Income amount after tax deduction is: "+amount);
		}
		else if(income >= 500001 && income <= 1000000) {
			// ₹30,000 + 20% of the amount exceeding   ₹5,00,000
			tax = 30000 + (income - 500000)*0.2;
			System.out.println("Tax amount is: "+tax);
			amount = income - tax;
			System.out.println("Income amount after tax deduction is: "+amount);
		}
		else if(income >= 1000001) {
			//₹50,000 + 30% of the amount exceeding ₹10,00,000
			tax = 50000 + (income - 1000000)*0.3;
			System.out.println("Tax amount is: "+tax);
			amount = income - tax;
			System.out.println("Income amount after tax deduction is: "+amount);
		}
	}

}
