/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EidP_0217_A5;

/**
 *
 * @author Vu Viet Duc
 */
public class Aufgabe_5 {

    public static void main(String[] args) {
        System.out.println(binomialkoeffizient(26, 10));
    }

    public static int binomialkoeffizient(int n, int k) {
        int erg;

        if (k == 0) {
            erg = 1;
        } else if (0 < k && k <= n) {
            int zaehler = 1;
            int nenner = 1;

            for (int i = n; i >= (n - k + 1); i--) {
                zaehler *= i;
            }

            for (int j = 2; j <= k; j++) {
                nenner *= j;
            }

            erg = zaehler / nenner;
        } else {
            erg = 0;
        }

        return erg;
    }

}
