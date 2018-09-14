package Klausur_0117_A3;

import java.util.ArrayList;

class Link {
    public int daten;
    public Link naechster;

    public Link(int daten, Link naechster) {
        this.daten = daten;
        this.naechster = naechster;
    }
}

class Liste {
    private Link anfang;

    public void fuegeEin(int i) {
        anfang = new Link(i, anfang);
    }

    // Aufgabenteil a)
    public int zaehleElemente() {
        Link zeiger = anfang;
        int count = 1;

        while (zeiger.naechster != null) {
            zeiger = zeiger.naechster;
            count++;
        }

        return count;
    }

    // Aufgabenteil b)
    public Liste kuerze(int n) {
        if (n < zaehleElemente()) return this;

        Link zeiger = anfang;
        while (zeiger.naechster.naechster != null)
            zeiger = zeiger.naechster;

        zeiger.naechster = null;

        return this;
    }

    // Aufgabenteil c)
    public static void main(String[] args) {
        Liste list = new Liste();
        list.fuegeEin(4);
        list.fuegeEin(3);
        list.fuegeEin(2);
        list.fuegeEin(1);

        display(list);

        System.out.print("\nDie Anzahl der Elemente: ");
        System.out.println(list.zaehleElemente());

        System.out.println("\nNach dem Verkuerzen: ");
        display(list.kuerze(4));
    }

    public static void display(Liste list) {
        for (Link zeiger = list.anfang; zeiger != null; zeiger = zeiger.naechster) {
            System.out.println(zeiger.daten);
        }
    }
}
