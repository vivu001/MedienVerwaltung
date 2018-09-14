package Rekursion;
import java.util.Scanner;

public class Binaer_Umwandlung {
	public static void binaerUmrechnung(int a) {
		int b;	
		if (a<2) {
			System.out.print(a); 
			return;
		} 
		b = a%2;
		binaerUmrechnung(a/2);
		System.out.print(b);	
	}
	
	public static void main(String[] args) {
		System.out.print("Geben Sie eine Dezimalzahl an: ");
		int n = new Scanner(System.in).nextInt();
		
		binaerUmrechnung(n);
		
	}
}
