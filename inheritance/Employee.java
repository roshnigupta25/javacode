package inheritance;

public class Employee {
	int emp_Id;
	String emp_Name;
	Address add;//aggregation: create an object of another class and use it here
	
	public Employee(int emp_Id, String emp_Name, Address add) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.add = add;
	}
	public void display() {
		System.out.println("Emp_Id: "+emp_Id+" Emp_Name: "+emp_Name);
		System.out.println(add.house_No+add.house_Name+add.city+add.country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1 = new Address(" ,Krishna Nagar",", Mumbai"," ,Maharashtra"," ,India",402);//cons for object class
		Address a2 = new Address(" ,Bhavan"," ,Mumbai"," ,Maharashtra"," ,India",402);
		Employee emp1 = new Employee(101,"Roshni",a1);//constructor input for employee
		Employee emp2 = new Employee(102,"Khushika",a2);
		emp1.display();
		emp2.display();
	}

}
