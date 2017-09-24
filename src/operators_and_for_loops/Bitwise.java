package operators_and_for_loops;

public class Bitwise {
	
	public static void main(String[] args) {
		
		System.out.println(2 & 3);
		System.out.println(2 | 3);
		System.out.println(2 ^ 3);
		System.out.println(~2);
		System.out.println(34 << 1);
		System.out.println(34 >> 2);
		System.out.println(-4 << 1);
		System.out.println(-4 >> 1);
		
		int a = 42;
		int b = ~a;
		System.out.println(a + " " + b);
	}

}
