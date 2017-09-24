package operators_and_for_loops;

import java.util.Scanner;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		
		/*
		 Given a binary number as an integer N, convert it into decimal and print.
		 Input format:
		 An integer N
		 Output format:
		 Corresponding decimal number (as integer)
		 Sample Input 1:
		 1100
		 Sample Output 1:
		 12
		 Sample Input 2:
		 111
		 Sample Output 2:
		 7
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the binary number to convert it into decimal: ");
		int binary = scanner.nextInt();
		int decimal = 0, count = 1;
		int numberOfBinaryDigits = Integer.toString(binary).length();
			int columnValueFromRight = 1;
			while (columnValueFromRight <= numberOfBinaryDigits) {
				if (columnValueFromRight == 1) {
					if (Integer.toString(binary).charAt(numberOfBinaryDigits - count) == '0') {
						decimal = 0;
					} else if (Integer.toString(binary).charAt(numberOfBinaryDigits - 1) == '1') {
						decimal = 1;
					}
				} else {
					if (Integer.toString(binary).charAt(numberOfBinaryDigits - count) == '1') {
						int placeValue = (int) Math.pow(2, count - 1);
						decimal += placeValue;
					} 
				}
				columnValueFromRight++;
				count++;
			}
			System.out.println(decimal);
	}
}
