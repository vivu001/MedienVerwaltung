package DC_A8;

public class Link {
    // Attribute
    int daten;
    Link naechster;

    //Konstruktor
    Link(int daten, Link naechster) {
        this.daten = daten;
        this.naechster = naechster;
    }
}
