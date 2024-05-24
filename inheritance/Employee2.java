package inheritance;

public class Employee2 extends Person {
	
	public void getSalary() {
		System.out.println("Salary ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e= new Employee2();
		e.getFirstName();
		e.getLastName();
	}

}
