package Rekursion;

public class Quersumme_Spiegelung {

	public static void main(String[] args) {
		System.out.println(quersumme(123456));
		System.out.println(zifferZaehlen(123456));
		System.out.println(spiegelung(123456));
	}

	// tinh tong chu so
	public static int quersumme(int n) {
		if (n==0) return n;
		else return (n%10 + quersumme(n/10));
	}
	
	//dem so chu so
	public static int zifferZaehlen(int n) {
		if (n/10 == 0) {
			return 1;
		}
		else return 1+ zifferZaehlen(n/10);
	}
	
	//dao nguoc chu so
	public static int spiegelung(int n) {
		if (n==0) return n;
		else {
			return (int) ((n%10)*(Math.pow(10, zifferZaehlen(n)-1)) + spiegelung(n/10));
		}
	}
}
