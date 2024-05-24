package arrays;

//wap to create an array of rollno, name, mark1, mark2, mark3 , total and average
//of 10 students and display their information accodingly
import java.util.*;
public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rollno[]=new int[3]; //decalration of arrrays
		String name[]=new String[10];
		int mark1[]=new int[1];
		int mark2[]=new int[1];
		int mark3[]=new int[1];
		int total[]=new int[1];
		double avg[]=new double[10];
		System.out.println("Enter student information");
		for(int i=0;i<1;i++)
		{
			System.out.println("Enter rollno");
		
		 rollno[i]=sc.nextInt();
		 System.out.println("Enter Name");
		 name[i]=sc.next();
		 System.out.println("Enter mark1");
		 mark1[i]=sc.nextInt();
		 System.out.println("Enter mark2");
		 mark2[i]=sc.nextInt();
		 System.out.println("Enter mark3");
		 mark3[i]=sc.nextInt();
		 total[i]=mark1[i]+mark2[i]+mark3[i];
		 avg[i]=total[i]/3.0;
				 
		}
		System.out.println("The Student information");
		for(int i=0;i<1;i++)
		{
			System.out.println("Rollno\t\tName\t\tTotal\t\tAverage");
			System.out.println(rollno[i]+"\t\t"+name[i]+"\t\t "+total[i]+"\t\t"+avg[i]);
		}
		
		

	}

}