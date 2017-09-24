package operators_and_for_loops;

public class Scope1 {
	
	public static void main(String[] args) {
		
		int i = 10;
		System.out.println(i);
		if (i == 10) {
			int n = 23;
			System.out.println(i);
			System.out.println(n);
		} else {
			int n = 232;
		}
		int n = 4;
		System.out.println(n);
		i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
