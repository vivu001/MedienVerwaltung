package Klausur_0816_A3;

public class Kraftstoff{

}

class Diesel extends Kraftstoff {

}

class Benzin extends Kraftstoff {

}

class JetA1 extends Kraftstoff {

}

class Fahrzeug<T extends Kraftstoff> {
    private String name;
    private T kraftstoff;

    public Fahrzeug(String name) {
        this.name = name;
    }

    public void betanken(T kraftstoff) {
        if (this.name == "Flugzeug" && kraftstoff instanceof JetA1 || this.name == "Traktor" & kraftstoff instanceof Diesel
                || this.name == "Auto" && kraftstoff instanceof Benzin)
            this.kraftstoff = kraftstoff;
        else
            System.out.printf("Der Kraftstoff %s ist für ein %s der falsche Treibstoff. Bitte wählen Sie das richtige aus", name,  kraftstoff.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Fahrzeug traktor = new Fahrzeug("Traktor");
        traktor.betanken(new Diesel());

        Fahrzeug auto = new Fahrzeug("Auto");
        auto.betanken(new Benzin());

        Fahrzeug flugzeug = new Fahrzeug("Flugzeug");
        flugzeug.betanken(new Benzin());
    }
}
