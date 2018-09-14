package Test1;

import java.util.*;

class Artikel implements Comparable<Artikel> {
    private String artNr;
    private String name;

    public Artikel(String artNr, String name) {
        this.artNr = artNr;
        this.name = name;
    }

    public String getArtNr() { return artNr; }

    public String getName() { return name; }

    public int compareTo(Artikel artikel) {
        // Die Methode compareToIgnoreCase() ist in der Klasse String implementiert und liefert den entsprechenden
        // Wert -1, 0, 1 bei Vergleich beider Strings

        int result = this.name.toLowerCase().trim().charAt(0) - artikel.name.toLowerCase().trim().charAt(0);
        if (result == 0)
            return this.artNr.trim().compareTo(artikel.artNr.trim());
        return result;
    }

    // Überschreiben der toString()-Methode, um die String repräsentation des Objektes ausgeben zu können.
    public String toString() { return (artNr + " " + name); }
}

class Vergleich {
    public static void main(String[] args) {
        Artikel[] arr = new Artikel[4];
        arr[0] = new Artikel("1000", "mutter 8x10");
        arr[1] = new Artikel("1001", "Dichtungsring 20x100");
        arr[2] = new Artikel("1002", "Abstreifring 25x125");
        arr[3] = new Artikel("1003", "montierbarer Zackenring");

      //  Arrays.sort(arr);
        Arrays.sort(arr, new Comparator<Artikel>() {
            @Override
            public int compare(Artikel o1, Artikel o2) {
                int result = o1.getName().toLowerCase().trim().charAt(0) - o2.getName().toLowerCase().trim().charAt(0);
                if (result == 0)
                    return o1.getArtNr().trim().compareTo(o2.getArtNr().trim());
                return result;
            }
        });

        for (Artikel artikel : arr)
            System.out.println(artikel);
    }
}
