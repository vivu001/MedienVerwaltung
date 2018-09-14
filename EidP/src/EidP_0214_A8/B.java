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
public class B extends A{
    private int x = 25;
    public int getX() {
        return x;
    }
    
    public int meth() {
        return x + super.meth();
    }
}
