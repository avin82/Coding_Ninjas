package while_loop;

import java.util.Scanner;

public class CheckPrime {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number to check for Prime: ");
		int n = scanner.nextInt();
		int d = 2;
		if (n < 2) {
			System.out.println("Not Prime. Prime numbers start from 2.");
			return;
		}
		while (d < n) {
			if (n % d == 0) {
				System.out.println("Not Prime.");
				return;
			}
			d++;
		}
		System.out.println("Prime.");
	}

}
