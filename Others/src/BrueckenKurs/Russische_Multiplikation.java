package BrueckenKurs;

public class Russische_Multiplikation {

	public static void main(String[] args) {
		System.out.println(multiplikation(377, 53));
//		System.out.println();
//	System.out.println(multiRekurs(377, 53));
	}

	public static int multiplikation(int a, int b) {
		int s=0;
		do {
			if (a%2 !=0) s+=b;
			System.out.println(String.format("%-5s %s",a , b));
			a /=2;
			b *=2;
		} while (a != 0);
		return s;
	}
	
	//Rekursion
	public static int multiRekurs(int a, int b) {
		if (a != 0) {
			System.out.println(a + "   " + b);
			if (a%2 != 0) {
				return b + multiRekurs(a/2, b*2);
			} else {
				return multiRekurs(a/2, b*2);
			}			
		} else return 0;		
	}
}
