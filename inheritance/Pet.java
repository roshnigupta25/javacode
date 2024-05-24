package inheritance;

public class Pet extends Animal {
	public void sound() {
		System.out.println("meow");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet p =new Pet();
		p.sound();
		p.eat();
	}

}
