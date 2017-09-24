package strings_and_2d_arrays;

import java.util.Scanner;

public class PrintAllStringPrefix {
	
	public static void printStringPrefixes(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(0, i + 1));
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string to print all the string prefixes: ");
		String str = scanner.next();
		printStringPrefixes(str);
	}

}
