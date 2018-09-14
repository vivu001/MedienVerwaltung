package VL03_A2;

public class Liste {
	protected Link anfang;
	
	public Liste() {
		anfang = null;
	}
	
	public void verketten(Liste liste2) {
		if (anfang == null) 
			anfang = liste2.anfang;
		else {
			Link ende = anfang;
			
			while (ende.naechster != null) {
				ende = ende.naechster;
			}
			ende.naechster = liste2.anfang;
		}
		liste2.anfang = null;
	}
	
	public void rueckwaertsAusgeben() {
		rueckwaertsAusgebenR(anfang);
	}
	
	public void rueckwaertsAusgebenR(Link element) {
		if (element != null) {
			rueckwaertsAusgebenR(element.naechster);
			System.out.print(element.getDaten() + " ");
		}
	}
	
	public void display() {
		Link zeiger = anfang;
		
		while (zeiger != null) {
			System.out.print(zeiger.getDaten() + " ");
			zeiger = zeiger.naechster;
		}
	}
}
