package arrays;
import java.util.*;
class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];//array declaration
		System.out.println("Enter array elements: ");
		for(int i =0; i<a.length;i++) //input array elements
		{
			a[i] = sc.nextInt();
		}
		int pos=-1;//search element and position to mark
		System.out.println("Enter a search element: ");
		int se = sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(se == a[i]) {
				pos=i;
				break;//break the loop once element is found and mark the position
			}
		}
		if(pos>-1) {
			System.out.println("Element found at: "+(pos+1));
		}
		else {
			System.out.println("Element not found ");
		}
	}

}
