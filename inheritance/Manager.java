package inheritance;

public class Manager extends Employee2{

	public void getPost() {
		System.out.println("Post ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager();
		m.getFirstName();
		m.getLastName();
		m.getSalary();
		m.getPost();
	}

}
