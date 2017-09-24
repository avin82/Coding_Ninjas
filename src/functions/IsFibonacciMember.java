package functions;

import java.util.Scanner;

public class IsFibonacciMember {
	
	public static boolean isFibonacciNumber(int n) {
		int first = 0, second = 1, next = 0;
		if (n == 0 || n == 1) {
			next = first + second;
			return (n == first || n == second || n == next);
		}
		for (int i = 2; i <= n; i++) {
			next = first + second;
			first = second;
			second = next;
			if (n == first || n == second || n == next) {
				break;
			} 
		}
		return (n == first || n == second || n == next);
	}
	
	
	public static void main(String[] args) {
		
		/*
		 Given a number N, figure out if it is a member of fibonacci series or not. Return true if the member is number of fibonacci
		 series else false.
		 Fibonacci Series is defined by the recurrence
		 F(n) = F(n-1) + F(n-2)
		 
		 Input Format:
		 Integer N
		 Output Format:
		 true or false
		 Sample Input 1:
		 5
		 Sample Output 1:
		 true
		 Sample Input 2:
		 14
		 Sample Output 2:
		 false
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number to check whether its a member of Fibonacci series: ");
		int n = scanner.nextInt();
		System.out.println(isFibonacciNumber(n));
	}

}
