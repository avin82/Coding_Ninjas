package recursion;

import java.util.Scanner;

public class CheckPalindrome {
	
	public static String reverse = "";
	
	private static boolean isStringPalindrome(String input, int index) {
			reverse += input.charAt(index);
			index--;
			if (index >= 0) {
				isStringPalindrome(input, index);
			}
		return input.equals(reverse);
	}
	
	public static boolean isStringPalindrome(String input) {
		return isStringPalindrome(input, input.length() - 1);
	}
	
	public static void main(String[] args) {
		
		/*
		 Check if a given String S is palindrome or not (using recursion). Return true or false. 
		 
		 Input Format : 
		 String S 
		 
		 Output Format : 
		 true or false 
		 
		 Sample Input 1 : 
		 racecar 
		 
		 Sample Output 1: 
		 true 
		 
		 Sample Input 2 : 
		 ninja 
		 
		 Sample Output 2: 
		 false
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string to check if its palindrome or not: ");
		String str = scanner.next();
		System.out.println(isStringPalindrome(str));
	}

}
