package Klausur_0817_A3;

public class Test {
    public static void main(String[] args) {
        Liste liste = new Liste();

        liste.fuegeEin(35);
        liste.fuegeEin(30);
        liste.fuegeEin(25);
        liste.fuegeEin(20);
        liste.fuegeEin(15);
        liste.fuegeEin(10);
        liste.fuegeEin(5);

        System.out.println("Die Liste: ");
        liste.display(liste);
        System.out.println();

        System.out.println("\nDie zweite Liste: ");
        liste.display(liste.teile());

        System.out.println("\nDie erste Liste: ");
        liste.display(liste);
    }
}
