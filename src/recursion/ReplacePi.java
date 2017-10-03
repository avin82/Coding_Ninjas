package recursion;

import java.util.Scanner;

public class ReplacePi {
	
	public static String newString = "";
	
	private static String replacePiWithNumericValue(String input, int startIndex) {
		if (input.charAt(startIndex) == 'p') {
			if (input.charAt(startIndex + 1) == 'i') {
				newString += "3.14";
				startIndex += 2;
			} else {
				newString += input.charAt(startIndex);
				startIndex++;
			}
		} else {
			newString += input.charAt(startIndex);
			startIndex++;
		}
		if (startIndex < input.length() - 1) {
			replacePiWithNumericValue(input, startIndex);
		} else {
			if (input.substring(input.length() - 2) == "pi") {
				newString += "3.14";
			} 
			if (startIndex < input.length()) {
				newString += input.charAt(startIndex);
			}
		}
		return newString;
	}
	
	public static String replacePiWithNumericValue(String input) {
		return replacePiWithNumericValue(input, 0);
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14". 
		 
		 Sample Input 1 : 
		 xpix 
		 
		 Sample Output : 
		 x3.14x 
		 
		 Sample Input 2 : 
		 pipi 
		 
		 Sample Output : 
		 3.143.14 
		 
		 Sample Input 3 : 
		 pip 
		 
		 Sample Output : 3.14p
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string containing one or more occurrences of substring \"pi\": ");
		String str = scanner.next();
		System.out.printf("%s is the new string after replacing all the occurrences of \"pi\" with 3.14 from %s", replacePiWithNumericValue(str), str);
	}

}
