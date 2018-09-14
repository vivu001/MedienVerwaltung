package Aufgabe_5;

public class Test {

    public static void main(String[] args) {
        Person p1 = new Person("Rolf", 60);
        Person p2 = new Person("Gudrun", 41);

        // Zeitpunkt a)
        // Anfang Aufgabenteil b)
        Person p3 = new Person("Hans", 40);

        Kfz porsche = new Kfz("Porsche", p1);
        Kfz vwkaefer = new Kfz("VW K�fer", p3);

        // Ende Aufgabenteil b)
        // Zeitpunkt b)
        System.out.println(porsche);
        System.out.println(vwkaefer);
    }
}
