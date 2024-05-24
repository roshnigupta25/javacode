package loops;
import java.util.*;
public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,sum=0,i;
		System.out.println("enter a number: ");
		num=sc.nextInt();
		for(i=1;i<num;i++) {
			if (num%i==0) //checking whether number is divisible by i
				{
				sum = sum + i;//sum of the factors
			}
		}
		if (num == sum) //check whether number is equal to sum
			{
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not Perfect Number");
		}
	}

}
