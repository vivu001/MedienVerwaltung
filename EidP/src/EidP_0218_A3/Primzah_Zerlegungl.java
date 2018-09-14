/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EidP_0218_A3;

/**
 *
 * @author Vu Viet Duc
 */
public class Primzah_Zerlegungl {
    public static void main(String[] args) {
//        System.out.println(teileranzahl(37));
        System.out.println(primzahlzerlegung(0));
       
    }
    
    public static int teileranzahl(int n) {
        if (n == 0 || n == 1) return 1;
        if (n == 2) return 2;
        int count = 2;
        
        for (int i = 1; i <= n; i++)
            if (n%i == 0) count++;
        
        return count/2;
    }
    
    public static String primzahlzerlegung(int n) {     
        String erg = "";
        
        int i = 2;
        while (n != 1) {
            while ((n % i == 0) && (teileranzahl(i) == 2)) {
                if (erg.isEmpty()) erg += i;
                else erg += "*" + i;
                n /= i;
            }
            i++;
        }
        
        return erg;
    }
}
