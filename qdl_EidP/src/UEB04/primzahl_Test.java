package UEB04;
import java.util.Scanner;

public class primzahl_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		allPrims(sc.nextInt());
	}
	
	//1. Loesungsweg
	public static boolean isPrim_For(int a) {
		if (a==0 || a==1) return true;
		boolean test = true;
		for (int i=2; i<a; i++) 
			if (a%i == 0) {
				test = false;
				break;
			}
		return test;
	}
	
	//2. Loesungsweg
	public static boolean isPrim_While(int a) {
		if ((a==1) || (a==0)) return false;
		if ((a==2) || (a==3)) return true;
		
		int i=2;
		while (i <= Math.sqrt(a)) {
			if (a%i == 0) return false;
			else i++;
		}
		if (i >2) return true;
		return false;
	}
	
	public static void allPrims(int n) {
		for (int i=2; i<=n; i++) {
			if (isPrim_For(i)) System.out.print(i + " ");
//			if (isPrim_While(i)) System.out.print(i + " ");
		}
	}
}
