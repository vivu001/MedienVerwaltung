package Aufgabe36_37_Bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Artikel {
    public static final String PROP_PREIS = "preis";
    private final PropertyChangeSupport listener;
    private String id;
    private double preis;

    public Artikel(String id, double preis) {
        this.id = id;
        this.preis = preis;
        listener = new PropertyChangeSupport(this);
    }

    public String getId() { return id; }

    public double getPreis() { return preis; }

    public void setId(String id) { this.id = id; }

    public void setPreis(double preis) {
        double alt = this.preis;
        this.preis = preis;

        if (alt > preis) {
            listener.firePropertyChange(PROP_PREIS, alt, preis);
        }
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        listener.addPropertyChangeListener(l);
    }
}
