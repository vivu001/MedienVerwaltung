/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info1_0713_A6;

/**
 *
 * @author Vu Viet Duc
 */
public class zweiFelder {

    public static void main(String[] args) {
        char[] eins = {'a','b','c','d','e'};
        char[] zwei = {'a','b','c','d','e'};
        
        System.out.println(zweiFelderGleich(eins, zwei));
        System.out.println(zweiFelderUmkehrung(eins, zwei));
        
        char[][] test = {
            {'s', 'd', 'f', 'g', 'h', 'j', 'k'},
            {'i', 'u', 'z', 't', 'r', 'e', 'w'},
            {'a', 's', 'd', 'f', 'g', 'h', 'j'},
            {'s', 'e', 'r', 'f', 'g', 't'},
            {'w', 'e', 'r', 't', 'z', 'u', 'i'},
            {'s', 'e', 'd', 'f', 'r', 'g', 't'},};
        System.out.println(vergleichen(test));
    }

    private static boolean zweiFelderGleich(char[] eins, char[] zwei) {
        boolean test = true;

        for (int i = 0; i < eins.length; i++) {
            if (eins[i] != zwei[i]) {
                test = false;
                break;
            }
        }
        return test;
    }

    private static boolean zweiFelderUmkehrung(char[] eins, char[] zwei) {
        boolean test = true;

        for (int i = 0; i < eins.length; i++) {
            if (eins[i] != zwei[eins.length - i - 1]) {
                test = false;
                break;
            }
        }
        return test;
    }

    public static boolean vergleichen(char[][] test) {
        boolean result = false;

        for (int i = 0; i < test.length - 1; i++) {
            for (int j = i + 1; j < test.length; j++) {
                if (test[i].length == test[j].length) {
                    if (zweiFelderUmkehrung(test[i], test[j])) {
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
