package functions;

public class Increment {
	
	public static void increment(int n) {
		n = n + 1;
	}
	
	public static void main(String[] args) {
		
		int n = 10;
		increment(n);	//	Pass by value
		System.out.println(n);
	}

}
