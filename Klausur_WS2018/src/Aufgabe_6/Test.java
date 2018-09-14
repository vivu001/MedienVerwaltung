/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe_6;

/**
 *
 * @author Vu Viet Duc
 */
public class Test {
    public static void main(String[] args) {
        InternetRadio ir1 = new InternetRadio(0, "Siemens");
        System.out.println(ir1.getAnzahlFavoriten());
        
        ir1.addFavorit("efwgweg", "15h33");
        ir1.addFavorit("j5u4g3", "2716g");
        
        System.out.println(ir1.getAnzahlFavoriten());
        
        ir1.ausgebenFavoriten();
        
        System.out.println(ir1.removeFavorit());      
        ir1.ausgebenFavoriten();
        
        System.out.println(ir1.removeFavorit());      
        ir1.ausgebenFavoriten();
        
        System.out.println(ir1.removeFavorit());      
        ir1.ausgebenFavoriten();
    }
}
