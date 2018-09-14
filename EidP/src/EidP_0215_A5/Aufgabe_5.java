package EidP_0215_A5;

public class Aufgabe_5 {

	public static void main(String[] args) {
		System.out.println(liefereZeichen("Dies ist ein Test", new int[] {1,5,6,8}));
		System.out.println(entferneZeichen("Dies ist ein Test", new int[] {1,5,6,8}));

	}
	
	public static String liefereZeichen(String str, int[] feld) {
		String erg = "";
		
		for (int i=0; i < feld.length; i++) 
			erg += str.charAt(feld[i]-1);

		return erg;
	}

	public static String entferneZeichen(String str, int[] feld) {
		String erg = "";
		
		for (int index=0; index < str.length(); index++) {
			boolean test = false;
			
			for (int j=0; j < feld.length; j++) {
				if (index == feld[j] - 1) {
					test = true;
					break;
				}	
			}
			
			if (test) 
				erg += ""; 
			else erg += str.charAt(index);	
		}
		
		return erg;
	}
}
