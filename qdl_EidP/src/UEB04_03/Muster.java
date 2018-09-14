package UEB04_03;

public class Muster {
	public static void main(String[] args) {
		muster_1(5); System.out.println();
		muster_2(4); System.out.println();
		muster_3(4); System.out.println();
		muster_4(5); System.out.println();
		muster_5(8);
	}
	
	//a
	public static void muster_1(int n) {
		for (int zeile=1; zeile<= n; zeile++) {
			for (int spalte=1; spalte<= n; spalte++)
				if (zeile==1 || zeile==n || spalte==1 || spalte==n) System.out.print("*");
				else System.out.print(" ");
			System.out.println();		
		}
	}
	
	//b
	public static void muster_2(int n) {
		for (int zeile=1; zeile<= n; zeile++) {
			for (int spalte=1; spalte<=zeile; spalte++) 
				System.out.print("*");
			System.out.println();
		}
	}
	
	//c
	public static void muster_3(int n) {
		for (int zeile=1; zeile <= n; zeile++) {
			for (int spalte=1; spalte <= n-zeile; spalte++) 
				System.out.print(" ");
			for (int spalte=1; spalte <= 2*zeile-1; spalte++)
				System.out.print("*");
			System.out.println();
		}	
	}
	
	//d
	public static void muster_4(int n) {
		for (int zeile=1; zeile <= n; zeile++) {
			for (int spalte=1; spalte <= 2*n; spalte++) 
				if ((zeile+spalte) % 2 == 0) System.out.print("*");
				else System.out.print(" ");
			System.out.println();
		}
	}
	
	//e
	public static void muster_5(int n) {
		for (int zeile=1; zeile <= n; zeile++) {
			for (int spalte=1; spalte <= n; spalte++) {
				if (zeile==spalte || zeile==n+1-spalte 
					|| zeile==1 || zeile==n || spalte==1 || spalte==n) 
					System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
