package strings_and_2d_arrays;

import java.util.Scanner;

public class ReverseStringWordWise {
	
	public static String reverseWordWise(String str) {
		String[] words = str.split("\\s");
		String reverse = "";
		for (int i = words.length - 1; i >= 0; i--) {
			reverse += words[i] + " ";
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Reverse the given string word wise. That is, the last word in given string should come at 1st place, 
		 last second word at 2nd place and so on. Individual words should remain as it is.
		 
		 Sample Input:
		 Welcome to Coding Ninjas
		 
		 Sample Output:
		 Ninjas Coding to Welcome
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string to print all the substring of the entered string: ");
		String str = scanner.nextLine();
		System.out.println(reverseWordWise(str));
	}

}
