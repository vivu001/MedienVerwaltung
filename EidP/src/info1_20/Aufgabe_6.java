package info1_20;

public class Aufgabe_6 {
	
	public static boolean zweiFelderGleich(char[] eins, char[] zwei) {
		boolean test = true;
		if (eins.length != zwei.length) return false;
		else {
			for (int i=0; i<eins.length; i++)
				if (eins[i] != zwei[i]) {
					test = false;
					break;
				}
			return test;
		}
	}
	
	private static boolean zweiFelderUmkehrung(char[] eins, char[] zwei) {
		boolean test = true;
		if (eins.length != zwei.length) return false;
		else {
			for (int i=0; i<eins.length; i++)
				if (eins[i] != zwei[zwei.length-i-1]) {
					test = false;
					break;
			}
			return test;
		}
	}
	
	public static boolean vergleichen(char[][] test) {
		boolean check = false;
		
		for (int i=0; i<test.length-1; i++)
			for (int j=1; j<test.length; j++) 
				if (zweiFelderUmkehrung(test[i], test[j])) {
					check = true;
					break;
				}
		return check;
	}
	
	public static void main(String[] args) {
		char[] test1 = {'f','e','d','q','n'};
		char[] test2 = {'n','q','d','e','f'};
		
		System.out.println(zweiFelderGleich(test1, test2));
		System.out.println(zweiFelderUmkehrung(test1, test2));
		
		char[][] test = {
				{'s','d','f','g','h','j','k'},
				{'i','u','z','t','r','e','w'},
				{'a','s','d','f','g','h','j'},
				{'s','e','r','f','g','t'},
				{'w','e','r','t','z','u','i'},
				{'s','e','d','f','r','g','t'},
				};
		
		System.out.println(vergleichen(test));	
		
	}
}
