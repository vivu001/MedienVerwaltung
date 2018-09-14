package AD_5;

public class Test {

	public static void main(String[] args) {
//		rev3(1234);
		Ulam(18);
		System.out.println();
		UlamI(18);
	}
	
	//Rekursion
	public static int Ulam(int n) {		
		assert (n>=1);
		
		System.out.print(n + " ");
		if (n==1) return 1;
		if ((n&1)==0) return Ulam(n/2);
		else return Ulam(3*n+1);
	}
	
	//iterativ
	public static void UlamI(int n) {	
		assert (n>=1);
		while (n!=1) {
			if ((n&1)==0) {
				System.out.print(n + " ");
				n/=2;
			} else {
				System.out.print(n + " ");
				n=3*n+1;
			}
		}
		System.out.print("1");
		
	}
	//log10(n)
	public static void rev1(int n) {
		System.out.print(n % 10);
		if (n > 9)
		rev1(n / 10);
		// 4321
	}
	
	//
	public static int rev2(int n) {
		if (n <= 9)	return n;
		int logn = (int) Math.log10(n); //int logn = n%10-1;
		int zehnHochLogn = (int) Math.pow(10, logn);
		return (n % 10) * zehnHochLogn + rev2(n / 10);
		//4*10^3 + 3*10^2 + 2*10^1 + 1*10^0
	}
	
	//log10(n)
	public static void rev3(int n) {
		while (n>0) {
			System.out.print(n%10);
			n/=10;
		}
		//1234
	}
}
