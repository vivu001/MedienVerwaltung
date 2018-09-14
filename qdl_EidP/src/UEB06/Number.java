package UEB06;
import UEB05.Uebung05;

public class Number {
	int dec;
	
	// 2a)
	public Number(int dec) {
		this.dec = dec;
	}
	
	// 2b)
	public int toBase(int base) {
		int result = 0;
		switch (base) {
			case 2: result = Uebung05.decToBin(dec); 
					break;
			case 8: result = toOctal(dec); 
					break;
			case 10: result = dec; 
					break;
			default : System.out.println("Error !");				
		}	
		return result;
	}
	
	// 2c)
	public Number add(Number n) {
		Number result = new Number(this.dec + n.dec);
		return result;
	}
	
	// Aufgabe 3
	public int toOctal(int n) {
		int result = 0;
		int position = 1;	
		
		while (n > 0) { 
			result += (n % 8) * position;
			position *= 10;
			n /= 8;
		}	
		return result;
	}
	
	// Aufgabe 3
	public String toHex(int n) {
		String result="";	
		
		while (n > 0) {
			switch (n%16) {
				case 15: result += "F";
						break;
				case 14: result += "E";
						break;
				case 13: result += "D";
						break;
				case 12: result += "C";
						break;
				case 11: result += "B";
						break;
				case 10: result += "A";
						break;
				default: result += (n%16);
			}
			n /= 16;
		}		
		return result;
	}
	
	// Aufgabe 3
	public String toString(int base) {
		String result = "";
		
		switch (base) {
			case 2: result = "b"+ Uebung05.decToBin(dec); 
					break;
			case 8: result = "8:" + toOctal(dec); 
					break;
			case 10: result += dec; 
					break;
			case 16: result = "0x"+ toHex(dec);
					break;
			default : System.out.println("Error !");
		}
		return result;
	}
	
	public static void main(String[] args) {
		Number n = new Number(13);
		Number x = new Number(9);
				
		//Aufgabe 2
		System.out.println("Aufgabe 2");
		System.out.println(n.toBase(2));
		System.out.println(n.toBase(8));	
		System.out.println(n.toBase(10));
		System.out.println(n.add(x).toString(2));
		System.out.println(n.add(x).toString(8));
		System.out.println(n.add(x).toString(10));
		System.out.println();
		System.out.println();
		
		//Aufgabe 3
		System.out.println("Aufgabe 3");
		System.out.println(n.toString(2));
		System.out.println(n.toString(8));
		System.out.println(n.toString(10));
		System.out.println(n.toString(16));	
	}
}
