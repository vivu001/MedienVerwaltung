package Aufgabe_5;

public class Kfz {

    private String bezeichnung;
    private Person besitzer;

    public Kfz(String bezeichnung, Person besitzer) {
        this.bezeichnung = bezeichnung;
        this.besitzer = besitzer;
    }

    // Aufgabenteil c)
    @Override
    public String toString() {
        return bezeichnung + " mit Besitzer " + besitzer;
    }
}
