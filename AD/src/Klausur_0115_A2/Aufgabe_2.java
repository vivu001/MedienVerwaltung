package Klausur_0115_A2;

public class Aufgabe_2 {
    public static void main(String[] args) {
        int[][] array = {   {1, 1, 0, 1},
                            {1, 0, 0, 0},
                            {0, 0, 1, 0},
                            {1, 0, 1, 0}};

        System.out.println(berechneAusdehnung(array));

        System.out.println(sum_of_squares(4));

        int[] feld = {4, 6, 1, 9, 0, 10, 17, 20};
        System.out.println(max(feld, 8));

        System.out.println(max_log(feld, 2, 2));
    }

    // Aufgabe 2
    public static long berechneAusdehnung(int[][] matrix) {
        assert (matrix != null);

        long s = 0;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j <= i; j++) {
                if (matrix[i][j] == matrix[j][i])
                    s += matrix[i][j];
                else s += matrix[i][j] + matrix[j][i];
            }

        return s;
    }

    // Aufgabe 4
    static int sum_of_squares(int n) {
        if (n == 1) return 1;
        return n*n + sum_of_squares(n-1);
    }

    static int max(int[] a, int n) {
        if (n == 0)
            return a[0];
        else
            return Math.max(a[n-1], max(a, n-1));
    }

    static int max_c(int[] a, int n) {
        return max_log(a, 0, n-1);
    }

    static int max_log(int[] a, int li, int re) {
        if (li == re) return a[li];

        if (a[li] >= a[re]) return max_log(a, li, re-1);
        return max_log(a, li+1, re);
    }
}

