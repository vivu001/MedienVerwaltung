package AD_2;

public class Aufgabe_4 {

	public static void main(String[] args) {
		getTime(1000000);
	}

	public static void getTime(long n) {
		long startTime = System.currentTimeMillis();
		long k = 0;
		int p=1;
		
//		for (int i=2; i<=n; i++) {
//			p*=i;
//		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
}
