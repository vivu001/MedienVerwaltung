/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EidP_0210_A5;

/**
 *
 * @author Vu Viet Duc
 */
public class Aufgabe_5 {
    public static void main(String[] args) {
        char[] test = {'e', 'i', 'n',' ','e','s', 'e', 'l',' ',' ',' ','l','e','s','e',' ','n','i','e'};
       
        System.out.println(zaehlerZeichen(test, 'e'));
        System.out.println(palindromtest(test));       
    }
    
    static int zaehlerZeichen(char[] text, char c) {
        int count = 0;
        for (int i=0; i<text.length; i++) 
            if (text[i] == c) count++;
        
        return count;
    }
    
    static boolean palindromtest (char[] text) {
        boolean test = true;
        int i=0;
   
        while (i < text.length/2) {
            if (text[i] != text[text.length-i-1]) {
                test = false;
                break;
            } 
            i++;
        }
        
        return test;
    }
}
