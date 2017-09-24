package operators_and_for_loops;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static int getQuotientOnDividingBy2(int n) {
		return n / 2;
	}
	
	public static int getRemainderOnDividingBy2(int n) {
		return n % 2;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a decimal number (integer N), convert it into binary and print. 
		 The binary number should be in the form of an integer. 
		 Note : The given input number could be large, so the corresponding binary number can exceed the integer range. 
		 So take the answer as long.
		 Input format: Integer N
		 Output format: Corresponding Binary number (long)
		 Sample Input 1:
		 12
		 Sample Output 1:
		 1100
		 Sample Input 2:
		 7
		 Sample Output 2:
		 111
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the decimal number to convert it to binary: ");
		int decimal = scanner.nextInt();
		String stringOfRemainders = "";
		String reverseOfStringOfRemainders = "";
		int dividend = decimal;
		while (dividend != 0) {
			int remainder = getRemainderOnDividingBy2(dividend);
			stringOfRemainders += remainder;
			int quotient = getQuotientOnDividingBy2(dividend);
			dividend = quotient;
		}
		
		for (int i = stringOfRemainders.length(); i >= 1 ; i--) {
			reverseOfStringOfRemainders += stringOfRemainders.charAt(i - 1);
		}

		System.out.println(Long.parseLong(reverseOfStringOfRemainders));
		
		
	}
}
