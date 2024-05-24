package loops;
import java.util.*;
public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//to take user input
        
        //Take array values from user
		System.out.println("Enter the elements of array: ");
		int a[] = new int[5];
		for(int i =0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		//print array elements
		System.out.println("The elements of array are: ");
		for(int i =0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		// Initialize variables to store highest and second highest values
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
        // Iterate through the array to find the highest and second highest values
		for(int num: a) {
			if(num>highest) 
			// Update both highest and second highest values
			{
				secondHighest = highest;
				highest = num;
			}
			else if(num > secondHighest && num != highest) 
			// Update only second highest value
			{
				secondHighest = num;
			}
		}
		// Output the second highest value
		System.out.println();
        System.out.println("The second highest value in the array is: " + secondHighest);
	}
}
