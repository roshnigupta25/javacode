package javabeans;

public class EmployeeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails emp = new EmployeeDetails();
		//setter
		emp.setEmpNo(123);
		emp.setEmpName("Roshni");
		emp.setSalary(50000);
		emp.setAddress("Goregaon East");
		//getter
		System.out.println("Employee Id: "+emp.getEmpNo());
		System.out.println("Name: "+emp.getEmpName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("Address: "+emp.getAddress());
		
	}

}
