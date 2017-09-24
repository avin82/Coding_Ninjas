package operators_and_for_loops;

public class ContinueDemo {
	
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			if (i == 5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		
		System.out.println("----------------");
		
		for (int j = 1; j <= 10; j++) {
			if (j == 5) {
				continue;
			}
			System.out.println(j);
			
		}
	}

}
