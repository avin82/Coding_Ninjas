package generics;

public class PairUse {
	
	public static void main(String[] args) {
		Pair<String, String> p = new Pair<String, String>("ab", "cd");
		p.setFirst("def");
		String s = p.getFirst();
		
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "temp");
		Pair<Character, Character> p2 = new Pair<>('a', 'c');
		
		int a = 23;
		int b = 10;
		int c = 29;
		
		Pair<Integer, Integer> internalPair = new Pair<>(a, b);
		Pair<Pair<Integer, Integer>, Integer> p3 = new Pair<>(internalPair, c);
		System.out.println(p3.getSecond());
		System.out.println(p3.getFirst().getFirst());
		System.out.println(p3.getFirst().getSecond());
	}

}
