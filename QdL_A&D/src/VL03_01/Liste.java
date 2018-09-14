/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VL03_01;

/**
 *
 * @author Vu Viet Duc
 */
public class Liste {

    private Link anfang;
    private Link ende;

    public Liste() {
        anfang = ende = null;
    }

    public void einfuegenAnfang(int neuerWert) {
        anfang = new Link(neuerWert, anfang);

        if (ende == null) {
            ende = anfang;
        }
    }

    public Link getAnfang() {
        return anfang;
    }

    public Link getEnde() {
        return ende;
    }

    // a
    public boolean isLeer() {
        if (anfang == null) {
            return true;
        }
        return false;
    }

    // b
    public int zaehleElemente(int wert) {
        if (isLeer()) {
            return 0;
        }

        Link zeiger = anfang;
        int count = 0;

        while (zeiger != null) {
            if (zeiger.daten == wert) {
                count++;
            }
            zeiger = zeiger.naechster;
        }

        return count;
    }

    // c
    public void spiegeln() {
        Liste spiegel_Liste = new Liste();

        if (isLeer()) {;

            Link zeiger = anfang;

            while (zeiger != null) {
                spiegel_Liste.einfuegenAnfang(zeiger.daten);
                zeiger = zeiger.naechster;
            }

            // wichtig !!!
            anfang = spiegel_Liste.getAnfang();
            ende = spiegel_Liste.getEnde();
        }
    }
}
