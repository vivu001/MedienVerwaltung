/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prk_06;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Vu Viet Duc
 */
public class Werbung implements Observer{
    
    @Override
    public void update(Observable o, Object o1) {
        if (o instanceof Artikel) {
            Artikel a = (Artikel) o;
            System.out.printf("Neuer Preis: %.2f\n", a.getPreis());
        }   
    }
}
