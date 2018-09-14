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
public class A {
    public static int z;
    public int x = 10;
    
    public A() {
        x++;
        z++;
    }
    
    public void print() {
        System.out.println("A: "+ ++x);
        System.out.println("A: "+ ++z);
    }
}
