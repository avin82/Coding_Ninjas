package operators_and_for_loops;

import java.util.Scanner;

public class NthFibonacciNumber {
	
	public static int nthFibonacci(int n) {
		
		int first = 0, second = 1, next = 0;
		if (n <= 1) {
			return n;
		} else {
			for (int i = 2; i <= n; i++) {
				next = first + second;
				first = second;
				second = next;
			}
			return next;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		/*
		 Nth term of fibonacci series F(n) is calculated using the formula - 
		 F(n) = F(n-1) + F(n-2)
		 Provided N you have to find the Nth Fibonacci Number. Also F(1) = F(2) = 1
		 Input Format: Integer n
		 Output Format: Nth Fibonacci term i.e. F(n)
		 Sample Input: 4
		 Sample Output: 3
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please provide a number n to calculate the nth number in Fibonacci Series: ");
		int n = scanner.nextInt();
		System.out.printf("The nth number of fibonacci series is %d", nthFibonacci(n));
		
	}

}
