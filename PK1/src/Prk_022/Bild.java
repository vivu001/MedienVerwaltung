package Prk_022;

public class Bild extends Medium{
	String ort;
	
	public Bild(String titel, int jahr, String ort) {
		super(titel, jahr);
		this.ort = ort;
	}
	
	public String getOrt() {
		return this.ort;
	}
	
	public void druckeDaten() {
		System.out.println("ID = " + super.getId() + " \"" + getTitel() +
							 "\" aufgenommen im Jahr " + super.getJahr() + " in " + getOrt());
		//System.out.println("\"" + super.getTitel() + "\"" + " ist " + super.alter() + " Jahre alt");
	}
}

