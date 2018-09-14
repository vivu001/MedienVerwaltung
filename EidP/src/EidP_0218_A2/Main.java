/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EidP_0218_A2;

import java.util.Scanner;

/**
 *
 * @author Vu Viet Duc
 */
public class Main {

    public static void zeigeMenue() {
        System.out.println("(1) Zeige die 1. bis 7. eingegebene Zahl");
        System.out.println("(2) Zeige die achte eingegebene Zahl");
        System.out.println("(3) Zeige die neunte eingegebene Zahl");
        System.out.println("(4) Beende das Programm");
    }

    public static void main(String[] args) {
        int[] a = new int[9];
        Scanner sc = new Scanner(System.in);

        // 9 Ganzzahlen von der Konsole einlesen
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }
      
        do {
            zeigeMenue();

            System.out.print("Auswahl: ");
            int auswahl = sc.nextInt();

            switch (auswahl) {
                case 1: for (int i = 0; i < 7; i++) {
                            System.out.println(a[i]);
                        }
                        break;
                case 2: System.out.println(a[7]); 
                        break;
                case 3: System.out.println(a[8]); 
                        break;
                case 4: System.exit(0); 
            } 
        } while (true);       
    }
}
