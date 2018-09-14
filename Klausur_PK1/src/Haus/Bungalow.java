/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Haus;
/**
 *
 * @author Vu Viet Duc
 */
public class Bungalow extends Haus {
    private int anzZimmer;
            
    public Bungalow(double size, int anzZimmer) {
        super(size);
        this.anzZimmer = anzZimmer;
    }
     
    @Override
    public void druckDaten() {
        System.out.println(super.size);   
    }
}
