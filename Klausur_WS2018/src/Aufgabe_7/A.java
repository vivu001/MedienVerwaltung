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
public class A {

    private static int c = 1;
    private int m;
    private int n;

    public A(int n) {
        m = 5;
        c += m + n;
    }

    public int  methode(int i) {
        m -= i;
        return erhoehe(i);
// Zeitpunkt 1
    }

    public int erhoehe(int i) {
        return m += 2 * i;
    }
}
