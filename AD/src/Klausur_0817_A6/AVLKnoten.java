package Klausur_0817_A6;

public class AVLKnoten {
    public int daten;
    public int balanceFaktor;
    public AVLKnoten linkesKind, rechtesKind;

    public AVLKnoten(int daten) {
        this.daten = daten;
    }
}
