package String;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();
		String str1 = "";
		str = str + " ";
		for(int i = 0; i<str.length(); i++) {
			char e = str.charAt(i);
			str1 = e + str1;
		}
		
		
	if(str.equals(str1)) {
		System.out.println("It's a Palindrome");
	}
	else {
		System.out.println("Not a Palindrome");
	}
	}

}
