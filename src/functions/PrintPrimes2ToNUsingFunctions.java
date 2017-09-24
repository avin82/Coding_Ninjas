package functions;

import java.util.Scanner;

public class PrintPrimes2ToNUsingFunctions {
	
	public static boolean isPrime(int n) {
		int d = 2;
		while (d < n) {
			if (n % d == 0) {
				return false;
			}
			d++;
		}
		return true;
	}
	
	public static void printPrimes2ToN(int n) {
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number n to print prime numbers from 2 to n: ");
		int n = scanner.nextInt();
		printPrimes2ToN(n);
	}

}
