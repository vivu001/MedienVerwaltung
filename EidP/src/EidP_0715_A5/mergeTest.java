/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EidP_0715_A5;

/**
 *
 * @author Vu Viet Duc
 */
public class mergeTest {
    public static void main(String[] args) {
        int[] merge = merge(new int []{3,4,5,9,13}, new int[]{1,5,6,8});
        
        for (int i=0; i < merge.length; i++) 
            System.out.print(merge[i] + " ");
    }
    
    public static int[] merge (int[]a, int[]b) {
	int[] c = new int[a.length + b.length];

        // 2 arrays zusammenlegen
	for (int i=0; i < a.length; i++)
            c[i] = a[i];
	for (int i=0; i < b.length; i++)
            c[i+a.length] = b[i];	
        
        // sortieren durch Selectionsort
	for (int i=0; i < c.length-1; i++) {
            int minIndex = i;
            for (int j=i+1; j < c.length; j++) 
		if (c[minIndex] > c[j]) {
                    int mitte = c[minIndex];
                    c[minIndex] = c[j];
                    c[j] = mitte;
		}
        }
        return c;
    }

}