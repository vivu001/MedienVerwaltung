package Rekursion;

public class ggT_kgV {
	
	public static void main(String[] args) {
		System.out.println(ggT_Berechnen(72, 60));
		System.out.println(kgV_Berechnen(60, 72));
	}
	
	//ggT
	public static int ggT_Berechnen(int m, int n) {
		if (n==0) return m;
//		System.out.println(m);
//		System.out.println(n);
//		System.out.println();
		return ggT_Berechnen(n, m%n);
	}
	
	//kgV
	public static int kgV_Berechnen(int x, int y) {	
		return x*y/ggT_Berechnen(x, y);
	}
	
}
