package strings_and_2d_arrays;

import java.util.Scanner;

public class StringPalindrome {
	
	public static boolean isPalindrome(String str) {
		String reverseOfString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseOfString += str.charAt(i);
		}
		return str.equals(reverseOfString);
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a String s, check it its palindrome. Return true if string is palindrome, else return false. 
		 
		 Palindrome strings are those, where string s and its reverse is exactly same. 
		 
		 Input Format:
		 String S
		 
		 Output Format:
		 "true" if S is palindrome, else "false"
		 
		 Sample Input 1:
		 abcdcba
		 
		 Sample Output 1:
		 true
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string to check whether its palindrome or not: ");
		String str = scanner.next();
		System.out.println(isPalindrome(str));
	}

}
