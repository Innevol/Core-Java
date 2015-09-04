package walmartProblem;

import java.util.Date;
import java.util.Scanner;

public class walmartProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Walmart \n------------------");
		
		Date date = new Date();
		
		System.out.println("Date: " + date);
		
		System.out.println("\nEnter username: ");
		
		Scanner inp1 = new Scanner(System.in);
		
		String username = inp1.nextLine();
		
		System.out.println("Enter password: ");
		
		Scanner inp2 = new Scanner(System.in);
		
		String password = inp2.nextLine();

	}

}
