package Klausur_0218_A3;

public class Link {
    public int daten;
    public Link naechster;
    public Link vorgaenger;

    public Link(int daten, Link naechster, Link vorgaenger) {
        this.daten = daten;
        this.naechster = naechster;
        this.vorgaenger = vorgaenger;
    }

}
