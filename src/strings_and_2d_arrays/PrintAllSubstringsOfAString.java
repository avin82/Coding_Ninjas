package strings_and_2d_arrays;

import java.util.Scanner;

public class PrintAllSubstringsOfAString {
	
	public static void printSubstringsOfAString(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length() + 1; j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}
	
	public static void main(String[] args) {
		
		/*
	
		 Given a String S of length n, print all its substrings. 
		 
		 Substring of a String S is a part of S (of any length from 1 to n), which contains all consecutive characters from S.
		 
		 Input Format:
		 String S
		 
		 Output Format:
		 All Substrings of S, one in each line
		 
		 The order in which you print substrings doesn't matter.
		 
		 Sample Input 1:
		 xyz
		 
		 Sample Output 1:
		 x
		 xy
		 xyz
		 y
		 yz
		 z
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string to print all the substring of the entered string: ");
		String str = scanner.next();
		printSubstringsOfAString(str);
	}

}
