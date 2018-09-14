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
public abstract class Geraet {
        private int id;
        public String hersteller;
//        private static int anzGeraet = 0;
        
        public Geraet(int id, String hersteller) {
            this.id = id;
            this.hersteller = hersteller;
//            id++;
        }
        
        public int getId() {
            return id;
        }
        
        public String getHersteller() {
            return hersteller;
        }
}
