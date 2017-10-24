package stacks_and_queues;

import java.util.EmptyStackException;

public class StackUsingArray {
	
	private int[] data;
	private int top;
	
	public StackUsingArray() {
		data = new int[10];
		top = -1;
	}
	
	public StackUsingArray(int capacity) {
		data = new int[capacity];
		top = -1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int size() {
		return top + 1;
	}
	
	public int top() throws StackEmptyException {
		if (size() == 0) {
			StackEmptyException emptyException = new StackEmptyException();
			throw emptyException;
		}
		return data[top];
	}
	
	public void push(int element) throws StackFullException {
		if (size() == data.length) {
//			StackFullException sfe = new StackFullException();
//			throw sfe;
			doubleCapacity();
		}
		top++;
		data[top] = element;
	}
	
	private void doubleCapacity() {
		int[] temp = data;
		data = new int[2 * data.length];
		for (int i = 0; i <= top; i++) {
			data[i] = temp[i];
		}
	}
	
	public int pop() throws StackEmptyException {
		if (size() == 0) {
			StackEmptyException emptyException = new StackEmptyException();
			throw emptyException;
		}
		int temp = data[top];
		top--;
		return temp;
	}

}
