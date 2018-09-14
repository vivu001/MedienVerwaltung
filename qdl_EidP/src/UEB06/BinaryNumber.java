package UEB06;
import UEB05.Uebung05;

public class BinaryNumber {
	private int dec;
	
	// a)
	public BinaryNumber(int dec) {	
		this.dec = dec;
	}
	
	// b)
	public String toString() {	
		return toBin() + "";
	}
	
	// c)
	public int toBin() {
		return Uebung05.decToBin(dec);
	}
	
	// d)
	public int toDec() {
		return this.dec;
	}
	
	// e)
	public BinaryNumber add(BinaryNumber b) {		
		BinaryNumber result = new BinaryNumber(this.dec + b.toDec());	
		return result;
	}
	
	public static void main(String[] args) {
		BinaryNumber a = new BinaryNumber(20);
		BinaryNumber b = new BinaryNumber(15);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(a.add(b).toDec());
		System.out.println(a.add(b));
	}
}
 