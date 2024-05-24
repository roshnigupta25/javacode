package arrays;
import java.util.Scanner;

public class Divisibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array: ");
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Divisible by 2: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("Divisible by 3: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}
