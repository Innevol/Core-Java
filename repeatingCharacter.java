package repeating;

import java.util.Scanner;

public class repeatingCharacter {
	
	static String hello(String str) {
		
		str = "Hello";
		
		return str;
		
	}
	
public static char charCheck(char arr2[], String inpProcess) {
	
	for(int j = 0; j != inpProcess.length();) {
		
		int counter = 0;
		
		for(int k = 0; k < arr2.length; k++) {
			
			if(j != k) {
				
				if(inpProcess.charAt(j) != arr2[k]) {
					
					counter++;
					
				}
				
			}
			
			if(counter == inpProcess.length() - 1) {
				
				return inpProcess.charAt(j);
				
			}
			
		}
		
		j++;
		
	}		
		
	return 0;	
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter a string");

		Scanner inp1 = new Scanner(System.in);

		String input = inp1.nextLine().toLowerCase();;
		
		char arr[] =  new char[input.length()];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = input.charAt(i);
			
		}
		
		String hello2 = hello("Hi there");
		
		System.out.println(hello2);
		
		char repeat = charCheck(arr, input);
		
		System.out.println("The first non-repeating character is: " + repeat);

	}

}