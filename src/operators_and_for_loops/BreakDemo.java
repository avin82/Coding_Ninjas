package operators_and_for_loops;

import java.util.Scanner;

public class BreakDemo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number n to check whether its prime or not: ");
		int n = scanner.nextInt();
		boolean divided = false;
		int d = 2;
		while (d < n) {
			if (n % d == 0) {
				divided = true;
				break;
			}
			d++;
		}
		if (divided) {
			System.out.println("Not Prime.");
		} else {
			System.out.println("Prime.");
		}
	}

}
