/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VL03_02;

/**
 *
 * @author Vu Viet Duc
 */
public class Liste {

    protected Link anfang;

    public Liste() {
        anfang = null;
    }

    // a
    void verketten(Liste liste2) {

        if (anfang == null) {
            anfang = liste2.anfang;
        } else {
            Link zeiger = anfang;

            while (zeiger.naechster != null) {
                zeiger = zeiger.naechster;
            }

            zeiger.naechster = liste2.anfang;
        }
        
        // wichtig !!!
        liste2.anfang = null;

    }

}
