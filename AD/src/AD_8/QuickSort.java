package AD_8;

public class QuickSort {

    public static void quicksort(int[] array, final int links, final int rechts) {

        // TODO: Praktikum 8
        int li = links;
        int re = rechts;
        int verg = array[(links + rechts) / 2];
        
        while (li <= re) {
            while (array[li] < verg) {
                li++;
            }

            while (array[re] > verg) {
                re--;
            }

            if (li <= re) {
                int temp = array[li];
                array[li] = array[re];
                array[re] = temp;

                li++;
                re--;
            }
        }
        
        if (links < re) {
            quicksort(array, links, re);
        }
        
        if (rechts > li) {
            quicksort(array, li, rechts);
        }
    }
}
