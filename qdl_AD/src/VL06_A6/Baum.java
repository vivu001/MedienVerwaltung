package VL06_A6;

public class Baum {
    private Knoten wurzel;

    public Knoten getWurzel() { return this.wurzel; }

    public void einfuegen(int daten) {
        if (wurzel == null) {
            wurzel = new Knoten(daten);
        }
        else {
            einfuegenKnoten(daten, wurzel);
        }
    }

    public void einfuegenKnoten(int daten, Knoten teilbaum) {
        final int cmp = daten - teilbaum.getSchluessel();
        if (cmp == 0) return;

        if (cmp < 0) {
            if (teilbaum.getLinks() == null)
                teilbaum.setLinks(new Knoten(daten));
            else einfuegenKnoten(daten, teilbaum.getLinks());
        }
        else {
            if (teilbaum.getRechts() == null)
                teilbaum.setRechts(new Knoten(daten));
            else einfuegenKnoten(daten, teilbaum.getRechts());
        }
    }

    public String traversierePreOrder(Knoten einKnoten) {
        String str = "";
        str += einKnoten.getSchluessel();

        if (einKnoten.getLinks() != null) {
            str +=   ", " + traversierePreOrder(einKnoten.getLinks()) ;
        }

        if (einKnoten.getRechts() != null) {
            str += ", " + traversierePreOrder(einKnoten.getRechts()) ;
        }

        return str;
    }

    public boolean enthalten(Knoten k, int[] zahlen) {
        if (k == null) return false;

        for (int i = 0; i < zahlen.length; i++)
            if (zahlen[i] == k.getSchluessel())
                return true;

        return enthalten(k.getLinks(), zahlen) || enthalten(k.getRechts(), zahlen);
    }
}
