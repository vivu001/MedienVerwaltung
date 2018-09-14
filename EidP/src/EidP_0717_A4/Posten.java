package EidP_0717_A4;

public abstract class Posten {
    private String bezeichnung;

    public Posten(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public abstract double berechnePreis();
}
