package EidP_0716_A6;

public class Muster {
	char[][] feld;
	
	public Muster(int n) {
		if (n<5) n = 5;
		if (n%2 == 0) n = n+1;
		feld = new char[n][n];
	}
	
	public void fuelleArrayMitA() {
		for (int i=0; i < feld.length; i++) 
			for (int j=0; j < feld.length; j++) {			
				if ((i+j) % 2 == 1) 
					feld[i][j] = 'A';
				else feld[i][j] = ' ';
			}
	}
	
	public void fuelleArrayMitBC() {
		int mitte = feld.length / 2;
		
		for (int i=0; i < feld.length; i++) 
			for (int j=0; j < feld.length; j++) {			
				if (i+j == mitte || i+j == 3*mitte) 
					feld[i][j] = 'B';
				else if (i-j == mitte || j-i == mitte)
					feld[i][j] = 'C';
				else feld[i][j] = ' ';
			}

	}
	
	public void show() {
		for (int i=0; i < feld.length; i++) { 
			for (int j=0; j < feld.length; j++) {
				System.out.print(feld[i][j] + "  ");
			}
			System.out.println();
		}
	}
}