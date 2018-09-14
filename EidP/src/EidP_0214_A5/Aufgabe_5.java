package EidP_0214_A5;

public class Aufgabe_5 {

	public static void main(String[] args) {
		display("Alles ist schwer");
		display("");
	}

	public static String sortiereZeichen(String str) {
		if (str.isEmpty()) return str;
		String result = "" + str.charAt(0);
		
		for (int i=1; i < str.length(); i++) {
			if (str.charAt(i) <= result.charAt(0)) {
				result = str.charAt(i) + result;
				continue;
			}
			
			if (str.charAt(i) >= result.charAt(result.length()-1)) {
				result += str.charAt(i);
				continue;
			}
				
			int pos = 0;
			while (result.charAt(pos) <= str.charAt(i)) 
				pos++;

			result = result.substring(0, pos) + str.charAt(i) + result.substring(pos, result.length());		
		}
		
		return result;
	}
	
	public static void display(String str) {
		System.out.println("Die R�ckgabe f�r " + "\"" + str + "\""
				+ " ist: " + "\"" + sortiereZeichen(str) + "\".");
	}
}
