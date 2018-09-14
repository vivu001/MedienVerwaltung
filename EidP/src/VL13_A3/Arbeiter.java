package VL13_A3;

public class Arbeiter extends Mitarbeiter{
    private double stundenlohn;
    private double anzahlStunden;
    private double ueberstundenzuschlag;
    private double anzahlUeberstunden;
    
    public Arbeiter(String name, double stdlohn, double anzahlStd, 
            double uestzus, Abteilung abt) {
            super(name, abt);
            stundenlohn = stdlohn;
            anzahlStunden = anzahlStd;
            ueberstundenzuschlag = uestzus;
    }
    
    public void setAnzahlUeberstunden(double anzUestunden) {
        anzahlStunden = anzUestunden;
    }
    
    @Override
    public double berechneGehalt() {
        return (stundenlohn * anzahlStunden + 
                ueberstundenzuschlag * anzahlUeberstunden);
    }
}
