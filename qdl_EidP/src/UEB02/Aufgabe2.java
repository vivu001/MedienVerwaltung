package UEB02;

public class Aufgabe2 {

	public static void main(String[] args) {
		int n = 7;
		double d = 1.2;
		
		//3
		out("Hello World!");
		out(n);
		out(d);
		
		//4
		out(sqr(n));
		out(sqr(d));
		
		//5
		outn(sqr(n));
		outn(sqr(d));
		n1();
		
		//6
		for (int i=1; i<=n; i++) {
			outn(i);
			if (i==n) n1();
		}
		
		//7
		for (int i=1; i<=n; i++) {
			outn(sqr(i));
			if (i==n) n1();
		}
		
		//8
		for (int i=0; i<n-1; i++) {
			outn(sqr(d*i));
			if (i==n-2) n1();
		}
		
		//9
		for (int i=0; i<n-1; i++) {
			outn(d*i);
			if (i==n-2) n1();
		}
		
		//10
		out(sum(n));
	}
	
	//2
	public static String toStr(int n) {
		return "n:" + n;
	}
	public static String toStr(double d) {
		return "d:" + d;
	}
	
	//3
	public static void out(String str) {
		System.out.println(str);
	}
	public static void out(int n) {
		System.out.println(toStr(n));
	}
	public static void out(double d) {
		System.out.println(toStr(d));
	}
	
	//4
	public static int sqr(int n) {
		return n*n;
	}
	public static double sqr(double d) {
		return d*d;
	}
	
	//5
	public static void outn(String str) {
		System.out.print(str+" ");
	}
	public static void outn(int n) {
		System.out.print(toStr(n)+" ");
	}
	public static void outn(double d) {
		System.out.print(toStr(d)+" ");
	}
	public static void n1() {
		System.out.println();
	}
	
	//10
	public static int oddSum(int n) {
		int s1=0;
		for (int i=1; i<=n; i++) {
			if (i%2==1) s1+=i;
		}
		return s1;
	}
	public static int evenSum(int n) {
		int s2=0;
		for (int i=1; i<=n; i++) {
			if (i%2==0) s2+=i;
		}
		return s2;
	}
	
	public static int sum(int n) {
		return oddSum(n)+evenSum(n);
	}
}
