package UEB03;

public class Aufgabe1_2 {
	static int count = 1;
	
	public static void main(String[] args) {
		final int n = 10;
		
		// 1
		outN();
		for (int i = 1; i <= n; ++i )
		out(i);
		nl();
		
		// 2
		outN();
		for (int i = 2; i <= 3 * n; i += 2)
		out(i);
		nl();
		
		//3
		outN();
		for (int i=1; i<n; i+=2)
			out(i);
		nl();
		
		//4
		outN();
		for (int i=n/2; i<=2*n; i++)
			out(i);
		nl();
		
		//5
		outN();
		for (int i=n/2; i>0; i--)
			out(i);
		nl();		
		
		//6
		outN();
		for (int i=3*n; i>=n; i-=4)
			out(i);
		nl();
		
		//7
		outN();
		for (int i=1; i<=n; i++)
			out(i*i);
		nl();

		//8
		outN();
		for (int i=1; i<=n; i++)
			out(i*i + 5);
		nl();
		
		//9
		outN();
		for (int i = 0; i < n-3; i++)
			out((int) Math.pow(2, i));
		nl();
		
		//10
		outN();
		for (int i=n*n*n; i>0; i/=3)
			out(i);
		nl();
		
		//11
		outN();
		for (double i = 1.0; i <= n; ++i )
			out(i);
		nl();
		
		//12
		outN();
		for (int i = 1; i <= n; i++ )
			out(i + 0.1*i);
		nl();	
		
		//13
		outN();
		for (double i = 1.0; i <= n/2; i+=0.5 )
			out(i);
		nl();	
			
		//14
		outN();
		for (double i=n*n*n; i>1; i/=2) 
			out(i);
		nl();
		
		//15
		outN();
		for (double i=1.0; i<=n; i++) 
			out(i*i/2);
		nl();
		
		//16
		outN();
		for (int i=0; i<n; i++) 
			out((i+1)*(i+1)/2);
		nl();	
		
		//17
		outN();
		for (int i=1; i<=n; i++) {
			if (i%2 == 1) out(-i);
			else out(i);
		}
		nl();		
		
		//18
		outN();
		for (int i=1; i<=n; i+=2) {
			out(i);	out(-i);
		}
		nl();
		
		//19
		outN();
		for (int i=1; i<=n; i++) {
			out(i);	
			if (i != 10) out(-i);
		}
		nl();		
		
		//20
		outN();
		for (int i=1; i<=n*2; i++) {
			if (i%3 == 0) out(-1);
			else out(i);
		}
		nl();
		
		//21
		outN();
		for (int i=1; i<=n+5; i++) {
			if (i%2 != 0 && i!=1 ) out(i*i);
			else out(i);
		}
		nl();
		
		//22
		outN();
		for (int i=1; i<=n; i++) 
			out(i*(i+1)/2);
		nl();
		
		//23
		outN();
		int a=0;
		int b=1;
		for (int i=0; i<=n+1; i++) {
			if (i==0 || i==1) out(i);
			else {
				out(a+b);
				b = a+b;
				a = b-a;
			}
		}
		nl();		
		
		//24
		outN();
		int p=1;
		for (int i=1; i<=n; i++) {
			p *= i;
			out(p);
		}
		nl();
		
		//25
		outN();
		for (int i=1; i<n; i++) {
			if (i<=n/2) out(i);
			else out(n-i);
		}
		nl();
		
		//26
		outN();
		for (int i=1; i<1.5*n; i++) {
			switch (i) {
			case 1:
			case 6:
			case 10:
			case 13: out(i); out (i); out(i); out(i); break;
			default: out(i); out(i); out(i);
			}
		}
		nl();
		
		//27
		outN();
		double x=1.0;
		for (int i=0; i<=n/2+1; i++) {
			
//			out((i==0) ? x : {2*x-0.2);
			if (i==0) out(x);
			else {
				x = 2*x - 0.2;
				out(x);
			}	
		}
		nl();
		
		//28
		outN();
		for (int i=1; i<=2*n; i++) {
			out((Math.round(Math.sqrt(i)*1000)) / 1000.0);
		}
		nl();
		
		//29
		outN();
		for (int i=1; i <= 2*n; i++) {
			out(i|2);
		}
		nl();
		
		//30
		outN();
		for (int i=2; i<=2*n+1; i++) {
			out((i % 3 == 0) ? (i+1) : ((i % 3 == 1) ? (i-1) : i));
			
//			switch (i%3) {
//				case 0: out(i+1); break;
//				case 1: out(i-1); break;
//				default: out(i);
//			}		
		}
		nl();
		
	}	
	public static void outN() {	
		System.out.print(count++ + ": ");
	}
	
	public static void out(int a) {
		System.out.print(a + " ");
	}
	
	public static void out(double a) {
		System.out.print(a + " ");
	}
	
	public static void nl() {
		System.out.print("\n");
	}
	
}