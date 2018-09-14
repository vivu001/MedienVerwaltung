package Klausur_0813_A3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Liste l1 = new Liste();
        Link n1 = new Link(5, null);
        Link n2 = new Link(4, n1);
        Link n3 = new Link(3, n2);
        l1.anfang = n3;

        Liste l2 = new Liste();
        Link n4 = new Link(7, null);
        Link n5 = new Link(1, n4);
        l2.anfang = n5;

        l1.display();
        System.out.println();
        l2.display();
        System.out.println();

        l1.verketten(l2);
        l1.display();
        System.out.println();

        l1.rueckwaertsausgeben();
    }
}
