package conditionals_loops;

import java.util.Scanner;

public class SumOfEvenAndOddDigitsOfANumber {
	
	public static void main(String[] args) {
		
		/*
		 * Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
		 * Digits means numbers not the places. That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
		 * Input Format: Integer N
		 * Output Format: Sum_of_Even_Digits Sum_of_Odd_Digits
		 * Print first even sum and then odd sum separated by space.
		 * 
		 * Sample Input: 1234
		 * Sample Output: 6 4
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer to calculate the sum of all its even digits and sum of all its odd digits: ");
		int n = scanner.nextInt();
		String input = Integer.toString(n);
		int sumOfEvenDigits = 0;
		int sumOfOddDigits = 0;
		int nextDigit;
		int i = 0;
		while (i < input.length()) {
			nextDigit = Character.getNumericValue(input.charAt(i));
			if (nextDigit % 2 == 0) {
				sumOfEvenDigits+= nextDigit;
			} else {
				sumOfOddDigits+= nextDigit;
			}
			i++;
		}
		System.out.println(sumOfEvenDigits + " " + sumOfOddDigits);
		
	}

}
