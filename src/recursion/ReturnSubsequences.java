package recursion;

import java.util.Scanner;

public class ReturnSubsequences {
	
	
	public static String[] findSubsequences(String str) {
		if (str.length() == 0) {
			String[] answer = {""};
			return answer;
		}
		String[] smallAnswer = findSubsequences(str.substring(1));
		String[] answer = new String[2 * smallAnswer.length];
		for (int i = 0; i < smallAnswer.length; i++) {
			answer[i] = smallAnswer[i];
		}
		for (int i = 0; i < smallAnswer.length; i++) {
			answer[i + smallAnswer.length] = str.charAt(0) + smallAnswer[i];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		/*
		 Return all the subsequences of a given string.
		 
		 A subsequence is a sequence that can be derived from another sequence by deleting some elements 
		 without changing the order of the remaining elements.
		 
		 Sample Input:
		 xyz
		 
		 Sample Output:
		 
		 z
		 y
		 yz
		 x
		 xz
		 xy
		 xyz
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string to return all its subsequences: ");
		String str = scanner.next();
		String[] subsequenceArray = findSubsequences(str);
		System.out.printf("Subsequences of the given string \"%s\" are: %n", str);
		for (int i = 0; i < subsequenceArray.length; i++) {
			System.out.println(subsequenceArray[i]);
			
		}
	}

}
