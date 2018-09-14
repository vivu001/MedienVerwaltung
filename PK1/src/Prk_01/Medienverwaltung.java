package Prk_01;

public class Medienverwaltung {
	private Medium[] einMedium; 
	private static int anzMedien = 0;
	
	public Medienverwaltung(int n) {
		try {
			assert (n>0) : "Fehler ! n ist <= 0";
			this.einMedium = new Medium[n];
		} catch (AssertionError i) {System.err.print(i);}
	}
	
	public void aufnehmen(Medium medium) {
		try {
			assert (anzMedien < einMedium.length) : "Fehler ! Keiner Platz ist verfuebar !\n";
				einMedium[anzMedien++] = medium;
		} catch (AssertionError i) {System.err.print(i);}
	}
	
	public void zeigeMedien() {
		for (int i=0; i<anzMedien; i++) {
			einMedium[i].druckeDaten();
		}
	}
	
	public void sucheNeuesMedium() {
		if (anzMedien>0) {
			int neuesJahr = einMedium[0].getJahr();
			int index = 0;
			for (int i = 1; i < anzMedien; i++)
				if (einMedium[i].getJahr()>neuesJahr) {
					neuesJahr = einMedium[i].getJahr();
					index = i;
				}
			einMedium[index].druckeDaten();
			System.out.println(neuesJahr);
		}
	}
	
	public double berechneErscheinungsjahr() {
			double s = 0.0;
			for (int i=0; i<anzMedien; i++) {
				s += einMedium[i].getJahr();
			}
			return s/anzMedien;
	}
}
