package VL12;

class Link {
    Link next;
    int nodeIndex;
    Link(int nodeIndex) {this.nodeIndex = nodeIndex;}
}

public class VL12 {
    public static void main(String[] args) {
    /*    boolean[][] test = { {false, false, false, false},
                             {true, true, false, false},
                             {false, true, false, true},
                             {true, false, false, false}
                            };
        display(test);
        System.out.println("----------------------------------");
        display(toUndirected(test));

        int[][] test1 = {   {0, 0, 0, 0},
                            {0, 0, 0, 0},
                            {0, 0, 0, 0},
                            {0, 0, 0, 0}
                        };
        display(test1);
        System.out.println(testUndirected(test1));*/

        boolean[][] test3 = {   {false, false, true, false},
                                {true, true, false, false},
                                {false, true, false, true},
                                {true, false, false, false}
                            };
        display(test3);
        System.out.println("----------------------------------");

        Link[] result = toList(test3);
        for (int i = 0; i < result.length; i++) {
            Link zeiger = result[i];
            while (zeiger != null) {
                System.out.print(zeiger.nodeIndex + "   ");
                zeiger = zeiger.next;
            }
            System.out.println();
        }
    }

    // Aufgabe 3
    public static boolean[][] toUndirected(boolean[][] graph) {
        boolean[][] erg = new boolean[graph.length][graph[0].length];

        for (int i = 0; i < graph.length; i++)
            for (int j = 0; j <= i; j++) {
                if (((graph[i][j]) || (graph[j][i])) && graph[i][j] != graph[j][i])
                    erg[i][j] = erg[j][i] = true;
            }
        return erg;
    }

    // Aufgabe 4
    public static boolean testUndirected(int[][] graph) {
        boolean istGewichtet = false;
        for (int i = 0; i < graph.length; i++)
            for (int j = 0; j <= i; j++) {
                if (graph[i][j] != 0 || graph[j][i] != 0)
                    istGewichtet = true;
                if (graph[i][j] != graph[j][i])
                    return false;
            }

        return istGewichtet && true;
    }

    // Aufgabe 5
     public static Link[] toList(boolean[][] graph) {
        Link[] list = new Link[graph.length];

        for (int i = 0; i < graph.length; i++) {
            list[i] = new Link(i);
            Link zeiger = list[i];

            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j]) {
                    zeiger.next = new Link(j);
                    zeiger = zeiger.next;
                }
            }
        }

        return list;
     }

    public static void display(boolean[][] feld) {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++)
                System.out.printf("%-8b", feld[i][j]);
            System.out.println();
        }
    }

    public static void display(int[][] feld) {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++)
                System.out.printf("%-5d", feld[i][j]);
            System.out.println();
        }
    }
}
