package constructor;
import java.util.*;
public class Employee 
{
	int empId;
	String empName, empAddr;
	public Employee(int a, String b,String c) 
	{
		empId = a;
		empName = b;
		empAddr = c;
	}
	public void display() {	
		
		System.out.println("Employee ID : "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Address: "+empAddr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Employee Address : ");
		String addr = sc.nextLine();
		System.out.println("Enter Employee ID : ");
		int id = sc.nextInt();
		Employee emp = new Employee(id, name, addr);
		emp.display();
		
	}

}
