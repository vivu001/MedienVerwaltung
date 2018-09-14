package Aufgabe_5;

public class Person {

    private String name;
    private int alter;
    private int id;
    private static int zaehler = 0; // Aufgabenteil a)

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
        id = ++zaehler; // Aufgabenteil a)
    }

    // Aufgabenteil c)
    @Override
    public String toString() {
        return "mit Besitzer " + name + ", " + alter + " Jahre alt";
    }
}
