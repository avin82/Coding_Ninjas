package recursion;

import java.util.Scanner;

public class SumOfDigitsMethod2 {
	
	public static int sum = 0;
	
	public static int sumOfDigits(int input) {
		sum += input % 10;
		input = input / 10;
		if (input > 0) {
			sumOfDigits(input);
		}
		return sum;
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
