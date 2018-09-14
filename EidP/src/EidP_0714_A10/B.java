/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EidP_0714_A10;

/**
 *
 * @author Vu Viet Duc
 */
public class B extends A {

    public int x;

    public B() {
        x++;
//        y += 2;
    }

    public void methode() {
        x += 9;
    }

    public void ausgabe() {
        System.out.println("x = " + this.x);
        System.out.println("y = " + y);
        super.ausgabe();
    }
}