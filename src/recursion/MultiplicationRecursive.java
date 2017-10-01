package recursion;

import java.util.Scanner;

public class MultiplicationRecursive {
	
	public static int sum = 0;
	
	public static int multiplyTwoIntegers(int m, int n) {
		if (m > 0) {
			sum += n;
			m--;
			multiplyTwoIntegers(m, n);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given two integers m & n, calculate and return their multiplication using recursion. You can only use 
		 subtraction and addition for your calculation. No other operators are allowed. 
		 
		 Input format : m and n (separated by space) 
		 
		 Sample Input : 
		 3 5 
		 
		 Sample Output :	
		 15
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter two integers m and n separated by space: ");
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		System.out.printf("Multplication of %d and %d recursively yields the result %d", m, n, multiplyTwoIntegers(m, n));
	}

}
