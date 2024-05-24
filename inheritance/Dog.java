package inheritance;

public class Dog extends Animal {
	public void bark() {
		System.out.println("Animal is barking");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		//Animal d = new Animal(); not able to read bark method
		//Dog d = (Dog)new Animal(); not possible to create
		d.eat();
		d.bark();
	}

}
