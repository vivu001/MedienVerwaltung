/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AD_10;

/**
 *
 * @author Vu Viet Duc
 */
public class binare_Suche {

    public static void main(String[] args) {
        String[] test = {"Duc", "Joshua", "Tim", "Sarah", "Michael", "Alex", "Phan"};
        java.util.Arrays.sort(test);

        System.out.println(binaereSuche(test, "Joshua"));
        System.out.println(binaereSuche(test, "Fabian"));
        System.out.println(binaereSuche(test, "Phan"));
    }

    static boolean binaereSuche(final String[] worte, final String begriff) {
        int links = 0;
        int rechts = worte.length - 1;

        int mitte;
        while (links <= rechts) {
            mitte = (links + rechts) / 2;

            if (worte[mitte].compareTo(begriff) == 0) {
                return true;
            }

            if (worte[mitte].compareTo(begriff) > 0) {
                rechts = mitte - 1;
            } else {
                links = mitte + 1;
            }
        }

        return false;
    }
}
