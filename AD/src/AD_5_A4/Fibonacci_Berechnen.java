package AD_5_A4;

public class Fibonacci_Berechnen {

	public long fibo_Re(int n) {
		if (n==1 || n==0) return n;
		else return (fibo_Re(n-1) + fibo_Re(n-2));
	}
	
	public long fibo_It(int n) {
		int n1=0; 
		int n2=1;
		
		for (int i=1; i<=n; i++) {		
			int s = n1 + n2;
			n1 = n2;
			n2 = s;
		}
		return n1;
	}
}
