package strings_and_2d_arrays;

import java.util.Scanner;

public class RemoveAllOccurrencesOfAChar {
	
	public static String removeAllOccurrencesOfChar(String input, char c) {
		String finalString = "";
		String[] individualWords = input.split("\\s");
		for (int i = 0; i < individualWords.length; i++) {
			int j;
			for (j = 0; j < individualWords[i].length(); j++) {
				if (individualWords[i].charAt(j) == c) {
					continue;
				} else {
					finalString += individualWords[i].charAt(j);
				}
			}
			if (i != individualWords.length - 1) {
				finalString += " ";
			} else {
				continue;
			}	
		}
		return finalString;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a string and a character x. Write a function to remove all occurrences of x character from the given string. 
		 
		 Leave the string as it is, if the given character is not present in the string. 
		 
		 Input format: 
		 Line 1 : Input string 
		 Line 2 : Character x
		 
		 Sample Input:
		 welcome to coding ninjas
		 o
		 
		 Sample Output:
		 welcme t cding ninjas
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string from which a character needs to be removed: ");
		String input = scanner.nextLine();
		System.out.print("Please enter a character x which needs to be removed from the entered string: ");
		char x = scanner.next().charAt(0);
		System.out.printf("The string obtained after removing all occurrences of character x from the entered string is as below: %n%s", removeAllOccurrencesOfChar(input, x));
	}

}
