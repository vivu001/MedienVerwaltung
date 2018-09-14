package PK_1;

public class Audio extends Medium{
	private String interpret;
	private int dauer;
	
	public Audio(String titel, int jahr, String interpret, int dauer) {
		super(titel, jahr);
		this.interpret = interpret;
		this.dauer = dauer;
	}
	
	public void druckeDaten() {
		System.out.println("ID = " + super.getId() + " " + "\""+ super.getTitel() + "\"" + " von " + this.interpret + " aus " + super.getJahr() 
								+ " Spieldauer: "  + this.dauer + " sek.");
		System.out.println("\""+ super.getTitel() + "\"" + " ist " + super.alter() + " Jahre alt");
	}
}
