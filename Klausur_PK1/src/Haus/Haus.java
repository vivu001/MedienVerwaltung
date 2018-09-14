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
public abstract class Haus implements Comparable<Haus>{
    double size;
    
    public Haus(double size) {
        this.size = size;
    }
    
    public abstract void druckDaten();
    
    @Override
    public int compareTo(Haus otherHaus) {
        if (otherHaus.size == size) return 0;
        else if (size > otherHaus.size) return 1;
            else return -1;   
    }  
}
