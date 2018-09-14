package AD_5_A4;

public class Test {

	public static void main(String[] args) {
		Fibonacci_Berechnen test = new Fibonacci_Berechnen();
		StopUhr su = new StopUhr();
		int n = 45;
		
		System.out.println("Rekursiv");
		su.start();
		for (int i=0; i<n; i++) {
			System.out.print(test.fibo_Re(i) + " ");
		}
		su.stop();	
		System.out.println("\n" + su.getDuration()+ " ns");
		
		System.out.println("\nIterativ");
		su.start();
		for (int i=0; i<n; i++) {
			System.out.print(test.fibo_It(i) + " ");
		}
		su.stop();	
		System.out.println("\n" + su.getDuration()+ " ns");
	}
}
