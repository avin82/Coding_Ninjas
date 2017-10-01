package recursion;

import java.util.Scanner;

public class SumOfDigits {
	
	public static int sum = 0;
	
	private static int sumOfDigits(String input, int index) {
		sum += Character.getNumericValue(input.charAt(index));
		index--;
		if (index >= 0) {
			sumOfDigits(input, index);
		}
		return sum;
	}
	
	public static int sumOfDigits(int input) {
		String inputAsString = Integer.toString(input);
		return sumOfDigits(inputAsString, inputAsString.length() - 1);
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Write a recursive function that returns the sum of the digits of a given integer. 
		 
		 Sample Input : 
		 12345 
		 
		 Sample Output : 
		 15
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer to find the sum of its digits: ");
		int n = scanner.nextInt();
		System.out.printf("Sum of digits of %d is %d", n, sumOfDigits(n));
	}

}
