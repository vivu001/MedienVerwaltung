package VL03_A1;

public class Link {
	int daten;
	Link naechster;
	
	Link( int daten, Link naechster ) {
		this.daten = daten;
		this.naechster = naechster;
	}

	public int getDaten() {
		return daten;
	}

}
