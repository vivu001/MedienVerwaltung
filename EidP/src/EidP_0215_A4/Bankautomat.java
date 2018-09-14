package EidP_0215_A4;

public class Bankautomat {
	private Auftrag derAuftrag;
	private Kontoverwaltung dieKontovwl;
	
	public void erfasseAuftrag() {
		//
	}
	
	public void bearbeiteAuftrag() {
		switch (derAuftrag.getAktion()) {
			case 0: dieKontovwl.getKontostand(derAuftrag.getPin(), derAuftrag.getKontoNr(), derAuftrag.getKartenNr()); 
					break;
			case 1: dieKontovwl.einzahlen(derAuftrag.getPin(), derAuftrag.getKontoNr(), derAuftrag.getKartenNr(), derAuftrag.getGeldBetrag());
					break;
			case 2: dieKontovwl.abheben(derAuftrag.getPin(), derAuftrag.getKontoNr(), derAuftrag.getKartenNr(), derAuftrag.getGeldBetrag());
					break;
			default : System.out.println("Aktion muss zwischen 0-2 liegen");
		}
	}
	
	public void loescheAuftrag() {
		
	}
}
