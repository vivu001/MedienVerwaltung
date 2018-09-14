/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EidP_0209_A6;

/**
 *
 * @author Vu Viet Duc
 */
public class magischesQuadrat {
    public static void main(String[] args) {
        int[][] quad = {{16, 5, 9, 4}, 
                        {2, 11, 7, 14},
                        {3, 10, 6, 15},
                        {13, 8, 12, 4}};
               
        System.out.println(isMagischesQuadrat(quad));
    }
    
    public static boolean isMagischesQuadrat(int[][] quad) {
        boolean test = true;
        
        for (int i=0; i < quad.length-1; i++) 
            if ((summeZeile(quad, i) != summeZeile(quad, i+1)) || 
               (summeSpalte(quad, i) != summeSpalte(quad, i+1)))  {
                    test = false;
                    break;
            }
            
        if (summeZeile(quad, 0) != summeSpalte(quad, 0)) return false;
        
        return test;
    }
    
    public static int summeZeile(int[][] quad, int zeile) {
        int s = 0;
        for (int i=0; i< quad.length; i++)
            s += quad[zeile][i];
        
        return s;
    }
    
     public static int summeSpalte(int[][] quad, int spalte) {
        int s = 0;
        for (int i=0; i< quad.length; i++)
            s += quad[i][spalte];
        
        return s;
    }
}
