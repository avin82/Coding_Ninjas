package recursion;

import java.util.Scanner;

public class PairStar {
	
	public static String newString = "";
	
	private static String addStars(String s, int startIndex) {
		if (startIndex < s.length() - 1) {
			if (startIndex >= 1 && s.charAt(startIndex - 1) == s.charAt(startIndex)) {
				newString += "*";
			}
			if (s.charAt(startIndex) == s.charAt(startIndex + 1)) {
				newString += Character.toString(s.charAt(startIndex)) + "*" + Character.toString(s.charAt(startIndex + 1));
				startIndex += 2;
			} else {
				newString += Character.toString(s.charAt(startIndex)) + Character.toString(s.charAt(startIndex + 1));
				startIndex += 2;
			}
		}
		if (startIndex < s.length() - 1) {
			addStars(s, startIndex);
		} else {
			if (startIndex < s.length() - 2) {
				if (s.charAt(s.length() - 3) == s.charAt(s.length() - 2)) {
					newString += Character.toString(s.charAt(s.length() - 2)) + "*" + Character.toString(s.charAt(s.length() - 3));
				}
			}
			if (startIndex <= s.length() - 1 && s.charAt(startIndex - 1) == s.charAt(startIndex)) {
				newString += "*";
			}
			if (startIndex < s.length()) {
				newString += s.charAt(startIndex);
			}
		}
		return newString;
	}
	
	public static String addStars(String s) {
		return addStars(s, 0);
	}
	
	public static void main(String[] args) {
		
		/*
		 
		 Given a string, compute recursively a new string where identical chars that are adjacent in the original string 
		 are separated from each other by a "*". 
		 
		 Sample Input 1 : 
		 hello 
		 
		 Sample Output 1: 
		 hel*lo 
		 
		 Sample Input 2 : 
		 xxyy 
		 
		 Sample Output 2: 
		 x*xy*y 
		 
		 Sample Input 3 : 
		 aaaa 
		 
		 Sample Output 3: 
		 a*a*a*a
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string with some identical chars that are adjacent: ");
		String str = scanner.next();
		System.out.printf("%s is the string where identical chars that are adjacent in the original string %s are separated from each other by a \"*\"", addStars(str), str);
	}

}
