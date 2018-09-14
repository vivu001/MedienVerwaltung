package VL03_A1;

public class Liste {
	private Link anfang;
	private Link ende;
	
	public Liste() {
		anfang = ende = null;
	}
	
	public void einfuegenAnfang( int neuerWert ) {
		anfang = new Link( neuerWert, anfang );
		if ( ende == null )
			ende = anfang;
	}
	
	public Link getAnfang() {
		return anfang;
	}
	
	public Link getEnde() {
		return ende;
	}
	
	//check empty
	public boolean istLeer() {
		return anfang == null;
	}
	
	//count
	public int zaehleElemente(int wert) {
		Link zeiger = anfang;
		int counter = 0;
		
		while (zeiger != null) {
			if (zeiger.getDaten() == wert) 
				counter++;
			zeiger = zeiger.naechster;
		}
		return counter;
	}
	
	//spiegeln
	public void spiegeln() {
		Liste s_List = new Liste();
		Link zeiger = anfang;
		
		while (zeiger != null) {
			s_List.einfuegenAnfang(zeiger.getDaten());
			zeiger = zeiger.naechster;
		}
		anfang = s_List.anfang;
		ende = s_List.ende;
	}
	
	//display
	public void ausgeben() {
		Link zeiger = anfang;
		
		while (zeiger != null) {
			System.out.print(zeiger.getDaten() + " ");
			zeiger = zeiger.naechster;				
		}
	}
	
}
