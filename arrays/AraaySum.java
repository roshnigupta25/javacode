package arrays;
import java.util.*;
public class AraaySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements: ");
		int a[]=new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are: ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		int evenSum=0;
		int oddSum=0;
		for(int num: a ) {
			if(num % 2 ==0) {
				evenSum += num;
			}
			else {
				oddSum += num;
			}
		}
		System.out.println("Sum of the even numbers: "+evenSum);
		System.out.println("Sum of the odd numbers: "+oddSum);
	}

}
