package strings_and_2d_arrays;

import java.util.Scanner;

public class StringCompression {
	
	public static String compress(String inputString) {
		String compressedString = "";
		int i, count;
		for (i = 0; i < inputString.length(); i++) {
			count = 0;
			if (i == inputString.length() - 1) {
				compressedString += inputString.charAt(i);
				break;
			}
			for (int j = i + 1; j < inputString.length(); j++) {
				if (j == inputString.length() - 1 && inputString.charAt(j) == inputString.charAt(i)) {
					compressedString += inputString.charAt(i) + Integer.toString(count + 2);
					return compressedString;
				}
				if (inputString.charAt(j) == inputString.charAt(i)) {
					count++;	
					continue;
				}
				if (count >= 1) {
					compressedString += inputString.charAt(i) + Integer.toString(count + 1);
					i = j - 1;
					break;
				} else {
					compressedString += inputString.charAt(i);
					i = j - 1;
					break;
				}
			}
		}
		return compressedString;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Write a program to do basic string compression. For a character which is repeated more than once, 
		 replace consecutive duplicate occurrences with the count of repetitions e.g. if a String has 'x' repeated 5 times, 
		 replace this "xxxxx" with "x5". 
		 
		 Note : You don't need to print the changed string.
		 
		 Sample Input:
		 aaabbccdsa
		 
		 Sample Output:
		 a3b2c2dsa
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string to perform basic string compression: ");
		String inputString = scanner.next();
		System.out.println(compress(inputString));
		
	}

}
