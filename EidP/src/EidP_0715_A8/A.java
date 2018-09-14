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
public class A {

    public int x;
    public static int y = 1;

    public A() {
        x = x + y;
        x *= 2;
    }

    public void methode(int x) {
        x += 4;
        y = x;
    }

    public void ausgabe() {
        System.out.println("x = " + this.x);
        System.out.println("y = " + y);
        System.out.println();
    }
}
