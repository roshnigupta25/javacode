package interface12;

public class Vehicle implements Car, Bike{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
		v.ride();
		v.drive();
		v.park();
	}

	@Override
	public void ride() {
		// TODO Auto-generated method stub
		System.out.println("Love ride to Car");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Love drive to Car");
	}

	@Override
	public void park() {
		// TODO Auto-generated method stub
		System.out.println("Love park to Car");
	}

}
