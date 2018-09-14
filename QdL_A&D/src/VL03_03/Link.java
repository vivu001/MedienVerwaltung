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
class Link {
    private int daten;
    protected Link naechster;
    protected Link vorgaenger;
    
    Link(int daten, Link vorgaenger, Link naechster) {
        this.daten = daten;
        this.naechster = naechster;
        this.vorgaenger = vorgaenger;
    }
    
    public void setDaten(int daten) {
        this.daten = daten;
    }
    
    public int getDaten() {
        return this.daten;
    }
    
    
}
