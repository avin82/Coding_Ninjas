package while_loop;

import java.util.Scanner;

public class SumOfEven1ToN {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the value of n so that sum of all even numbers from 1 to n can be printed: ");
		int n = scanner.nextInt();
		int i = 1, sum = 0;
		while (i <= n) {
			if (i % 2 == 0) {
				sum+= i;
			}
			i++;
		}
		System.out.printf("Sum of all even numbers from 1 to %d is %d", n, sum);
	}

}
