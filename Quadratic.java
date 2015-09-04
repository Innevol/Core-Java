package Quadratic;

import java.util.Scanner;

class prob1 {

	private Scanner input2;
	private Scanner input3;
	private Scanner input1;

	double determinant() {
		
		System.out.println("Please enter an integer for a");

		input1 = new Scanner(System.in);

		System.out.println("Please enter an integer for b");

		input2 = new Scanner(System.in);

		System.out.println("Please enter an integer for c");

		input3 = new Scanner(System.in);

		int a = input1.nextInt();

		int b = input2.nextInt();

		int c = input3.nextInt();

		int deter = (b * b) - (4 * a * c);

		System.out.println("Your discriminant is: " + deter);
		
		double square = b + Math.sqrt(deter);
		
		double quad = square / (2 * a);
		
		return quad;	
		
	}

	}

public class Quadratic {

	public static void main(String[] args) {

		prob1 z = new prob1();

		z.determinant();
		
		double quadAnswer = z.determinant();

		System.out.println("The answer is: " + quadAnswer);
	}

}
