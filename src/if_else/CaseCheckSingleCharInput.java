package if_else;

import java.util.Scanner;

public class CaseCheckSingleCharInput {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a single character: ");
		char c = scanner.next().charAt(0);
		if (c >= 'A' && c <= 'Z') {
			System.out.println(1);
		} else if (c >= 'a' && c <= 'z') {
			System.out.println(0);
		} else {
			System.out.println(1-2);
		}
		
	}

}
