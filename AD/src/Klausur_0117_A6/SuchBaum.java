package Klausur_0117_A6;

public class SuchBaum {
    private Knoten wurzel;

    public void fuegeEin(int i) {
        if (wurzel == null) wurzel = new Knoten(i);
        else {
            Knoten elternKnoten = wurzel;
            while (elternKnoten != null) {
                if (i > elternKnoten.daten)
                    if (elternKnoten.linkesKind != null)
                        elternKnoten = elternKnoten.linkesKind;
                    else elternKnoten.linkesKind = new Knoten(i);
                else if (i < elternKnoten.daten)
                    if (elternKnoten.rechtesKind != null)
                        elternKnoten = elternKnoten.rechtesKind;
                    else elternKnoten.rechtesKind = new Knoten(i);
                else break;
            }
        }
    }

    public boolean suche(int i) {
        if (wurzel == null) return false;

        if (wurzel.daten == i) return true;
        else {
            if (i > wurzel.daten)
                wurzel = wurzel.linkesKind;
            else
                wurzel = wurzel.rechtesKind;

            return suche(i);
        }
    }

    public static void main(String[] args) {
        SuchBaum sb = new SuchBaum();
        sb.fuegeEin(7);
        sb.fuegeEin(5);
        sb.fuegeEin(4);
        sb.fuegeEin(8);
        sb.fuegeEin(9);
        sb.fuegeEin(1);

        System.out.println(sb.suche(1));
    }
}
