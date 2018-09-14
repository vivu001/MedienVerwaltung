/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VL14_A3;

import java.time.LocalTime;

/**
 *
 * @author Vu Viet Duc
 */
public class Smartphone extends Telefon implements Uhr{

    private double displaygroesse;
    int anzSMS = 0;
    SMS[] dieSMS = new SMS[1000];

    public Smartphone(int id, String rufnummer, double displaygroesse) {
        super(id, rufnummer);
        this.displaygroesse = displaygroesse;
    }

    public double getDisplaygroesse() {
        return this.displaygroesse;
    }

    public int getAnzahlSMS() {
        return anzSMS;
    }

    public int addSMS(int empfaengerID, String text) {
        if (anzSMS < 1000) {
            dieSMS[anzSMS]= new SMS(empfaengerID, text);         
            return anzSMS++;
        }
        return -1;
    }

    public void ausgebenSMS() {
        for (int i = 0; i < anzSMS; i++) {
            System.out.println("EmpfaengerID: " + dieSMS[i].getEmpfaengerId() + " Text: " + dieSMS[i].getText());
        }
    }

    public String toString() {
        return super.toString() + " Displaygroesse: " + getDisplaygroesse();
    }                                                   

    public java.time.LocalTime getUhrzeit() {
        return LocalTime.now();
    }
}