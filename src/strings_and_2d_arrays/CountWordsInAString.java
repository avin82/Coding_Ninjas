package strings_and_2d_arrays;

import java.util.Scanner;

public class CountWordsInAString {
	
	public static int countWords(String str) {
		String[] words = str.split("\\s");
		return words.length;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a string S, count number of words in the string. 
		 
		 Note : Assume there is single space between two words and there are no extra spaces before and after words. 
		 
		 Input Format:
		 String S
		 
		 Output Format:
		 Count of words
		 
		 Sample Input:
		 this is a sample string
		 
		 Sample Output:
		 5
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string to calculate the number of words contained in that string: ");
		String str = scanner.nextLine();
		System.out.printf("There are %d words in the user entered string.%n", countWords(str));
	}

}
