package AD_8;

public class BasicSort
{
	// Insertionsort:
	// Sortiere das Teilfeld von array beginnend mit Index links bis einschlie�lich Index rechts
	public static void insertionsort(int[] array, final int links, final int rechts)
	{
		// TODO: Praktikum 8
            for (int i = links+1; i <= rechts; i++) {
                int x = array[i];
                int j;
                
                for (j = i-1; j >= links && x < array[j]; j--) {
                    array[j+1] = array[j];
                }
                array[j+1] = x;
            }        
	}

	// Selectionsort:
	// Sortiere das Teilfeld von array beginnend mit Index links bis einschlie�lich Index rechts
	public static void selectionsort(int[] array, final int links, final int rechts)
	{
		// TODO: Praktikum 8
		for (int i = links; i < rechts; i++) {
			int minIndex = i;
			for (int j = i+1; j <= rechts; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
            }
			
			// vertausche Elemente an Positionen i und minIndex
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;		
		}
	}

	// Bubblesort:
	// Sortiere das Teilfeld von array beginnend mit Index links bis einschlie�lich Index rechts
	public static void bubblesort(int[] array, final int links, final int rechts)
	{
            int i = rechts;
            boolean getauscht = true;
            
            while (i > links && getauscht) {
                getauscht = false; 
                for (int j = links; j < rechts; j++) {
                    if (array[j] > array[j+1]) {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                        getauscht = true;
                    }
                }
                i--;
            }
	}
}