package Aufgabe36_37_Bean;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Werbung implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.printf("Neuer Preis: %.2f\n", evt.getNewValue());
    }
}