/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sortieren;

/**
 *
 * @author Vu Viet Duc
 */
public class Test {
    public static void main(String[] args) {
        int[] test = {8, 6, 34, 22, 40, 5, 11, 23, 44, 18};
        
        System.out.println("Array before sorting: ");
        display(test);
        System.out.println("-------------------------------------");
        
        System.out.println("Array after sorting: ");
        System.out.println();
        
        System.out.println("Intertion Sort");
        InsertionSort(test);
        display(test);
        
        System.out.println("Selection Sort");
        SelectionSort(test);
        display(test);
        
        System.out.println("Bubble Sort");
        BubbleSort(test);
        display(test);
    }
    
    public static void InsertionSort(int[] feld) {
        for (int i = 1; i < feld.length; i++) {
            int j = i - 1;
            int temp = feld[i];
            while (j >= 0 && temp < feld[j]) {
                feld[j+1] = feld[j];
                j--;
            }
            feld[j+1] = temp;
        }
    }
    
    public static void SelectionSort(int[] feld) {
          for (int i=0; i < feld.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < feld.length; j++ ) 
                if (feld[j] < feld[minIndex]) {
                    minIndex = j;
                }
         // Swap feld[i] and feld[minIndex]
            int temp = feld[i];
            feld[i] = feld[minIndex];
            feld[minIndex] = temp;
        }
    }
    
     public static void BubbleSort(int[] feld) {
    	int i = feld.length;
    	boolean getauscht = true;
    	
    	while (i > 1 && getauscht) {
    		getauscht = false;
    		for (int j = 1; j < i-1; j++) {
    			if (feld[j] > feld[j+1]) {
                            // Swap feld[j] and feld[j+1]
                            int temp = feld[j];
                            feld[j] = feld[j+1];
                            feld[j+1] = temp;
                            getauscht = true;
    			}
    		}
    		i--;
    	}
     }
     
    public static void display(int[] feld) {
        for (int i = 0; i < feld.length; i++)
            if (i < feld.length-1) 
                System.out.print(feld[i] + "  ");
            else {
            	System.out.println(feld[i]);
            	System.out.println();
            }
    }
}
