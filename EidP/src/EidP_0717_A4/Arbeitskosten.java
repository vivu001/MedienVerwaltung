package EidP_0717_A4;

public class Arbeitskosten extends Posten{
    private double preisProStunde;
    private double anzahlStunden;

    public Arbeitskosten(String bezeichnung, double preisProStunde, double anzahlStunden) {
        super(bezeichnung);
        this.preisProStunde = preisProStunde;
        this.anzahlStunden = anzahlStunden;
    }

    public double getPreisProStunde() {
        return preisProStunde;
    }

    public double getAnzahlStunden() {
        return anzahlStunden;
    }

    public double berechnePreis() {
        return preisProStunde * anzahlStunden;
    }
}
