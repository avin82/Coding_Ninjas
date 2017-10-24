package stacks_and_queues;

public class StackUse {
	
	public static void main(String[] args) throws StackFullException {
		StackUsingArray 	stack = new StackUsingArray(3);
		for (int i = 1; i <= 5; i++) {
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				e.printStackTrace();
			}
		}
		
		StackUsingLL<Integer> stackLL = new StackUsingLL<>();
		for (int i = 1; i <= 5; i++) {
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				e.printStackTrace();
			}
		}
	}

}
