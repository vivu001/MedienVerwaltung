package EidP_0215_A6;

public class Spiegel {
	char[][] feld;
		
	public Spiegel(int n) {
		if (n < 5) n = 5;
		else
			if (n % 2 == 0) n = n + 1;
		// Erg�nzen Sie den Programmcode zur Erzeugung
		// des Feldobjekts! Das erzeugte Array soll
		// QUADRATISCH sein.
		feld = new char[n][n];
	}
	
	public void fuelleFeld(char oben, char unten){
	// Diese Methode soll in Aufgabenteil a) wie in der
	// Aufgabenstellung angegeben implementiert werden.
		int mitte = feld.length/2;
		
		for (int i=0; i < feld.length; i++)
			for (int j=0; j < feld[i].length; j++) {
				if (i < mitte) 
					feld[i][j] = oben;
				else if (i > mitte) 
						feld[i][j] = unten;
					else feld[i][j] = '=';
			}
	}
	
	public void fuelleOberesDreieck(char fuellzeichen) {
	// Diese Methode soll in Aufgabenteil b) wie in der
	// Aufgabenstellung angegeben implementiert werden.
		int mitte = feld.length/2;
		
		for (int i=0; i < mitte; i++) {
			for (int j=i+1; j < feld.length-i-1; j++)	
				feld[i][j] = fuellzeichen;
		}
	}
	
	public void spiegele(char zuSpiegelndesZeichen)	{
	// Diese Methode soll in Aufgabenteil c) wie in der
	// Aufgabenstellung angegeben implementiert werden.
		fuelleOberesDreieck(zuSpiegelndesZeichen);
		int mitte = feld.length/2;
		
		for (int i=0; i < mitte; i++) {
			for (int j=i+1; j < feld.length-i-1; j++)	
				if (feld[i][j] == zuSpiegelndesZeichen)
					feld[feld.length-i-1][j] = feld[i][j] ;
		}
	}
	
	public void display(char[][] feld) {
		for (int i=0; i<feld.length; i++) {
			for (int j=0; j<feld[i].length; j++) 
				System.out.print(feld[i][j] + " ");
			System.out.println();
		}
	}
}
