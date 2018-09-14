package Prk_01;

public class Main {

	public static void main(String[] args) {
		Audio a1 = new Audio("It Means Nothing", 2007, "Stereophonics", 229);
//		a1.druckeDaten();
//		System.out.println("\"" + a1.getTitel() + "\"" + " ist " + a1.alter() + " Jahre alt");
		
		Bild b1 = new Bild("Gebaeude FB Informatik", 2014 , "Dortmund");		
//		System.out.println();
		b1.druckeDaten();
		
		Medienverwaltung m = new Medienverwaltung(10);
		m.aufnehmen(a1);
		m.aufnehmen(b1);
		
		m.zeigeMedien();
		System.out.println(m.berechneErscheinungsjahr());
		m.sucheNeuesMedium();
	}
}
