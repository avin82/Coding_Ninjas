package recursion;

import java.util.Scanner;

public class PrintNumbers {
	
	public static int i = 0;
	
	public static void print(int n) {
		if (n <= 0 || n > 10000) {
			return;
		} else if (n == 1) {
			System.out.print(++i);
		} else {
			System.out.print(++i + " ");	
			print(--n);
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a number n, print number from 1 to n in increasing order recursively. 
		 
		 Input Format : 
		 Integer n 
		 
		 Output Format : 
		 Numbers from 1 to n (separated by space) 
		 
		 Constraints : 
		 1 <= n <= 10000 
		 
		 Sample Input : 
		 6 
		 
		 Sample Output : 
		 1 2 3 4 5 6
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number n to print numbers from 1 to n in incresing order recursively: ");
		int n = scanner.nextInt();
		print(n);
	}

}
