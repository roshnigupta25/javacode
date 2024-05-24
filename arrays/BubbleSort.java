package arrays;
import java.util.*;
public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int temp;

        // Input array elements
        System.out.println("Enter array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble sort
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    // Swap elements
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Output sorted array
        System.out.println("Array after sorting is:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close(); // Close the scanner
    }
}
