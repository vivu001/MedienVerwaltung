package Rekursion;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		try {
			System.out.printf("n = ");
			int n = new Scanner(System.in).nextInt();
			if (n<=0) {
				throw new InputMismatchException("Geben Sie eine positive ganze Zahl an !");
			}

			for (int i=0; i<n; i++ ) {
				System.out.print(Fibonacci(i) + " ");
			}
		} catch (InputMismatchException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static int Fibonacci(int a) {
		if (a==1 || a==0)  return a;
			else return Fibonacci(a-1) + Fibonacci(a-2);
	}	
}
