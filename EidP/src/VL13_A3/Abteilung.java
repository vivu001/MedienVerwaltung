package VL13_A3;

public class Abteilung {
    private String bezeichnung;
    Mitarbeiter[] dieMitarbeiter = new Mitarbeiter[15];
    private int counter = 0;
    
    public Abteilung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
    
    public String getBezeichnung() {
        return this.bezeichnung;              
    }
    
    public int getAnzahlMitarbeiter() {
        return counter;
    }
    
    public void addMitarbeiter(Mitarbeiter mit) {
        if (counter < dieMitarbeiter.length) {
            dieMitarbeiter[counter++] = mit;
        }        
    }
    
    public Mitarbeiter getMitarbeiter(int i) {
        if (i < counter && i >= 0)
            return dieMitarbeiter[i];
        else return null;
    }
    
    public double berechneGehaltskosten() {
        double erg = 0.0;
        
        for (int i=0; i < counter; i++) {
            erg += dieMitarbeiter[i].berechneGehalt();
        }
        
        return erg;
    }
}
