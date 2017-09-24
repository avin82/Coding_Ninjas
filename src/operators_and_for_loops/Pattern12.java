package operators_and_for_loops;

import java.util.Scanner;

public class Pattern12 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to build the pattern: ");
		int n = scanner.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				System.out.print(j + " ");
				j++;
				if (j > i) {
					break;
				}
			}
			System.out.println();
			i++;
		}
		
	}

}
