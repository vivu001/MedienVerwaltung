package EidP_0215_A4;

public abstract class Konto {
	protected double kontostand;
	private static int anzahlKonto = 0;
	
	public Konto(double kontostand) {
		if (anzahlKonto < 1000) {
			this.kontostand = kontostand;
			anzahlKonto++;
		}
	}
	
	public double getKontostand() {
		return kontostand;
	}
	
	public void einzahlen(double betrag) {
		kontostand += betrag;
	}
	
	public abstract void abheben(double betrag);
}
