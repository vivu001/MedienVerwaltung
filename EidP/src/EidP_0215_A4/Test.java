package EidP_0215_A4;

public class Test {

	public static void main(String[] args) {
		Auftrag a1 = new Auftrag(1234, 2, 415, 0);
		
		
		Bankautomat b1 = new Bankautomat();
		Kontoverwaltung kv1 = new Kontoverwaltung();
		
		b1.bearbeiteAuftrag();
		
		Sparkonto sp1 = new Sparkonto(2000.0); 
		Girokonto gr1 = new Girokonto(1500.0, 2000);
		
		sp1.abheben(200);
		gr1.abheben(5000);
		
		System.out.println(sp1.getKontostand());
		System.out.println(gr1.getKontostand());
	}

}
