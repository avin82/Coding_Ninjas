package functions;

import java.util.Scanner;

public class Print1ToNWithFunction {
	
	public static void print1ToN(int n) {
		if (n <= 0) {
			return;
		}
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
			
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please print a number n to print numbers from 1 to n: ");
		int n = scanner.nextInt();
		print1ToN(n);
	}

}
