package arrays;
import java.util.*;
public class ArrayPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//to receive input
		int a[]=new int [10];
		System.out.println("Enter Array: ");
		for(int i=0; i<a.length;i++) //to create index
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The array elements are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.println("Reverse array: ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
