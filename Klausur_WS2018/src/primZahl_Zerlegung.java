import java.util.Scanner;

public class primZahl_Zerlegung {
	public static boolean istPrimZahl(int a) {
		if (a<2) return false;
		int i=2;
		
		while (i <= Math.sqrt(a)) {
			if (a%i == 0) return false;
			else i++;
		}
		return true;
		
	}
	
	public static String Zerlegung(int a) {
		String s = "";
		int i=2;
		while (a != 1) {
			while (istPrimZahl(i) && (a % i == 0)) {
 				if (a>i) s = s + i + "*";
 				else s = s + i;
				a /=i;
			}
			i++;
		}
		return s;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		int a = sc.nextInt();
		if (istPrimZahl(a)) System.out.println(a + " ist eine Primzahl");
		else System.out.println(a + " ist keine Primzahl");
		System.out.println(Zerlegung(a));
		sc.close();
	}
}
