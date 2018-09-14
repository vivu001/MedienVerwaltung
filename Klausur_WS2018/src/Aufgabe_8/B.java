/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe_8;

/**
 *
 * @author Vu Viet Duc
 */
public class B extends A{
    public int x = 100;
    
    public B() {
        x++;
        z++;
    }
    
    public void print() {
        System.out.println("B: " + x);
        System.out.println("B: " + ++z);
    }    
}
