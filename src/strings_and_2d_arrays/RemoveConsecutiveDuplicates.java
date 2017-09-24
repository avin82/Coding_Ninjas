package strings_and_2d_arrays;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	
	public static String removeConsecutiveDuplicatesFromString(String str) {
		String newStr = "";
		int i;
		for (i = 1; i < str.length(); i++) {
			int j = i - 1;
			if (str.charAt(i) != str.charAt(j)) {
				newStr += str.charAt(j);
				if (i == str.length() - 1) {
					newStr += str.charAt(i);
				}
			} else {
				if (i == str.length() - 1) {
					newStr += str.charAt(i);
				}
				continue;
			}	
		}
		return newStr;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a string, remove all the consecutive duplicates that are present in the given string. 
		 That means, if 'aaa' is present in the string then it should become 'a' in the output string.
		 
		 Sample Input:
		 aabccbaa
		 
		 Sample Output:
		 abcba
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string to remove all the consecutive duplicates: ");
		String str = scanner.next();
		System.out.printf("The new string after removing duplicates is %s%n", removeConsecutiveDuplicatesFromString(str));
	}

}
