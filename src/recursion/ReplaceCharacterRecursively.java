package recursion;

import java.util.Scanner;

public class ReplaceCharacterRecursively {
	
	public static String replaceCharacter(String input, char c1, char c2) {
		if (input.isEmpty()) {
			return input;
		}
		String answer = "";
		if (input.charAt(0) != c1) {
			answer += input.charAt(0);
		} else {
			answer += c2;
		}
		String smallAnswer = replaceCharacter(input.substring(1), c1, c2);
		return answer + smallAnswer;
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 
		 with character c2 in the given string. 
		 
		 Do this recursively. 
		 
		 Input Format : 
		 Line 1 : Input String S 
		 Line 2 : Character c1 and c2 (separated by space) 
		 
		 Output Format : 
		 Updated string 
		 
		 Constraints : 
		 1 <= Length of String S <= 10^6 
		 
		 Sample Input : 
		 abacd 
		 a x 
		 
		 Sample Output : 
		 xbxcd
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string containing at least one character say c1 where you want to "
				+ "replace every occurrence of c1 with some other characrter say c2: ");
		String str = scanner.next();
		System.out.print("Please enter two characters c1 and c2 separated by space: ");
		char c1 = scanner.next().charAt(0);
		char c2 = scanner.next().charAt(0);
		System.out.printf("%s is the new string after replacing every occurrence "
				+ "of %c with %c from the string %s", replaceCharacter(str, c1, c2), c1, c2, str);
	}

}
