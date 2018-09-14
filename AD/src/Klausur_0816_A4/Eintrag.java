package Klausur_0816_A4;

class Eintrag {
    int schluessel;
    boolean geloescht;

    public Eintrag(int schluessel) {
        this.schluessel = schluessel;
    }
}

class Hashtabelle {
    int kapazitaet;
    Eintrag[] eintraege;

    public Hashtabelle(int n) {
        kapazitaet = n;
        eintraege = new Eintrag[n];
    }

    public int hashWert(int schluessel) {
        return schluessel % kapazitaet;
    }

    public void einfuegen(int schluessel) {
        int h = hashWert(schluessel);

        while ((eintraege[h] != null) && !eintraege[h].geloescht)
            h = (h+3) % kapazitaet;
        eintraege[h] = new Eintrag(schluessel);
    }

    public void loeschen(int schluessel) {
        int h = hashWert(schluessel);

        while ((eintraege[h]!=null) && (eintraege[h].schluessel!=schluessel))
            h = (h+3) % kapazitaet;

        if (eintraege[h]!=null)
            eintraege[h].geloescht = true;
    }

    public boolean suchen(int schluessel) {
        for (int i = 0; i < kapazitaet; i++) {
            if (eintraege[i].schluessel == schluessel)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Hashtabelle htb = new Hashtabelle(7);
        htb.einfuegen(2);
        htb.einfuegen(12);
        htb.einfuegen(8);
        htb.einfuegen(3);
        htb.einfuegen(7);
        htb.einfuegen(9);
        htb.einfuegen(11);

        System.out.println(htb.suchen(3));
    }
}




