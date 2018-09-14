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
public class C extends B {
    public int x = 1000;
    
    public void print() {
        super.print();
        System.out.println("C: "+ x);
        System.out.println("C: "+ ++z);
    }
}
