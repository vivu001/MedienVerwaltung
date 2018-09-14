/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prk_06;

import java.util.ArrayList;

/**
 *
 * @author Vu Viet Duc
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Artikel> bestand = new ArrayList<>();
        Werbung prospekt = new Werbung();   
        
        Artikel a1 = new Artikel();
        a1.setID("Buch"); a1.setPreis(20);
        
        Artikel a2 = new Artikel();
        a2.setID("Notebook"); a2.setPreis(980);
        
        Artikel a3 = new Artikel();
        a3.setID("Lampe"); a3.setPreis(30);
        
        bestand.add(a1);
        bestand.add(a2);
        bestand.add(a3);
               
        for (Artikel a : bestand) {
            a.addObserver(prospekt);     
        }
        
        a1.setPreis(25);
        a2.setPreis(800);
        a3.setPreis(23);   
        a2.setPreis(850);
    }      
}
