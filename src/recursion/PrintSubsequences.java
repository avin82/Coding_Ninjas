package recursion;

import java.util.Scanner;

public class PrintSubsequences {
	
	public static void printSubsequences(String str) {
		printSubsequences(str, "");
	}
	
	public static void printSubsequences(String str, String outputSoFar) {
		if (str.length() == 0) {
			System.out.println(outputSoFar);
			return;
		}
		printSubsequences(str.substring(1), outputSoFar);
		printSubsequences(str.substring(1), outputSoFar + str.charAt(0));
	}
	
	public static void main(String[] args) {
		
		/*
		 Print all the subsequences of a given string. No need to store the subsequences, just directly print them.
		 
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
		System.out.print("Please enter a string to print all its subsequences: ");
		String str = scanner.next();
		System.out.printf("All the possible subsequences of %s are as given below: %n", str);
		printSubsequences(str);
	}

}
