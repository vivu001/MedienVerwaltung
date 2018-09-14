package DC_A8;

public class Liste {
    // Attribute
    private Link anfang;
    private Link ende;

    //Konstruktor
    public Liste() {
        anfang = new Link(-1, null);
        ende = new Link(-1, anfang);
        anfang.naechster = ende;
    }

    public void einfuegenElement(int neuerWert) {
        Link neuerLink = new Link(neuerWert, ende);
        Link bisherLetzter = ende.naechster;
        bisherLetzter.naechster = neuerLink;
        ende.naechster = neuerLink;
    }

    // Liefert Zeiger auf erstes Nutzelement zurueck
    public Link getAnfang() {
        return anfang.naechster;
    }

    public Link getEnde() {
        return ende;
    }

    public static Liste merge(Liste liste1, Liste liste2) {
        Liste liste_Result = new Liste();

        Link zeiger = liste2.anfang;

        while (zeiger != null) {
            liste_Result.einfuegenElement(zeiger.daten);
            zeiger = zeiger.naechster;
        }



        return liste_Result;
    }

    public void display(Liste l) {
        for (Link pointer = l.anfang; pointer != null; pointer = pointer.naechster) {
            System.out.print(pointer.daten + "  ");
        }
    }
}
