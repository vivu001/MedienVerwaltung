package Klausur_0817_A6;

public class AVLBaum {
    private AVLKnoten wurzel;

    public AVLBaum(AVLKnoten wurzel) {
        this.wurzel = wurzel;
    }

    public int berechneHoehe() {
        return berechneHoehe(wurzel);
    }

    // Aufgabenteil b)
    private int berechneHoehe(AVLKnoten wurzelTeilbaum) {
        if (wurzelTeilbaum == null) return -1;

        if (berechneHoehe(wurzelTeilbaum.linkesKind) < berechneHoehe(wurzelTeilbaum.rechtesKind))
               return 1 + berechneHoehe(wurzelTeilbaum.rechtesKind);
        else return 1 + berechneHoehe(wurzelTeilbaum.linkesKind);

    }

    public void berechneBalanceFaktoren() {
        berechneBalanceFaktoren(wurzel);
    }

    // Aufgabenteil c)
    private void berechneBalanceFaktoren(AVLKnoten wurzelTeilbaum) {

    }

    public static void main(String[] args) {

        AVLKnoten k1 = new AVLKnoten(4);
//        k1.linkesKind = new AVLKnoten(2);
//        k1.rechtesKind = new AVLKnoten(8);
//        k1.linkesKind.linkesKind = new AVLKnoten(1);
//        k1.linkesKind.rechtesKind = new AVLKnoten(3);
//        k1.rechtesKind.linkesKind = new AVLKnoten(6);
//        k1.rechtesKind.rechtesKind = new AVLKnoten(9);

        AVLBaum baum = new AVLBaum(k1);

        System.out.println(baum.berechneHoehe());
    }
}
