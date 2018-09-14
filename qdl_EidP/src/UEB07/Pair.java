package UEB07;

public class Pair {
	private int first, second;
	
	public Pair() {
		first = second = 0;
	}
	
	public Pair(int n) {
		first = second = n;
	}
	
	public Pair(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	public void setFirst(int newFirst) {
		first = newFirst;
	}
	
	public int getFirst() {
		return first;
	}
	
	public void setSecond(int newSecond) {
		second = newSecond;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void print() {
		System.out.println("[" + first + ", " + second + "]");
	}
	
	
}
