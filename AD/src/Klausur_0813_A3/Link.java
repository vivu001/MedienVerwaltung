package Klausur_0813_A3;

class Link {
    protected int daten;
    protected Link naechster;

    Link(int daten, Link naechster) {
        this.daten = daten;
        this.naechster = naechster;
    }
}

