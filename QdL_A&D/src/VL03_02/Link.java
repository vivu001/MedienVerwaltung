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
class Link {
    protected int daten;
    protected Link naechster;
    
    Link(int daten, Link naechster) {
        this.daten = daten;
        this.naechster = naechster;
    }
}
