/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VL03_03;

/**
 *
 * @author Vu Viet Duc
 */
public class Test {

    public static void main(String[] args) {
        Liste liste = new Liste();

        liste.elementEinfuegen(2);
        liste.elementEinfuegen(2);
        
        display(liste);
        System.out.println("\nNach dem loeschen");
        liste.elementEntfernen(2);
        display(liste);
//        for (int i = 1; i <= 10; i++) {
//            liste.elementAnfuegen(i);
//        }
        
       
//        display(liste);
//        liste.bereichEntfernen(1, 20);
//        System.out.println(liste.anfang.getDaten());
//        display(liste);

    }

    static void display(Liste liste) {
        Link zeiger = liste.anfang;
        int count = 0;

        while (zeiger != null) {
            System.out.print(zeiger.getDaten() + "    ");
            zeiger = zeiger.naechster;
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
