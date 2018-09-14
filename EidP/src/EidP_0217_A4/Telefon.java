package EidP_0217_A4;

public class Telefon {
    private int id;
    private String rufnummer;

    public Telefon(int id, String rufnummer) {
        this.id = id;
        this.rufnummer = rufnummer;
    }

    public int getId() {
        return id;
    }

    public String getRufnummer() {
        return rufnummer;
    }

    public String toString() {
        return "ID: " + getId() + " Rufnummer: " + getRufnummer();
    }
}
