/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EidP_0217_A6;

/**
 * @author Vu Viet Duc
 */
public class createPascal_Test {

    private static void createPascal(int size) { //Annahme: size>=1
        int[][] feld = new int[size][size];
        feld[0][0] = 1;

        for (int i = 1; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    feld[i][j] = 1;
                } else
                    feld[i][j] = feld[i - 1][j - 1] + feld[i - 1][j];

            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(feld[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        createPascal(8);
    }

}
