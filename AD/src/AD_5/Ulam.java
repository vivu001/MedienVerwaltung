package AD_5;

public class Ulam {
	public static int Ulam(int n) {	
		assert (n>=1);
		
		System.out.print(Ulam(n) + "->");
		if (n==1) return 1;
		if ((n&1)==0) return Ulam(n/2);
		else return Ulam(3*n+1);
	}
}
