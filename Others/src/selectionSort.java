
public class selectionSort {
	public static void main(String[] args) {
		int[] test = {5,1,6,3,0};

		bubbleSort(test);

		for (int i = 0; i < test.length; i++) {
			System.out.printf(test[i] + " ");
		}
		
	}

	public static void bubbleSort(int[] list) {
		boolean istgetauscht = true;
		int i = list.length;
		while (i > 1 && istgetauscht) {
			istgetauscht = false;
			for (int j = 0; j < i - 1; j++ ) {
				if (list[j] > list[j+1]) {
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;

					istgetauscht = true;
				}
			}
			i--;
		}
	}

	public static void insertionSort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			int temp = list[i];
			int j;
			for (j = i-1; j >= 0 && temp < list[j]; j--) {
				list[j+1] = list[j];
			}

			list[j+1] = temp;
		}
	}

	public static void selectSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < list[minIndex]) {
					minIndex = j;
				}
			}

			int temp = list[i];
			list[i] = list[minIndex];
			list[minIndex] = temp;
		}
	}
}
