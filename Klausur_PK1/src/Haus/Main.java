/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Haus;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Vu Viet Duc
 */
public class Main {
    public static void main(String[] args) {
         ArrayList<Bungalow> hausList = new ArrayList<>();
         
         hausList.add(new Bungalow(234, 6));
         hausList.add(new Bungalow(78, 3));
         hausList.add(new Bungalow(55, 3));     
         hausList.add(new Bungalow(120, 4));
         hausList.add(new Bungalow(30, 2));
         
         Collections.sort(hausList);
         
         for (Bungalow bungalow: hausList) 
             bungalow.druckDaten();
    }
}
