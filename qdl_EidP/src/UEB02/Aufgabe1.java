package UEB02;

public class Aufgabe1 {

	public static void main(String[] args) {
		String str = "Hello World!";
		int n = 3;
		double r = 1.5;
		
		//4
		System.out.println("Startwerte:");
		System.out.println(str);
		System.out.println(n);
		System.out.println(r);
		
		//7+8
		n = sqr(n);
		r = sqr(r);
		
		//9
		System.out.println("Quadrate:");
		System.out.println(n);
		System.out.println(r);
		
		//12+13
		System.out.println("Zahlen: ");
		out(n);
		
		//14
		out(sqr(r));
		out(r);
		
		//15
		r = sqr(n);
		out(r);
		
		//18
		toStr(sqr(n));
		str = toStr(sqr(n));
		System.out.println("String:");
		System.out.println(str);
		
		//19
		toStr(sqr(r));
		str = toStr(sqr(r));
		System.out.println(str);
		
		//20
		System.out.println("Endwerte:");
		System.out.println(str);
		System.out.println(n);
		System.out.println(r);
	}
	
	//5
	public static int sqr(int n) {
		return n*n;
	}
	//6
	public static double sqr(double s) {
		return s*s;
	}
	
	//10
	public static void out(int n) {
		System.out.println("n = " + n);
	}
	
	//11
	public static void out(double d) {
		System.out.println("d = " + d);
	}
	
	//16
	public static String toStr(int n) {
		return "n = " + n;
	}
	
	//17
	public static String toStr(double d) {
		return "d = " + d;
	}
	
	//
}
