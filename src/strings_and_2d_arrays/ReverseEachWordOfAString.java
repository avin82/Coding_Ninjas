package strings_and_2d_arrays;

import java.util.Scanner;

public class ReverseEachWordOfAString {
	
	public static String reverseWordsOfAStringIndividually(String input) {
		String finalString = "";
		String[] individualWords = input.split("\\s");
		for (int i = 0; i < individualWords.length; i++) {
			int j;
			for (j = individualWords[i].length() - 1; j >= 0; j--) {
				finalString += individualWords[i].charAt(j);
			}
			if (i != individualWords.length - 1) {
				finalString += " ";
			} else {
				continue;
			}	
		}
		return finalString;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a string S, reverse each word of a string individually. For eg. if a string is "abc def", 
		 reversed string should be "cba fed".
		 
		 Input Format:
		 String S
		 
		 Output Format:
		 Updated String
		 
		 Constraints:
		 1 <= Length of S <= 1000
		 
		 Sample Input:
		 Welcome to Coding Ninjas
		 
		 Sample Output:
		 emocleW ot gnidoC sajniN
		 
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string to reverse each word of the string individually: ");
		String input = scanner.nextLine();
		System.out.printf("The string obtained after reversing each word of a string individually is as below: %n%s", reverseWordsOfAStringIndividually(input));	
	}

}
