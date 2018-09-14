/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EidP_0715_A8;

/**
 *
 * @author Vu Viet Duc
 */
public class TestKlasse {

    public static void main(String[] args) {
        A einA = new A();
        einA.ausgabe();
        
        einA.methode(5);
        einA.ausgabe();
        
        B einB = new B();
        einB.ausgabe();
        
        einB.methode(2);
        einB.ausgabe();
    }
}
