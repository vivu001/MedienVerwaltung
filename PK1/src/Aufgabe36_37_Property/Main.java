package Aufgabe36_37_Property;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Artikel a1 = new Artikel("1"); a1.setPreis(99.99);
        Artikel a2 = new Artikel("2"); a2.setPreis(20.99);
        Artikel a3 = new Artikel("3"); a3.setPreis(175.10);
        Artikel a4 = new Artikel("4"); a4.setPreis(420.65);

        List<Artikel> list = new ArrayList<Artikel>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);

        for (Artikel a : list) {
            System.out.printf("ID: %s - Preis: %.2f\n", a.getId(), a.getPreis());
        }


    }
}
