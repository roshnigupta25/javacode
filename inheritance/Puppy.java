package inheritance;
//multilevel
public class Puppy extends Dog {
	public void play() {
		System.out.println("Playing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy pp = new Puppy();
		pp.eat();
		pp.bark();
		pp.play();
	}

}
