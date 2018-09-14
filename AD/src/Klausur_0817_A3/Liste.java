package Klausur_0817_A3;

public class Liste {
    private Link anfang;

    public void fuegeEin(int i) {
        anfang = new Link(i, anfang);
    }

    // Aufgabenteil a)
    public int bestimmeAnzahl() {
        if (anfang == null) return 0;
        int count = 0;

        for (Link zeiger = anfang; zeiger != null; zeiger = zeiger.naechster) {
            count++;
        }
        return count;
    }

    // Aufgabenteil b)
    public Liste teile() {
        if (bestimmeAnzahl() == 0) return null;

        Liste l2 = new Liste();
        Link zeiger = anfang;
        int count = 0;

        while (count != bestimmeAnzahl()/2) {
            count++;
            zeiger = zeiger.naechster;
        }

        l2.anfang = zeiger.naechster;
        zeiger.naechster = null;

        return l2;
    }

    public void display(Liste l) {
        for (Link pointer = l.anfang; pointer != null; pointer = pointer.naechster) {
            System.out.print(pointer.daten + "  ");
        }
    }
}