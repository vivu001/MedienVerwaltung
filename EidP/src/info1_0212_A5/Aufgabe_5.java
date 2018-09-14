/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info1_0212_A5;

/**
 *
 * @author Vu Viet Duc
 */
public class Aufgabe_5 {
    public static void main(String[] args) {
        System.out.println(jahreszeit(13790));
        
        int[][] test = erzeugePTabelle(5);
        for (int i=0; i<test.length; i++) {
            for (int j=0; j<test[i].length; j++)
                System.out.printf("%-6d", test[i][j]);
            System.out.println("");
        }
        
    }

    static String jahreszeit(int n) {
        String s = "";

        while (n > 0) {
            switch (n % 10) {
                case 1:
                    s = "Fruehling" + s;
                    break;
                case 2:
                    s = "Sommer" + s;
                    break;
                case 3:
                    s = "Herbst" + s;
                    break;
                case 4:
                    s = "Winter" + s;
                    break;
                default:
                    s = "Fehler" + s;
            }
            n /= 10;
        }
        return s;
    }

    static int[][] erzeugePTabelle(int n) {
        int[][] feld = new int[n][n];

        for (int i = 0; i < n; i++) {
            feld[i][0] = i + 1;
            for (int j = 1; j < n; j++) {
                feld[i][j] = feld[i][0] * feld[i][j - 1];
            }
        }

        return feld;
    }
}
