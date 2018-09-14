package Klausur_0813_A3;

public class Liste {
    protected Link anfang;

    public Liste() { anfang = null; }

    // Für die Aufgabe a) ist hier (und nur hier) Programmcode einzufügen (in den vorbereiteten Kasten)
    public void verketten(Liste liste2) {
        Link zeiger = anfang;
        while (zeiger.naechster != null)
            zeiger = zeiger.naechster;

        zeiger.naechster = liste2.anfang;
//        liste2.anfang = null;
    }

    public void rueckwaertsausgeben() { rueckwaertsausgebenR(this.anfang); }

    // Für die Aufgabe b) ist hier (und nur hier) Programmcode einzufügen (in den vorbereiteten Kasten)
    public void rueckwaertsausgebenR(Link element) {
        if (element.naechster != null)
            rueckwaertsausgebenR(element.naechster);

        System.out.print(element.daten + "  ");
    }

    public void display() {
        Link zeiger = anfang;
        while (zeiger != null) {
            System.out.print(zeiger.daten + "  ");
            zeiger = zeiger.naechster;
        }
    }
}
