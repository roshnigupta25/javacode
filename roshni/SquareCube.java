package roshni;

public class SquareCube {

	  public static void main(String[] args) {
	    int[] numbers = {2, 3, 4};

	    for (int number : numbers) {
	      int square = number * number;
	      int cube = number * number * number;

	      System.out.println(square);
	      System.out.println(cube);
	    }
	  }
	}
