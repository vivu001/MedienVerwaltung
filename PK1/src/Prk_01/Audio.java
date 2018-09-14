package Prk_01;

public class Audio extends Medium{
	private String interpret;
	private int dauer;
	
	public Audio(String titel, int jahr, String interpret, int dauer) {
		super(titel, jahr);
		this.interpret = interpret;
		this.dauer = dauer;
	}
	
	public String getInterpret() {
		return this.interpret;
	}
	
	public int getDauer() {
		return this.dauer;
	}
	
	public void druckeDaten() {
		System.out.println("ID = " + super.getId() + " \"" + super.getTitel() + "\" von " 
				+ getInterpret() + " aus " + super.getJahr() + " Spieldauer: " + getDauer() + " sek.");
		// System.out.println("\"" + super.getTitel() + "\"" + " ist " + super.alter() + " Jahre alt");
	}
}