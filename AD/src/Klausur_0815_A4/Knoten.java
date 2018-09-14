package Klausur_0815_A4;

public class Knoten {
    private int wert;
    private Knoten teilbaumLinks;
    private Knoten teilbaumRechts;

    public Knoten(int wert, Knoten teilbaumLinks, Knoten teilbaumRechts) {
        this.wert = wert;
        this.teilbaumLinks = teilbaumLinks;
        this.teilbaumRechts = teilbaumRechts;
    }

    public int getWert() {
        return wert;
    }

    public Knoten getKnotenLinks() {
        return teilbaumLinks;
    }

    public Knoten getKnotenRechts() {
        return teilbaumRechts;
    }
}

class Baum {
    private Knoten wurzel;

    public Baum(Knoten wurzel) {
        this.wurzel = wurzel;
    }

    // Teil i
    public boolean istTeilbaumKleiner(Knoten k, int wert) {
       if (k.getKnotenLinks() == null && k.getKnotenRechts() == null) return true;

       if (k.getKnotenLinks() != null) {
           if (k.getKnotenLinks().getWert() >= wert) return false;
           istTeilbaumKleiner(k.getKnotenLinks(), wert);
       }

       if (k.getKnotenRechts() != null) {
           if (k.getKnotenRechts().getWert() >= wert) return false;
           return istTeilbaumKleiner(k.getKnotenRechts(), wert);
       }

       return true;
    }

    // Teil ii
    public boolean istTeilbaumGroesser(Knoten k, int wert) {
        if (k.getKnotenLinks() == null && k.getKnotenRechts() == null) return true;

        if (k.getKnotenLinks() != null) {
            if (k.getKnotenLinks().getWert() <= wert) return false;
            istTeilbaumKleiner(k.getKnotenLinks(), wert);
        }

        if (k.getKnotenRechts() != null) {
            if (k.getKnotenRechts().getWert() <= wert) return false;
            return istTeilbaumKleiner(k.getKnotenRechts(), wert);
        }

        return true;
    }

    public boolean istSuchbaum() {
        return istSuchbaum(wurzel);
    }

    // Teil iii
    public boolean istSuchbaum(Knoten k) {
        return true;
    }

    public static void main(String[] args) {
        Knoten k2 = new Knoten(2, null, null);
        Knoten k5 = new Knoten(5, null, null);
        Knoten k6 = new Knoten(6, null, null);
        Knoten k3 = new Knoten(3, null, k2);
        Knoten k1 = new Knoten(1, null, k5);
        Knoten k8 = new Knoten(8, k6, null);
        Knoten k7 = new Knoten(7, k3, null);
        Knoten k4 = new Knoten(4, k1, k8);
        Knoten k9 = new Knoten(9, k7, k4);

        Baum b = new Baum(k9);

//        System.out.println(b.istTeilbaumKleiner(k9, 2));
        System.out.println(b.istTeilbaumGroesser(k9, -1));
    }
}


