package Klausur_0816_A6;



public class Link<T> {
    public T daten;
    public Link naechster;

    public Link(T daten, Link naechster) {
        this.daten = daten;
        this.naechster = naechster;
    }
}
class Liste<T> {
    private Link<T> anfang;
    private Link<T> ende;

    public void einfuegenAnfang(T neuerWert) {
        anfang = new Link<T>(neuerWert, anfang);
        if (ende == null)
            ende = anfang;
    }

    // a)
    public void leeren() {
        if (anfang != null) {
            anfang = null;
        }
    }

    // b)
    public boolean hatGeradeAnzahl() {
        int count = 0;
        Link zeiger = anfang;

        while (zeiger != null) {
            count++;
            zeiger = zeiger.naechster;
        }

        if (count % 2 == 1) return true;
        return false;
    }

    public void display() {
        Link zeiger = anfang;

        while (zeiger != null) {
            System.out.print(zeiger.daten + "  ");
            zeiger = zeiger.naechster;
        }
    }
}
