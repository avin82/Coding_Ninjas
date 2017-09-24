package conditionals_loops;

import java.util.Scanner;

public class PowerOfANumber {
	
	public static void main(String[] args) {
		
		/*
		 * Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
		 * Input format : Two integers x and n (separated by space) 
		 * Output Format : x^n (i.e. x raise to the power n) 
		 * Sample Input 1 : 3 4 
		 * Sample Output 1 : 81 
		 * Sample Input 2 : 2 5 
		 * Sample Output 2 : 32
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer say x and another integer n to calculate x to the power n (i.e. x^n): ");
		int x = scanner.nextInt();
		int n = scanner.nextInt();
		int i = 1, temp = 1;
		while (i <= n) {
			temp*= x;
			i++;
		}
		System.out.println(temp);
	}

}
