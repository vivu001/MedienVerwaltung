package Klausur_0815_A3;

class Aufgabe_3 {
    public static void main(String[] args) {
        System.out.println(anz(5));
    }

    public static long anz(long h) {
        assert (h >= 0);

        long result = 0;
        while (h > 0) {
            result = 1 + 2 * result;
            h--;
        }

        return result;
    }
}