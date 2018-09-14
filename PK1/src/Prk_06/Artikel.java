package Prk_06;

import java.util.Observable;

public class Artikel extends Observable {
    private String id;
    private double preis;

    public String getID() {
        return id;
    }

    public void setID(String name) {
        this.id = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double neuerPreis) {
        double alterPreis = this.preis;
        this.preis = neuerPreis;

        if (alterPreis > neuerPreis) {
            setChanged();
            notifyObservers();// tai day method update() cua Werbung duoc goi de in thong tin cua Artikel.
        }
    }  
}
