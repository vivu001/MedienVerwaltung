package EidP_0215_A4;

public class Auftrag {
	private int pin, kontoNr, kartenNr, aktion;
	private double geldBetrag;
	
	public Auftrag(int pin, int kontoNr, int kartenNr, int aktion) {
		this.pin = pin;
		this.kontoNr = kontoNr;
		this.kartenNr = kartenNr;
		this.aktion = aktion;
		
	}
	
	public Auftrag(int pin, int kontoNr, int kartenNr, int aktion, double gelBetrag) {
		this.pin = pin;
		this.kontoNr = kontoNr;
		this.kartenNr = kartenNr;
		this.aktion = aktion;
		this.geldBetrag = gelBetrag;
		
	}

	public int getPin() {
		return pin;
	}

	public int getKontoNr() {
		return kontoNr;
	}

	public int getKartenNr() {
		return kartenNr;
	}

	public int getAktion() {
		return aktion;
	}

	public double getGeldBetrag() {
		return geldBetrag;
	}
	
}
