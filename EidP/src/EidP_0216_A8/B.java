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
public class B extends A {

    public int i;
    static int j = 3;

    public B() {
        super(++j);
        i = ++j;
    }

    public String toString() {
        return "B: " + i;
    }
}
