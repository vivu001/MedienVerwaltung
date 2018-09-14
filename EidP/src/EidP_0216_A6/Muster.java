/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EidP_0216_A6;

/**
 *
 * @author Vu Viet Duc
 */
public class Muster {

    char[][] feld;

    public Muster(int n) {
        if (n < 5) {
            feld = new char[5][9];
        } else if (n % 2 == 1) {
            feld = new char[n][2 * n - 1];
        } else {
            feld = new char[n + 1][2 * n + 1];
        }
    }

    public void fuelleArray() {
        int mitte = feld[0].length / 2;
        
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                                              
                if ((j == mitte - i) || (j == mitte + i)) {
                    feld[i][j] = '*';
                } else if ((i == feld.length / 2) && (j > i) && (j < i + mitte)) {
                    feld[i][j] = '*';
                } else feld[i][j] = ' ';
            }
        }
    }
    
    public void show() {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                System.out.print(feld[i][j]);
            }
            System.out.println();
        }
    }
}
