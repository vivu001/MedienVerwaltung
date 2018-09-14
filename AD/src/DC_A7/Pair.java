package DC_A7;

import java.util.ArrayList;
import java.util.List;

public class Pair {
    String eins;
    String zwei;

    public Pair(String eins, String zwei) {
        this.eins = eins;
        this.zwei = zwei;
    }

    public String toString() {
        return "(\"" + eins + "\", " + "\"" + zwei + "\")";
    }
}
