package Klausur_0218_A5;

public class rekursion {

    public static void main(String[] args) {
        System.out.println(tuwas("001", "aab", 0));
        System.out.println(tuwas("0001", "ab", 1));
    }

    public static String tuwas(String s, String w, int n) {
        String ergebnis = "";
        int count = 0;

        if (s.length() <= n) ergebnis = w;
        else if (w.length() <= n) ergebnis = s;
            else ergebnis = "" + s.charAt(n) + w.charAt(n) + tuwas(s, w, n+1);

        return ergebnis;
    }
}
