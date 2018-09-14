package VL13_A3;

public class Angestellter extends Mitarbeiter{
    private double grundgehalt;
    private double ortszuschlag;
    private double zulage;
    
    public Angestellter(String name, double gGehalt,
            double ortszus, double zulage, Abteilung abt) {
        super(name, abt);
        grundgehalt = gGehalt;
        ortszuschlag = ortszus;
        this.zulage = zulage;
    }
    
    @Override
    public double berechneGehalt() {
        return (grundgehalt + ortszuschlag + zulage);
    }
}
