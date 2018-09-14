package EidP_0718_A4;

public class Aufgabe_4 {
    public static void main(String[] args) {
        int[][] test = { {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12}};

        System.out.println(isHorizontalSymmetrisch(test));

        display(drehen(test));
    }

    public static boolean isHorizontalSymmetrisch(int[][] feld) {
        for (int i = 0; i < feld.length; i++)
            for (int j = 0 ; j < feld[i].length; j++)
                if (feld[i][j] != feld[i][feld[i].length - j - 1])
                    return false;

          return true;
    }

    public static int[][] drehen(int[][] bild) {
        int[][] result = new int[bild[0].length][bild.length];

        for (int i = 0; i < bild.length; i++)
            for (int j = 0 ; j < bild[i].length; j++)
                result[bild[i].length - j - 1][i] = bild[i][j];

        return result;
    }

    public static void display(int[][] feld) {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++)
                System.out.print(feld[i][j] + " ");
            System.out.println();
        }
    }
}