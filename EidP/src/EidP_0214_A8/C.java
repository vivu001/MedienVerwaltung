/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EidP_0214_A8;

/**
 *
 * @author Vu Viet Duc
 */
public class C {

    public static void m(boolean b) {
        boolean b1 = true;
        int a1 = 5 / 7 + 5 % 7;
        b = !(b && b1);
        b1 = b1 && (a1++ >= 6);
        System.out.println("b = " + b + ", b1 = " + b1
                + ", a1 = " + a1);
    }

    public static void main(String[] args) {
        
        m(false);
        System.out.println();
        A a = new B();
        System.out.println("a.meth(): " + a.meth());
    }
}
