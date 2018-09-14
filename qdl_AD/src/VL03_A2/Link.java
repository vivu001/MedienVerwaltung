package VL03_A2;

public class Link {
	protected int daten;
	protected Link naechster;
	
	Link( int daten, Link naechster ) {
		this.daten = daten;
		this.naechster = naechster;
	}
	
	public int getDaten() {
		return daten;
	}
}
