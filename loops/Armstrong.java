package loops;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 int num, copy, sum=0,rem;
		 System.out.println("Enter a number: ");
		 num = scanner.nextInt();
		 copy=num;
		 while(num!=0) {
			 rem = num%10;//extract the last digit eg:153510=3
			 sum = sum+rem*rem*rem;//FIND THE SUM EG: SUM=0+3*3*3
			 num = num/10;//EXTRACT REMAINING DIGITS LEAVING THE LAST ONE EG:153/10=15
		 }
		 if(copy==sum) {
			 System.out.println("It is an Armstrong number");
		 }
		 else {
			 System.out.println("Not an Armstrong Number");
		 }
	}

}
