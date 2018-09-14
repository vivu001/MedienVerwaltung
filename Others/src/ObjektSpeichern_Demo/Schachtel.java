package ObjektSpeichern_Demo;

import java.io.Serializable;

public class Schachtel implements Serializable {
    private int breite;
    private int hoehe;
    static final long serialVersionUID = -1L;

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    @Override
    public String toString() {
        return "Breite: " + breite + " Hoehe: " + hoehe;
    }
}
