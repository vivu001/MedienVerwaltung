package EidP_0214_A6;

public class Stern {

	char[][] feld;
	
	public Stern(int n) {
		if (n<5) 
			feld = new char[5][5];
		else 
			if (n % 2 == 0)
				feld = new char[n+1][n+1];
			else feld = new char[n][n];
	}
	
	public void erzeugeSternMuster() {
	
		for (int i=0; i<feld.length; i++)
			for (int j=0; j<feld[i].length; j++) {
				if ((i==j) || (i+j == feld.length-1)
					|| (i == feld.length/2) || (j == feld.length/2)) 
					feld[i][j] = '*';
			}
	}
	
	public void ausgeben() {
		for (int i=0; i<feld.length; i++) {
			for (int j=0; j<feld[i].length; j++) 
				System.out.print(feld[i][j] + " ");
			System.out.println();
		}
	}
}
