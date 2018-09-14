package Klausur_0117_A7;

public class Sortieren {
    public static void main(String[] args) {
        int[] test = {4, 8, 5, 9, 6, 3, 2, 8, 7};

        display(test);
        System.out.println();

        sortiere(test);
        display(test);
    }

    public static int[] sortiere(int[] feld) {
        return sortiere(feld, 0, feld.length - 1);
    }

    public static int[] sortiere(int[] feld, int l, int r) {
        int zl = l;
        int zr = r;
        int p = feld[(r+l)/2];

        while (zr > zl) {
            while (feld[zl] > p) zl++;
            while (feld[zr] < p) zr--;

            if (zl < zr) {
                int temp = feld[zl];
                feld[zl++] = feld[zr];
                feld[zr++] = temp;
            }
            if (zl == zr) {
                sortiere(feld, l, zr-1);
                sortiere(feld, zl+1, r);
                return feld;
            }
        }

        if (l < r) {
            sortiere(feld, l, zr);
            sortiere(feld, zl, r);
        }
        return feld;
    }

    public static void display(int[] feld) {
        for (int i = 0; i < feld.length; i++) {
            System.out.print(feld[i] + "  ");
        }
    }
}
