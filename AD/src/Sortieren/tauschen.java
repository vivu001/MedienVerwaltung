/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sortieren;

/**
 *
 * @author Vu Viet Duc
 */
public class tauschen {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        System.out.println("a= " + a + ", b= " + b);
       
        /*int temp = a;
        a = b;
        b = temp; */
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("a= " + a + ", b= " + b);
    }
}
