	package generics;

public class Pair<T, V> {
	private T first;
	private V second;

	public Pair(T first, V second) {
		this.first = first;
		this.second = second;
	}
	
	public void setFirst(T first) {
		this.first = first;
	}
	
	public T getFirst() {
		return first;
	}
	
	public void setSecond(V second) {
		this.second = second;
	}
	
	public V getSecond() {
		return second;
	}
}
