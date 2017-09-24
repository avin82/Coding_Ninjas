package if_else;

import java.util.Scanner;

public class CaseCheckSingleCharInputUsingAscii {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a single character: ");
		char c = scanner.next().charAt(0);
		if (c >= 65 && c <= 90) {
			System.out.println(1);
		} else if (c >= 97 && c <= 122) {
			System.out.println(0);
		} else {
			System.out.println(1-2);
		}
	}

}
