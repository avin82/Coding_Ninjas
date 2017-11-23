package maps;

import java.util.HashMap;
import java.util.Scanner;

public class ExtractUniqueChars {
	
	public static String uniqueChar(String str) {
		String output = "";
		HashMap<Character, Integer> map = new HashMap<>();
		int value = 1;
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), value);
				output += str.charAt(i);
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		/*
		 Given a string, you need to remove all the duplicates. That means, the output string 
		 should contain each character only once. The respective order of characters should remain same. 
		 
		 Input format : 
		 String S 
		 
		 Output format : 
		 Output String 
		 
		 Constraints : 
		 1 <= Length of S <= 50000 
		 
		 Sample Input 1 : 
		 ababacd 
		 
		 Sample Output 1 : 
		 abcd 
		 
		 Sample Input 2 : 
		 abcde 
		 
		 Sample Output 2 : 
		 abcde
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string to extract unique characters from it in order: ");
		String str = scanner.next();
		System.out.println(uniqueChar(str));
	}

}
