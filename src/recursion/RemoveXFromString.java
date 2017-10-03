package recursion;

import java.util.Scanner;

public class RemoveXFromString {
	
	public static String newString = "";
	
	private static String removeX(String input, int startIndex) {
		if (startIndex < input.length()) {
			if (input.charAt(startIndex) == 'x') {
				startIndex++;
			}
		}
		if (startIndex < input.length()) {
			if (input.charAt(startIndex) != 'x') {
				newString += input.charAt(startIndex);
				startIndex++;
			}
		}
		if (startIndex < input.length()) {
			removeX(input, startIndex);
		}
		return newString;
	}
	
	public static String removeX(String input) {
		return removeX(input, 0);
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a string, compute recursively a new string where all 'x' chars have been removed. 
		 
		 Sample Input 1 : 
		 xaxb 
		 
		 Sample Output 1: 
		 ab 
		 
		 Sample Input 2 : 
		 abc 
		 
		 Sample Output 2: 
		 abc 
		 
		 Sample Input 3 : 
		 xx 
		 
		 Sample Output 3:
		 
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string containing one or more occurrences of \'x\': ");
		String str = scanner.next();
		System.out.printf("%s is the new string after removing all the occurrences of \'x\' from %s", removeX(str), str);
		
	}

}
