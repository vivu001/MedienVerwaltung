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
public class Liste {

    protected Link anfang;
    protected Link ende;

    public Liste() {
        anfang = null;
        ende = null;
    }

    // add node to the end of the list
    public void elementAnfuegen(int neuesElement) {
        ende = new Link(neuesElement, ende, null);

        // gan' anfang hoac ende cho List tuy theo tinh trang cua List
        if (anfang == null) {
            anfang = ende;
        } else {
            ende.vorgaenger.naechster = ende;
        }
    }

    // add node to the beginning of the list
    public void elementEinfuegen(int neuesElement) {
        anfang = new Link(neuesElement, null, anfang);
    }

    // delete node with their values at any position
    public void elementEntfernen(int wert) {
        Link zeiger = anfang;
        Link vorg = null;
        while (zeiger != null) {

            if (zeiger.getDaten() == wert) {
                if (zeiger == anfang) {
                    anfang = zeiger.naechster;                   
                } else {
                    vorg.naechster = zeiger.naechster;
                }
                
            } else {
                vorg = zeiger;
            }

            zeiger = zeiger.naechster;
        }
    }

    // delete nodes with their values in the range of from to bis
    public void bereichEntfernen(int von, int bis) {
        Link zeiger = anfang;

        while (zeiger != null) {

            if ((zeiger.getDaten() >= von) && (zeiger.getDaten() <= bis)) {
                if (zeiger == anfang) // zeiger.vorgaenger == null
                {
                    anfang = zeiger.naechster;
                }
                if (zeiger == ende) // zeiger.naechster == null
                {
                    ende = zeiger.vorgaenger;
                }

                if (zeiger.vorgaenger != null) {
                    zeiger.vorgaenger.naechster = zeiger.naechster;
                }
                if (zeiger.naechster != null) {
                    zeiger.naechster.vorgaenger = zeiger.vorgaenger;
                }
            }
            zeiger = zeiger.naechster;

        }
    }
}
