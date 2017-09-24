package operators_and_for_loops;

import java.util.Scanner;

public class CheckOppositeSignOfTwoIntegers {
	
	public static boolean oppositeSignCheckIntegers(int x, int y) {
		return ((x ^ y) < 0);
	}
	
	public static void main(String[] args) {
		
		//	Detect if two Integers have opposite Signs (Bit Manipulation)
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please provide the two integer values separated by a space or return to check for opposite signs: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.printf("The two integers inputted have opposite signs: %b", oppositeSignCheckIntegers(x, y));
	}

}
