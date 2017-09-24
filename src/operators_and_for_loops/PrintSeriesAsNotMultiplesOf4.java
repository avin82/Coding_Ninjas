package operators_and_for_loops;

import java.util.Scanner;

public class PrintSeriesAsNotMultiplesOf4 {
	
	public static boolean isMultipleOf4(int n) {
		boolean isMultiple = false;
		if (n % 4 == 0) {
			isMultiple = true;
		}
		return isMultiple;
	}
	
	public static void main(String[] args) {
		
		/*
		 Write a program to print first x terms of the series 3N + 2 which are not multiples of 4. 
		 N varies from 1 to 1000.
		 Input format:
		 Integer x
		 Output format:
		 Terms of series ( separated by space)
		 Sample Input 1: 
		 10
		 Sample Output 1:
		 5 11 14 17 23 26 29 35 38 41
		 Sample Input 2: 
		 4
		 Sample Output 2:
		 5 11 14 17
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please provide a number x to print first x terms of the series 3N + 2 which are not multiples of 4 where 1 <= N <= 1000: ");
		int x = scanner.nextInt();
		int n = 1, count = 0;
		while (n <= 1000) {
			if (!isMultipleOf4(3 * n + 2)) {
				System.out.print(3 * n + 2);
				System.out.print(" ");
				count++;
				if (count == x) {
					break;
				}
			}
			n++;
		}
	}

}
