package recursion;

import java.util.Scanner;

public class ReturnKeypad {
	
	public static String[] keypad(int n) {
		if (n == 0) {
			String[] answer = {""};
			return answer;
		}
		String[] smallAnswer = keypad(n / 10);
		char[] charactersForUnitDigit = findCharactersForUnitDigit(n % 10);
		String[] answer = new String[smallAnswer.length * charactersForUnitDigit.length];
		int k = 0;
		for (int i = 0; i < smallAnswer.length; i++) {
			for (int j = 0; j < charactersForUnitDigit.length; j++) {
				answer[k] = smallAnswer[i] + charactersForUnitDigit[j];
				k++;
			}
		}
		return answer;
	}
	
	public static char[] findCharactersForUnitDigit(int n) {
		char[] charForUnitDigit = null;
		switch (n) {
		case 2:
			charForUnitDigit = new char[]{'a', 'b', 'c'};
			break;
		case 3:
			charForUnitDigit = new char[]{'d', 'e', 'f'};
			break;
		case 4:
			charForUnitDigit = new char[]{'g', 'h', 'i'};
			break;
		case 5:
			charForUnitDigit = new char[]{'j', 'k', 'l'};
			break;
		case 6:
			charForUnitDigit = new char[]{'m', 'n', 'o'};
			break;
		case 7:
			charForUnitDigit = new char[]{'p', 'q', 'r', 's'};
			break;
		case 8:
			charForUnitDigit = new char[]{'t', 'u', 'v'};
			break;
		case 9:
			charForUnitDigit = new char[]{'w', 'x', 'y', 'z'};
			break;
		}
		return charForUnitDigit;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n. 
		 
		 Note : The order of strings are not important. 
		 
		 Input Format : 
		 Integer n 
		 
		 Output Format : 
		 All possible strings in different lines 
		 
		 Constraints : 
		 1 <= n <= 10^6 
		 
		 Sample Input: 
		 23 
		 
		 Sample Output: 
		 ad 
		 ae 
		 af 
		 bd 
		 be 
		 bf 
		 cd 
		 ce 
		 cf
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer n to find all possible keypad combinations: ");
		int n = scanner.nextInt();
		String[] keypadCombinations = keypad(n);
		for (int i = 0; i < keypadCombinations.length; i++) {
			System.out.println(keypadCombinations[i]);
			
		}
	}

}
