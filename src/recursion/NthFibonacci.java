package recursion;

import java.util.Scanner;

public class NthFibonacci {
	
	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number n to find nth Fibanacci number: ");
		int n = scanner.nextInt();
		System.out.printf("%dth Fibonacci number is %d", n, fib(n));
	}

}
