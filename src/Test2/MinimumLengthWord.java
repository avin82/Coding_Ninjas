package test2;

import java.util.Scanner;

public class MinimumLengthWord {
	
	public static String minLengthWord(String input) {
		String minLengthWord = "";
		int minLength = Integer.MAX_VALUE;
		String[] wordArray = input.split("\\s");
		for (int i = 0; i < wordArray.length; i++) {
			if (wordArray[i].length() < minLength) {
				minLengthWord = wordArray[i];
				minLength = wordArray[i].length();
			}
		}
		return minLengthWord;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a string S (that can contain multiple words), you need to find the word which has minimum length. 
		 
		 Note : If multiple words are of same length, then answer will be first minimum length word in the string. 
		 
		 Input Format : 
		 String S 
		 Output Format : 
		 Minimum length word 
		 
		 Constraints : 
		 1 <= Length of String S <= 10^5 
		 
		 Sample Input 1 : 
		 this is test string 
		 
		 Sample Output 1 : 
		 is 
		 
		 Sample Input 2 : 
		 abc de ghihjk a uvw h j 
		 
		 Sample Output 2 : 
		 a
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string to find the word with minimum length: ");
		String input = scanner.nextLine();
		System.out.println(minLengthWord(input));
	}

}
