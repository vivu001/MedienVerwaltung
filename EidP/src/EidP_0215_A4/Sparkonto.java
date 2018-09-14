package EidP_0215_A4;

public class Sparkonto extends Konto{
	
	public Sparkonto(double koStd) {
		super(koStd);
	}
	
	public void abheben(double betrag) {
		if (kontostand >= betrag) 
			kontostand -= betrag;
	}
	
	
}
