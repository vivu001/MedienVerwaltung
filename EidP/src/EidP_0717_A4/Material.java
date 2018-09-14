package EidP_0717_A4;

public class Material extends Posten {
    private double preisProEinheit;
    private int anzahlEinheiten;

    public Material(String bezeichnung, double preisProEinheit, int anzahlEinheiten) {
        super(bezeichnung);
        this.preisProEinheit = preisProEinheit;
        this.anzahlEinheiten = anzahlEinheiten;
    }

    public double getPreisProEinheit() {
        return preisProEinheit;
    }

    public int getAnzahlEinheiten() {
        return anzahlEinheiten;
    }

    public double berechnePreis() {
        return preisProEinheit * anzahlEinheiten;
    }
}
