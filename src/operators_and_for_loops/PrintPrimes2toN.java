package operators_and_for_loops;

import java.util.Scanner;

public class PrintPrimes2toN {
	
	public static boolean checkPrime(int a) {
		boolean isPrime = true;
		int d = 2;
		while (d <= a - 1) {
			if (a % d == 0) {
				isPrime = false;
			}
			d++;
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		
		/*
		 Given an integer N, print all the prime numbers that lie between 2 to N (both inclusive).
		 Print the prime numbers in different lines.
		 Input Format: Integer N
		 Output Format: Prime number in different lines
		 Constraints: 1 <= N <= 100
		 Sample Input: 9
		 Sample Output: 
		 2
		 3
		 5
		 7
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number n to print prime numbers between 2 and n: ");
		int n = scanner.nextInt();
		if (n < 2) {
			System.out.println("Prime numbers start from 2");
			return;	// Terminate the program using return statement
		} else if (n == 2) {
			System.out.println(n);
			return; // Terminate the program using return statement
		} else {
			System.out.println(2);
			int i = 3;
			while (i <= n) {
				if (checkPrime(i)) {
					System.out.println(i);
				}
				i++;
			}
		}
		
	}

}
