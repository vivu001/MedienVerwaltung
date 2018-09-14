package EidP_0217_A4;

import java.time.LocalTime;

public class Smartphone extends Telefon implements Uhr{
    private double displaygroesse;
    SMS[] dieSMS = new SMS[1000];
    private int anzSMS = 0;

    public Smartphone(int id, String rufnummer, double displaygroesse) {
        super(id, rufnummer);
        this.displaygroesse = displaygroesse;
    }

    public int getAnzahlSMS() {
        return anzSMS;
    }

    public void removeSMS(int pos) {
        if (pos < anzSMS && pos > 0) {
            dieSMS[pos] = dieSMS[anzSMS-1];
            dieSMS[anzSMS-1] = null;
            anzSMS--;
        }
    }

    public int addSMS(int empfaengerID, String text) {
        if (anzSMS < 1000) {
            dieSMS[anzSMS++] = new SMS(empfaengerID, text);
            return anzSMS-1;
        } else return -1;
    }

    public String totring() {
        return super.toString() + " Displaygroesse: " + displaygroesse;
    }

    public java.time.LocalTime getUhrzeit() {
        return LocalTime.now();
    }
}
