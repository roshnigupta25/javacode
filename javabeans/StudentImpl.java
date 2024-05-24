package javabeans;

public class StudentImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student();
		std.setRollNo(123);
		std.setName("Roshni");
		std.setCourse("BSC. IT");
		std.setDivision('A');
		std.setPhoneNo(93726071);
		std.setEmailId("roshni@gmail.com");
		System.out.println("Roll no: "+std.getRollNo());
		System.out.println("Name: "+std.getName());
		System.out.println("Course: "+std.getCourse());
		System.out.println("Division: "+std.getDivision());
		System.out.println("Contact: "+std.getPhoneNo());
		System.out.println("Email id: "+std.getEmailId());
	}

}
