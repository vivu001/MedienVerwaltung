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
public class B extends A {

    public int x;

    public B() {
        x += 1;
    }

    public void methode(int x) {
        y = x++;
    }

    public void ausgabe() {
        System.out.println("x = " + this.x);
        System.out.println("y = " + y);
        super.ausgabe();
    }

}
