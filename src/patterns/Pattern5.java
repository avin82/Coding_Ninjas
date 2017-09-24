package patterns;

import java.util.Scanner;

public class Pattern5 {
	
	public static void main(String[] args) {
		
		/*
		 * Print the following pattern: Pattern for N = 4
		 *    1
		 *   23
		 *  345
		 * 4567
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to build the pattern: ");
		int n = scanner.nextInt();
		int i = 1;
		while (i <= n) {
			int space = 1;
			while (space <= (n - i)) {
				System.out.print(" ");
				space++;
			}
			int j = 1, val = i;
			while (j <= i) {
				System.out.print(val);
				j++;
				val++;
			}
			System.out.println();
			i++;
		}
	}

}
