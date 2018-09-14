package VL13_A3;

public class Geschaeftsfuehrer extends Manager{
    private double zulage;
    
    public Geschaeftsfuehrer(String name, double fgehalt, double provision,
            double zulage, Abteilung abt) {
        super(name, fgehalt, provision, abt);
        this.zulage = zulage;
    }
    
    @Override
    public double berechneGehalt() {
        return super.berechneGehalt() + zulage;
    }
}
