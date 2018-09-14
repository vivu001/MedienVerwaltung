/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EidP_0715_A7;

/**
 *
 * @author Vu Viet Duc
 */
public class Test {

    public static void main(String[] args) {
        Koord k1 = new Koord(5);
        Koord k2 = new Koord(2, 6);
        k1.move(5, 10);
        
        System.out.println(k1.getxKoord());
        System.out.println(k1.getyKoord());
    }
}
