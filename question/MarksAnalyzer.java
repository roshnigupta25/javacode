//4.	The class teacher wants to store the marks obtained in English, Maths and Science of her class having 40 students. 
//Write a program to input marks in Eng, Science and Maths by using three single dimensional arrays. 
//Calculate and print the following information: (i) Average marks secured by each student. 
//(ii) Class average in each subject. [Hint: Class average is the average marks obtained by 40 students in a particular subject.

package question;
import java.util.*; //to import scanner class
public class MarksAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //making object of scanner class to take user input
		
		// Create arrays to store marks for each subject
		int englishMarks[] = new int[40]; //english
		int mathsMarks[] = new int[40];	 //maths
		int scienceMarks[] = new int[40]; //science
		
		//accepting user input
		for(int i=0; i<40; i++)
		{
			System.out.println("Enter marks for Student "+(i + 1)+" : ");
			System.out.println("English: ");
			englishMarks[i] = sc.nextInt(); //taking input of english marks
			System.out.println("Maths: ");
			mathsMarks[i] = sc.nextInt();   //taking input of maths marks
			System.out.println("Science: ");
			scienceMarks[i] = sc.nextInt();  //taking input of science marks
		}
		
		// Calculate and print average marks secured by each student
		System.out.println("\nAverage marks secured by each student: ");
		for(int i=0 ; i<40; i++)
		{
			double averageMarks = (englishMarks[i]+mathsMarks[i]+scienceMarks[i])/3; //calculating average marks of all 3 subjects for each student
			System.out.println("Average marks of Student "+(i + 1)+" is: "+averageMarks);
		}
		
		//calculating class avverage
		double englishClassAverage = calculateClassAverage(englishMarks); //calling method and calculating class average marks of English
		double mathsClassAverage = calculateClassAverage(mathsMarks);  //calling method and calculating class average marks of Maths
		double scienceClassAverage = calculateClassAverage(scienceMarks);  //calling method and calculating class average marks of Science
		
		//printing class average marks
		System.out.println("\nClass average in each subject:");
	    System.out.println("English: " + englishClassAverage); //english
	    System.out.println("Science: " + scienceClassAverage); //maths
	    System.out.println("Maths: " + mathsClassAverage); //science
	}// closing main method
	
	// Method to calculate class average for a subject
	public static double calculateClassAverage(int[] marks) {
        int sum = 0; //initializing sum as 0
        for (int mark : marks) {
            sum += mark;
        }
        return sum / 40.0; //returning sum
    }//closing calculateClassAverage() methos
}//closing class
