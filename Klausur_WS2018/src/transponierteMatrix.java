
public class transponierteMatrix {

    //transpose Matrix
    public static int[][] transponierteMatrix(int[][] feld) {
        int[][] feld1 = new int[feld[0].length][feld.length];
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                feld1[j][i] = feld[i][j];  // Vorsicht: feld1[i][j] = feld[j][i] --> falsch				
            }
        }
        return feld1;
    }

    //check transpose Matrix
    public static boolean istT_Matrix(int[][] a, int[][] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (b[i][j] != transponierteMatrix(a)[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Array print 
    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {{2, 5, 7, 0}, {3, 1, 4, -9}, {3, 4, -1, 2}};
        print(a);
        System.out.println();
        print(transponierteMatrix(a));
        System.out.println();

        int[][] b = {{2, 3, 3}, {5, 1, 4}, {7, 4, -1}, {0, -9, 0}};
        print(b);
        System.out.println();
        if (istT_Matrix(a, b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
