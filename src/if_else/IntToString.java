package if_else;

import java.util.Scanner;

public class IntToString {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please provide a number 1 or 2 or 3: ");
		int n = scanner.nextInt();
		if (n == 1) {
			System.out.println("One");
		} else if (n == 2) {
			System.out.println("Two");
		} else if (n == 3) {
			System.out.println("Three");
		}
	}

}
