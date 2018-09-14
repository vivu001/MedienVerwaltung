package AD_8;

public class HeapSort {
    // Versickere das Element mit Index zuversickern in dem Teilfeld von Index links bis einschlie�lich Index rechts

    public static void versickere(int[] array, int zuversickern, final int links, final int rechts) {
        // Im Gegensatz zur Vorlesung ben�tigt diese Methode drei Parameter, da der zu sortierende Bereich
        // nicht bei 0, sondern bei links anf�ngt. Linkes Kind von Knoten x: (x-links)*2+links+1

        // TODO: Praktikum 9
        int i = zuversickern;
        int x = array[i];
        boolean versinkenErforderlich = true;

        while ((2*i+1-links) <= rechts) {                   // A[i] hat ein linkes Kind
            int j = 2*i+1-links;                            // A[j] ist linkes Kind von A[i]

            if (((j + 1) <= rechts) && (array[j] < array[j + 1])) {
                j++;                                // A[i] hat auch ein rechtes Kind
            }                                       // jetzt ist A[j] das größere der beiden Kinder

            if (x < array[j]) {                     // lasse x versinken, A[j] steigt nach oben
                array[i] = array[j];
                i = j;                              // i Zwischenposition des zu versenkenden Elements
            } else {                                // i am Schluss auf der Pos., an der x hin muss
                array[i] = x;
                i = rechts;                         // halte an, Heap-Bedingung erfüllt
                versinkenErforderlich = false;
            }
        }

        if (versinkenErforderlich) {
            array[i] = x;
        }
    }

    public static void heapsort(int[] array, final int links, final int rechts) {
        // TODO: Praktikum 9

        // Erste Phase: Wandle A[links]..A[rechts] in einen Heap um
        int n = links + rechts -1;
        for (int i = n/2; i >= links; i--) {
            versickere(array, i, links, rechts);
        }

        // Zweite Phase: Größte Elemente sukzessive
        // nach hinten; vordere Restfelder in Heap umwandeln
        for (int i = rechts; i > links; i--) {
            //vertauschen A[1inks] & A[i]
            int temp = array[links];
            array[links] = array[i];
            array[i] = temp;

            //versickern A[links] in A[links+1]..A[i-1]			
            versickere(array, links, links, i-1);
        }
    }
}
