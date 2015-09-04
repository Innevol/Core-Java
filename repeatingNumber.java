package repeating;

import java.util.Random;

public class repeatingNumber {

	public static String nonDuplicate(String str) {

		str = "No Duplicate";
		
		System.out.println(str);
		
		return str;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		repeatingNumber obj1 = new repeatingNumber();

		Random rand = new Random();

		int j;

		int k;

		int arr[] = new int[1000000];

		for (int i = 0; i < arr.length - 1; i++) {

			arr[i] = rand.nextInt(1000000);

		}

		for (j = 0; j < arr.length - 1; j++)

			for (k = j + 1; k < arr.length - 1; k++)

				if (arr[j] == arr[k]) {

					System.out
							.println("There is a duplicate, the duplicate number is: "
									+ arr[j]);

					System.exit(0);

				} else if (arr[j] != arr[k] && j == arr.length) {
					
					String str2 = null;

					String output = nonDuplicate(str2);
					
					System.out.println(str2);

				}
	}

}