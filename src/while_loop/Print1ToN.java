package while_loop;

import java.util.Scanner;

public class Print1ToN {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the value of n to print numbers from 1 to n: ");
		int n = scanner.nextInt();
		int i = 1;
		while (i <= n) {
			System.out.println(i);
			i++;
		}
		
	}

}
