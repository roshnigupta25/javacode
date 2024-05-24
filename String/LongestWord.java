package String;
import java.util.*;
public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str, word,lword;
		System.out.println("Enter a string: ");
		str = sc.nextLine();
		word="";
		lword = "";
		str=str+" ";//read the last word
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch==' ') {
				if(word.length()>lword.length())//compare 2 words 
					{
					lword = word;
				}
				word="";
			}
			else {
				word = word + ch;
			}
		}
		System.out.println("Longest is: "+lword+" and it's length is "+lword.length());
	}

}
