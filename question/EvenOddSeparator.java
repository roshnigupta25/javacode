//3. Write a program in Java to accept 20 numbers in a single dimensional array arr[20]. 
//Transfer and store all the even numbers in an array even[ ] and all the odd numbers in another array odd[ ]. 
//Finally, print the elements of both the arrays.
package question;
import java.util.*; //to import scanner class
public class EvenOddSeparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //making object of scanner class to take user input
		int arr[] = new int[20]; //declared array with size 20, where user will store user input
		int even[] = new int[20];//declared even number array to store even numbers
		int odd[] = new int[20]; //declared odd number array to store odd numbers
		
		// Accept 20 numbers in the array
		System.out.println("Enter the numbers: ");
		for(int i=0; i<20; i++)
		{
			arr[i] = sc.nextInt();		//will store user value in array
		}
		
		int evenCount = 0; //to store even array elements 
		int oddCount = 0; //to store odd array elements 
		
		// Separate even and odd numbers into separate arrays
		for(int i=0; i<20; i++)
		{
			if(arr[i] % 2 == 0) //to check whether element is even or not
			{
				even[evenCount++] = arr[i]; //storing even elements in even[]
			}
			else
			{
				odd[oddCount++] = arr[i]; ////storing odd elements in odd[]
			}
		}
		
		// Printing elements of even number array
		System.out.println("Elements of Even array: ");
		for(int i=0; i < evenCount; i++)
		{
			System.out.println(even[i]);
		}
		System.out.println();
		
		// Printing elements of odd number array
		System.out.println("Elements of Odd array: ");
		for(int i=0; i < oddCount; i++)
		{
			System.out.println(odd[i]);
		}
	}//closing main method

} //closing class
