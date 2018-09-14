package EidP_0716_A5;

public class Aufgabe_5 {

	public static void main(String[] args) {
	 
			System.out.println(ersetzeZeichen("Dies ist ein i!",  'i', "ast"));
//			System.out.println(reduziereFolgen("Dies iist ein Teeest"));
//			System.out.println(reduziereFolgen("Dddiess   isttt  eeiin Teeessttt "));
	}

	// a
	public static String ersetzeZeichen(String w, char b, String v) {
		String erg = "";
		 
		for (int i=0; i < w.length(); i++) {
			if (w.charAt(i) != b) 
				erg += w.charAt(i);
			else erg += v;
		}
		
		return erg;
	}
	 
	// b
	public static String reduziereFolgen(String w) {
	   String erg = "";
	    
	   for (int i=0; i < w.length()-1; i++) {
		   if (w.charAt(i) != w.charAt(i+1)) 
			   erg += w.charAt(i);
	   }
	    	
	   return erg + w.charAt(w.length()-1);	   
	 }
}
