package recursion;

import java.util.Scanner;

public class CountZeroesInAnInteger {
	public static int count = 0;
	public static String intAsString = "";
	public static String newIntAsString = "";
	
	private static int countZeroes(String str, int startIndex) {
		if (str.charAt(startIndex) == '0') {
			count++;
		}
		if (str.length() == 1) {
			return count;
		} else {
			newIntAsString = str.substring(1);
			countZeroes(newIntAsString, 0);
		}
		return count;
	}
	
	public static int countZeroes(int input) {
		intAsString = Integer.toString(input);
		return countZeroes(intAsString, 0);
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given an integer n, count and return the number of zeros that are present in the given integer using recursion. 
		 
		 Input Format : 
		 Integer n 
		 
		 Output Format : 
		 No. of 0s 
		 
		 Sample Input : 
		 10204 
		 
		 Sample Output :
		 2
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int n = scanner.nextInt();
		System.out.printf("There are %d zero(s) in the integer %d", countZeroes(n), n);
	}

}
