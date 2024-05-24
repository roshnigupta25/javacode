package javabeans;

public class EmployeeDemo {

	private int Aadhar;
	private String empName;
	private int empAge;
	public int getAadhar() {
		return Aadhar;
	}
	public void setAadhar(int aadhar) {
		Aadhar = aadhar;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public EmployeeDemo(int aadhar, String empName, int empAge) {
		super();
		Aadhar = aadhar;
		this.empName = empName;
		this.empAge = empAge;
	}
	public EmployeeDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeDemo [Aadhar=" + Aadhar + ", empName=" + empName + ", empAge=" + empAge + "]";
	}
	

}
