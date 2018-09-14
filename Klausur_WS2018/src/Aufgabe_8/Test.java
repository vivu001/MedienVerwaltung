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
public class Test {

    public static void main(String[] args) {
        A einA = new A();
        System.out.println("A: " + einA.x);
        einA.print();
        
        A einB = new B(); 
        System.out.println("B: " + einB.x);
        einB.print();
        
        C einC = new C();
        einC.print();
        System.out.println("C: " + einC.x);
        
    }
}
