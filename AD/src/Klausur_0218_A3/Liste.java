package Klausur_0218_A3;

public class Liste {
    public Link anfang;
    public Link ende;

    public void fuegeEin(int i) {
        anfang = new Link(i, anfang, null);
    }

    public static Liste merger(Liste listeA, Liste listeB) {
        Liste erg = new Liste();
        Link zeiger1 = listeA.ende;
        Link zeiger2 = listeB.ende;

        while (zeiger1 != null) {
            erg.fuegeEin(zeiger1.daten);
            zeiger1 = zeiger1.vorgaenger;
            erg.fuegeEin(zeiger2.daten);
            zeiger2 = zeiger2.vorgaenger;
        }

        return erg;
    }

    public static void main(String[] args) {
        Liste l1 = new Liste();
        l1.fuegeEin(1);
        l1.fuegeEin(2);
        l1.fuegeEin(3);
        l1.display();

        Liste l2 = new Liste();
        l2.fuegeEin(4);
        l2.fuegeEin(5);
        l2.fuegeEin(6);
        l2.display();

        merger(l1, l2).display();
    }

    public void display() {
        Link zeiger = anfang;

        while (zeiger != null) {
            System.out.print(zeiger.daten + "  ");
            zeiger = zeiger.naechster;
        }
    }
}