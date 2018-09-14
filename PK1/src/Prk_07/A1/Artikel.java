/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prk_07.A1;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Vu Viet Duc
 */
public class Artikel {

    public static final String PROP_PREIS = "preis";
    private final PropertyChangeSupport listener;
    private String id;
    private double preis;

    public Artikel() {
        listener = new PropertyChangeSupport(this);
    }
    
    public String getID() {
        return id;
    }

    public void setID(String name) {
        this.id = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        double alt = this.preis;
        this.preis = preis;
        listener.firePropertyChange(PROP_PREIS, alt, preis);
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        listener.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        listener.removePropertyChangeListener(l);
    }
    
    
}
