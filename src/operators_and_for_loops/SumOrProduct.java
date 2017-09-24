package operators_and_for_loops;

import java.util.Scanner;

public class SumOrProduct {
	
	public static int sum1ToN(int n) {
		int i = 1, sum = 0;
		while (i <= n) {
			sum += i;
			i++;
		}
		return sum;
	}
	
	public static int product1ToN(int n) {
		int i = 1, product = 1;
		while (i <= n) {
			product *= i;
			i++;
		}
		return product;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Write a program that asks the user for a number N and a choice C. 
		 And then give him the possibility to choose between computing the sum and computing the product of 1 ,..., N. 
		 If user enters C is equal to -
		 1 : Print sum of 1 to N numbers 
		 2 : Print product of 1 to N numbers 
		 Any other number : print -1
		 Input format: 
		 Line 1: Integer N
		 Line 2: Choice C (1 or 2)
		 Output format: 
		 Sum or product according to user's choice
		 Sample Input 1:
		 10
		 1
		 Sample Output 1: 55
		 Sample Input 2:
		 10
		 2
		 Sample Output 2:
		 3628800
		 Sample Input 3:
		 10
		 4
		 Sample Output 3:
		 -1
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please provide a number n to find the sum or product of numbers from 1 to n: ");
		int n = scanner.nextInt();
		System.out.print("For computing the sum enter 1, for computing the product enter 2: ");
		int c = scanner.nextInt();
		if (c == 1) {
			System.out.println(sum1ToN(n));
		} else if (c == 2) {
			System.out.println(product1ToN(n));
		} else {
			System.out.println(-1);
		}
	}

}
