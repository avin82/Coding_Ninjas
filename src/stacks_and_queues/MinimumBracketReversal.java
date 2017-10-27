package stacks_and_queues;

import java.util.Scanner;

public class MinimumBracketReversal {
	
	public static int numOfBracketReversals = 0;
	
	public static int countBracketReversals(String input){
		StackUsingLL<Character> stack1 = new StackUsingLL<>();
		StackUsingLL<Character> stack2 = new StackUsingLL<>();
		int i = 0;
		for (i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '{') {
				stack1.push(input.charAt(i));
			} else if (input.charAt(i) == '}') {
				stack2.push(input.charAt(i));
			}
		}
		if ((stack1.size() + stack2.size()) % 2 != 0 ) {
			numOfBracketReversals = -1;
		} else if (stack1.size() == stack2.size()) {
			numOfBracketReversals = 0;
		} else if (stack1.size() > stack2.size()) {
			numOfBracketReversals = (stack1.size() - stack2.size()) / 2;
		} else if (stack1.size() < stack2.size()) {
			numOfBracketReversals = (stack2.size() - stack1.size()) / 2;
		}
		return numOfBracketReversals;
	}
	
	public static void main(String[] args) {
		/*
		 Given a string expression which consists only ‘}’ and ‘{‘. The expression may not be balanced. 
		 You need to find the minimum number of bracket reversals which are required to make the expression balanced. 
		 
		 Return -1 if the given expression can't be balanced. 
		 
		 Input Format : 
		 String S 
		 
		 Output Format : 
		 Required count 
		 
		 Sample Input 1 : 
		 {{{ 
		 
		 Sample Output 1 : 
		 -1 
		 
		 Sample Input 2 : 
		 {{{{}} 
		 
		 Sample Output 2 : 
		 1
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string expression with only \'{\' and \'}\' brackets\n"
				+ "to find minimum number of bracket reversals to make the expression balanced: ");
		String strExp = scanner.nextLine();
		System.out.println(countBracketReversals(strExp));
	}

}
