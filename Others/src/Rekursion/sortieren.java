package Rekursion;

public class sortieren {
    public static void main(String[] args) {
        /*int[] a = {5, 1, 3, 7, 2, 9};
        int[] erg = sortiere(a, 2);

        for (int i = 0; i < erg.length; i++)
            System.out.print(erg[i] + "  ");

        System.out.println();
        int[] erg1 = sortiere(a);

        for (int i = 0; i < erg1.length; i++)
            System.out.print(erg1[i] + "  ");
        */

        String test = rek("Hallo");
        System.out.println(test);
    }

    static int pos = 1;
    public static String rek(String str) {

        if (str.length() - pos == 0)
            return str.charAt(0) + "";

        return str.charAt(str.length() - pos++) + rek(str);
    }

    public static int[] sortiere(int[] feld) {
        return sortiere(feld, feld.length);
    }

    public static int[] sortiere(int[] feld, int n) {
        if (n>1) {
            feld = sortiere(feld, n-1);
            int i = n-2;
            int c = feld[n-1];

            while (i>=0) {
                if (feld[i]>c)
                    break;
                feld[i+1]=feld[i];
                i--;
            }

            feld[i+1]=c;
        }

        return feld;
    }
}