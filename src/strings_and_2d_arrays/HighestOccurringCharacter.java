package strings_and_2d_arrays;

import java.util.Scanner;

public class HighestOccurringCharacter {
	
	public static char highestOccurringCharInString(String inputString) {
		int maxOccurrence = Integer.MIN_VALUE;
		char charWithHighestOccurrence = inputString.charAt(0);
		int count;
		for (int i = 0; i < inputString.length(); i++) {
			count = 0;
			for (int j = i + 1; j < inputString.length() - 1; j++) {
				if (inputString.charAt(j) != inputString.charAt(i)) {
					continue;
				} else {
					count++;
					if (count > maxOccurrence) {
						maxOccurrence = count;
						charWithHighestOccurrence = inputString.charAt(i);
					}
				}
				
			}
		}	
		return charWithHighestOccurrence;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a string, find and return the highest occurring character present in the given string. 
		 
		 If there are 2 characters in the input string with same frequency, return the character which comes first. 
		 
		 Note : Assume all the characters in the given string are lowercase. 
		 
		 Sample Input 1:
		 abdefgbabfba
		 
		 Sample Output 1:
		 b
		 
		 Sample Input 2:
		 xy
		 
		 Sample Output 2:
		 x
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string to find and return the highest occurring character present in the given string: ");
		String input = scanner.next();
		System.out.printf("%c is the highest occurring character in the user entered string.", highestOccurringCharInString(input));
	}

}
