/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe_7;

/**
 *
 * @author Vu Viet Duc
 */
public class B extends A {

    private int m;

    public B(int m, int n) {
        super(n);
        this.m = m + 1;
    }

    public int erhoehe(int i) {
        m += i;
        return super.erhoehe(i);
    }
}
