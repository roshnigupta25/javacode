package inheritance;

public class CitizenShip extends Person {

	public void getCitizenShip() {
		System.out.println("Citizenship ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CitizenShip c=new CitizenShip();
		c.getLastName();
		c.getFirstName();
		c.getCitizenShip();

	}

}
