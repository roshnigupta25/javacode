package String;
import java.util.*;
public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int vowel = 0, cons = 0;
		System.out.println("Enter a sentence: ");
		String input = sc.nextLine();
		for(int i=0;i<input.length();i++) {
			char e = input.charAt(i);//extract the individual character
			if(e=='a'||e=='i'||e=='e'||e=='o'||e=='u'||e=='A'||e=='E'||e=='I'||e=='O'||e=='U') {
				vowel++;
			}
			else {
				cons++;
			}
			
		}
		System.out.println("Number of Vowels are: "+vowel);
		System.out.println("Number of Consonants are: "+cons);
	}

}
