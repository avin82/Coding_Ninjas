package recursion;

import java.util.Scanner;

public class NumericStringToInteger {
	
	public static int sum = 0;
	public static int power = 0;
	
	private static int convertStringToInt(String input, int startIndex) {
		sum += Character.getNumericValue(input.charAt(startIndex)) * Math.pow(10, power);
		startIndex--;
		power++;
		if (startIndex >= 0) {
			convertStringToInt(input, startIndex);
		}
		return sum;
	}
	
	public static int convertStringToInt(String input) {
		return convertStringToInt(input, input.length() - 1);
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Write a recursive function to convert a given string into the number it represents. 
		 That is input will be a numeric string that contains only numbers, you need to convert the string 
		 into corresponding integer and return the answer. 
		 
		 Input format : 
		 Numeric string (string, Eg. "1234") 
		 
		 Output format : Corresponding integer (int, Eg. 1234) 
		 
		 Sample Input 1 : 
		 1231 
		 
		 Sample Output 1: 
		 1231 
		 
		 Sample Input 2 : 
		 12567 
		 
		 Sample Output 2 : 
		 12567
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a numeric string i.e. the input string should only contain numbers: ");
		String str = scanner.next();
		System.out.printf("%d is the correspoding integer after converting the numeric string %s to integer recursively", convertStringToInt(str), str);
		
	}

}
