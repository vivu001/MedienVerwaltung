package PK_1;

public class Bild extends Medium{
	private String ort;
	
	public Bild(String titel, int jahr, String ort) {
		super(titel, jahr);
		this.ort = ort;
	}
	
	public void druckeDaten() {
		System.out.println("ID = " + super.getId() + " " + "\"" + super.getTitel() + "\"" + " aufgenommen im Jahr " 
								+ super.getJahr() + " in " + this.ort);
		System.out.println("\""+ super.getTitel() + "\"" + " ist " + super.alter() + " Jahre alt");
	}
	
}
