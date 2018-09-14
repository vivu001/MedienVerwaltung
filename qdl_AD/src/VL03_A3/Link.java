package VL03_A3;

class Link {
    private int daten;
    protected Link naechster;
    protected Link vorgaenger;

    Link(int daten, Link vorgaenger, Link naechster) {
        this.daten = daten;
        this.naechster = naechster;
        this.vorgaenger = vorgaenger;
    }

    public void setDaten(int daten) {
        this.daten = daten;
    }

    public int getDaten() {
        return this.daten;
    }
}

class Liste {
    protected Link anfang;
    protected Link ende;

    public Liste() {
        anfang = null;
        ende = null;
    }

    public void elementAnfuegen(int neuesElement) {
        Link neu = new Link(neuesElement, ende, null);
        ende = neu;

        if (anfang == null)
            anfang = neu;
        else
            ende.vorgaenger.naechster = ende;
    }

    public void bereichEntfernen(int von, int bis) {
        try {
            assert (von <= bis) : "von muss kleiner als oder gleich bis";
            assert (anfang == null);

            Link zeiger1 = anfang;
            Link zeiger2 = anfang;

            while (zeiger1.getDaten() != von) {
                zeiger1 = zeiger1.naechster;
            }

            while (zeiger2.getDaten() != bis) {
                zeiger2 = zeiger2.naechster;
            }

            if (zeiger1 == anfang)
                if (zeiger2 == ende)
                    anfang = null;
                else anfang = zeiger2.naechster;
            else
                if (zeiger2 == ende)
                    zeiger1.vorgaenger.naechster = null;
                else
                    zeiger1.vorgaenger.naechster = zeiger2.naechster;

        } catch (AssertionError e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    public void display() {
        Link zeiger = anfang;
        for (; zeiger != null; zeiger = zeiger.naechster) {
            System.out.print(zeiger.getDaten() + "  ");
        }
    }
}
