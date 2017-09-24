package strings_and_2d_arrays;

import java.util.Scanner;

public class CheckPermutation {
	
	public static boolean isPermutation(String input1, String input2) {
		String temp = input1;
		boolean lengthCondition = false;
		boolean input1CharsWithinInput2 = false;
		boolean input2CharsWithinInput1 = false;
		int i;
		if (input1.length() == input2.length()) {
			lengthCondition = true;
			for (i = 0; i < input2.length(); i++) {
				if (input1.indexOf(input2.charAt(i)) != -1) {
					if (input1.indexOf(input2.charAt(i)) == input1.length() - 1) {
						input1 = input1.substring(0, input1.length() - 1);
					} else {
						input1 = input1.substring(0, input1.indexOf(input2.charAt(i))) + input1.substring(input1.indexOf(input2.charAt(i)) + 1);
					}
					input2CharsWithinInput1 = true;
					continue;
				} else {
					input2CharsWithinInput1 = false;
					break;
				}
			}
			input1 = temp;
			for (i = 0; i < input1.length(); i++) {
				if (input2.indexOf(input1.charAt(i)) != -1) {
					if (input2.indexOf(input1.charAt(i)) == input2.length() - 1) {
						input2 = input2.substring(0, input2.length() - 1);
					} else {
						input2 = input2.substring(0, input2.indexOf(input1.charAt(i))) + input2.substring(input2.indexOf(input1.charAt(i)) + 1);
					}
					input1CharsWithinInput2 = true;
					continue;
				} else {
					input1CharsWithinInput2 = false;
					break;
				}
			} 
		} else {
			return lengthCondition;
		}
		return (lengthCondition && input2CharsWithinInput1 && input1CharsWithinInput2);
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given two strings, check if they are permutations of each other. Return true or false. 
		 
		 Permutation means - length of both the strings should same and should contain same set of characters. 
		 Order of characters doesn't matter. 
		 
		 Input format : 
		 Line 1 : String 1 
		 Line 2 : String 2
		 
		 Sample Input 1:
		 abcde
		 baedc
		 
		 Sample Output 1:
		 true
		 
		 Sample Input 2:
		 abc
		 cbd
		 
		 Sample Output 2:
		 false
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String input1 = scanner.next();
		System.out.print("Please enter another string to check if it is a permutation of the first string: ");
		String input2 = scanner.next();
		System.out.println(isPermutation(input1, input2));
	}

}
