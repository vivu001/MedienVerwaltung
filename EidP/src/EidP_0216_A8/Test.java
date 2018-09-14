/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EidP_0216_A8;

/**
 *
 * @author Vu Viet Duc
 */
public class Test {

    public static void main(String[] args) {
        A test = new A(0);
        do {
            System.out.println(test);
            test = new B();
        } while (test.i < 9);
        System.out.println(test.i < 8 && test.check());
    }
}
