package Aufgabe36_37_Bean;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Artikel a1 = new Artikel("1", 50.5);
        Artikel a2 = new Artikel("2", 200);
        Artikel a3 = new Artikel("3", 46.7);
        Artikel a4 = new Artikel("4", 93.8);

        List<Artikel> list = new ArrayList<Artikel>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);

        for (Artikel a : list) {
            System.out.printf("ID: %s - Preis: %.2f\n", a.getId(), a.getPreis());
        }

        Werbung prospekt = new Werbung();
        for (Artikel a : list) {
            a.addPropertyChangeListener(prospekt);
        }

        a1.setPreis(50);
        a2.setPreis(250);
        a3.setPreis(35);

    }
}
