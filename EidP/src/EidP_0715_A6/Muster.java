/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EidP_0715_A6;

/**
 *
 * @author Vu Viet Duc
 */
public class Muster {
    
    char[][] feld;
    public Muster(int n) {
	if (n<5) 
            feld = new char[5][5];
	else 
            if (n%2 == 0) feld = new char[n+1][n+1];
            else feld = new char[n][n];
    }

    public void fuelleArray() {
        
        // print "*"
        for (int i=0; i < feld.length; i++)
            for (int j=0; j < feld[i].length; j++) 
                if (i==j || i+j+1 == feld.length) 
                    feld[i][j] = '*';	

        int mitte = feld.length/2;
        
        // print Zahl
        for (int i = 0; i < mitte; i++)
            for (int j = i + 1; j < feld.length - i - 1; j++) {
                feld[i][j] = '1';
                feld[j][i] = '4';
                feld[feld.length - i - 1][j] = '3';
                feld[j][feld.length - i - 1] = '2';
            }	
        }

    public void display() {
        for (char[] feld1 : feld) {
            for (int j = 0; j < feld1.length; j++) {
                System.out.print(feld1[j] + " ");
            }
            System.out.println("");
        }
    }

}
