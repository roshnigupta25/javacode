package javabeans;

public class Student {

	private int rollNo;
	private String name, course,emailId;
	private long phoneNo;
	private char division;
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", emailId=" + emailId
				+ ", phoneNo=" + phoneNo + ", division=" + division + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, String course, String emailId, long phoneNo, char division) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.division = division;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public char getDivision() {
		return division;
	}
	public void setDivision(char c) {
		this.division = c;
	}
}
