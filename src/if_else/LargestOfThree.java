package if_else;

import java.util.Scanner;

public class LargestOfThree {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please provide three numbers: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if (a >= b && a >= c) {
			System.out.printf("%d is largest", a);
		} else if (b >= c && b >= a) {
			System.out.printf("%d is largest", b);
		} else {
			System.out.printf("%d is largest", c);
		}
	}

}
