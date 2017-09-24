package operators_and_for_loops;

import java.time.Year;
import java.util.Scanner;

public class MinMaxWithoutBranching {
	
	public static void main(String[] args) {
		
		/*
		 
		 Calculate minimum and maximum of two numbers without branching.
		 Branching is using ternary or if-else
		 
		 */
		
		// Using bit manipulation
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter two numbers with space in between or a return: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        

//        System.out.printf("Minimum of the two numbers is %d%n", y ^ ((x ^ y) & -(x < y)));
//        System.out.printf("Maximum of the two numbers is %d%n", x ^ ((x ^ y) & -(x < y)));	
	}

}
