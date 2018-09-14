package Aufgabe36_37_Property;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Artikel {
    private DoubleProperty preis;
    private String id;

    public Artikel(String id) {
        this.id = id;
        this.preis = new SimpleDoubleProperty();
    }

    public String getId() { return id; }
    public final DoubleProperty preisProperty() { return preis; }
    public final double getPreis() { return preis.get(); }
    public final void setPreis(double preis) { this.preis.set(preis); }

}
