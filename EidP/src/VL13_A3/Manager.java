package VL13_A3;

public class Manager extends Mitarbeiter{
    private double festgehalt;
    private double provision;
    private double umsatz;
    
    public Manager(String name, double fgehalt, 
            double provision, Abteilung abt) {
        super(name, abt);
        festgehalt = fgehalt;
        this.provision = provision;
        
    }
    
    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }
    
    @Override
    public double berechneGehalt() {
        return (festgehalt + provision * umsatz);
    }
}
