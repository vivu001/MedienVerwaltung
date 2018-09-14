/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EidP_0216_A5;

/**
 *
 * @author Vu Viet Duc
 */
public class spiegeln {

    public static void main(String[] args) {
        System.out.println(spiegeln("abcde"));
        System.out.println(erhoeheUm2("57"));
       
//        Bildschirm test = new Bildschirm(8, 10);
//        test.Rectangle(3, 5, 8, 6);
    }

    public static String spiegeln(String w) {
        String erg = "";

        for (int i = w.length() - 1; i >= 0; i--) {
            erg += w.charAt(i);
        }

        return erg;
    }

    public static String erhoeheUm2(String a) {
        String erg = "";
        int offset = 2;

        for (int i = a.length() - 1; i >= 0; i--) {
            int c = a.charAt(i) - '0' + offset;
            erg += c % 10;
            offset = c / 10;
        }

        if (offset != 0) {
            erg += offset;
        }

        return spiegeln(erg);
    }
}
