package EidP_0717_A4;

public class Rechnung {
    private int nummer;
    private static int anzRechnungen = 0;
    Posten[] diePosten;
    private int anzPosten;

    public Rechnung(){
        diePosten = new Posten[100];
        nummer = ++anzRechnungen;
    };

    public int getNummer() {
        return anzRechnungen;
    }

    public int getAnzahlPosten() {
        return anzPosten;
    }

    public int addPosten(Posten posten) {
        if (anzPosten < 100) {
            diePosten[anzPosten] = posten;
            return anzPosten++;
        } else return -1;
    }

    public double berechneGesamtpreis() {
        double result = 0;

        for (int i = 0; i < anzPosten; i++) {
            result += diePosten[i].berechnePreis();
        }

        return result;
    }
}
