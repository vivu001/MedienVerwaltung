package DC_A20;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<NotenInfo> test = new ArrayList<>();

        Knoten k1 = new Knoten(new Student(5,1.3f));
        k1.setKnotenLinks(new Knoten(new Student(2,1.7f)));
        k1.setKnotenRechts(new Knoten(new Student(6,2f)));
        k1.getKnotenLinks().setKnotenLinks(new Knoten(new Student(1,3.3f)));
        erstelleNotenliste(test, k1);

        for (NotenInfo n : test) {
            System.out.println("Matrikelnummer: " + n.matrNr +
                    " | Note: " + n.noteInf2);
        }
    }

    public static void erstelleNotenliste(List<NotenInfo> notenListe, Knoten knoten) {
        if (knoten.getKnotenLinks() != null) {
            erstelleNotenliste(notenListe, knoten.getKnotenLinks());
        }

        notenListe.add(new NotenInfo(knoten.getStudent().getMatrNr(), knoten.getStudent().getNoteInf2()));

        if (knoten.getKnotenRechts() != null) {
            erstelleNotenliste(notenListe, knoten.getKnotenRechts());
        }
    }
}
