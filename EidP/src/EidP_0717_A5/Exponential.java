package EidP_0717_A5;

public class Exponential {

	public static void main(String[] args) {
//		System.out.printf("%.5f", expReihe(2, 3));
		System.out.println(median(5, 1, 5));
	}

	public static double expReihe(double x, int n) {
		double erg = 1.0;
		int zaehler = 1;
		int nenner = 1;
		
		for (int i=1; i<=n; i++) {
			zaehler *= x;
			nenner *= i;
			erg += (double) zaehler/nenner;
		}
		
		return erg;
	}
	
	public static int median(int a, int b, int c) {
		int median = 0;
		
		if ((b <= a && a <= c) || (c <= a && a <= b)) 
			median = a;
		else if ((a <= b && b <= c) || (c <= b && b <= a)) 
				median = b;
			else if ((a <= c && c <= b) || (b <= c && c <= a)) 
				median = c;
		
		return median;
	}
}
