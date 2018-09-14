package EidP_0215_A4;

public class Girokonto extends Konto{
	private double kreditrahmen;
	
	public Girokonto(double koStd, double krRahmen) {
		super(koStd);
		this.kreditrahmen = krRahmen;
	}
	
	public void abheben (double betrag) {
		if (betrag <= kreditrahmen + kontostand)
			kontostand -= betrag;
		else System.out.println("Error !");
	}
	
	
}
