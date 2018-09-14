/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VL14_A3;

/**
 *
 * @author Vu Viet Duc
 */
public class MainTest {

    public static void main(String[] args) {
        Smartphone sm1 = new Smartphone(0, "18194101", 4.3);
        Smartphone sm2 = new Smartphone(1, "03971723", 6.0);
        Smartphone sm3 = new Smartphone(2, "09713648", 5.5);

        System.out.println(sm1.toString());
        System.out.println(sm2.toString());
        System.out.println(sm3.toString());
               
        sm1.addSMS(2, "hallo hier ist sm1 !");
        sm1.addSMS(1, "hi ich bin sm1 !");
        sm2.addSMS(1, "Gutentag ich heisse sm2");
        sm3.addSMS(2, "Wie heisst du?");

        sm1.ausgebenSMS();
        System.out.println(sm1.getAnzahlSMS());
        
        System.out.println(sm2.getUhrzeit());
    }

}
