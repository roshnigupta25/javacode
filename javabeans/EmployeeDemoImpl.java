package javabeans;

public class EmployeeDemoImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDemo empl = new EmployeeDemo();
		empl.setAadhar(123456789);
		empl.setEmpAge(20);
		empl.setEmpName("Roshni");
		System.out.println("Employee name is: "+empl.getEmpName());
		System.out.println("Employee age is: "+empl.getEmpAge());
		System.out.println("Employee Adhar Number is: "+empl.getAadhar());
	}

}
