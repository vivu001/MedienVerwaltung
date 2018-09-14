package EidP_0718_A4;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        group();
    }

    public static void group() {
        int punkteItalien = 0;
        int punkteNiederlande = 0;
        int punkteDeutschland = 0;

        Scanner sc = new Scanner(System.in);
        int a, b;

        for (int i = 1; i <= 3; i++) {
            switch (i) {

                case 1: System.out.println("(1) Italien - Niederlande");
                    a = sc.nextInt(); b = sc.nextInt();
                    if (a > b) punkteItalien += 3;
                    else if (a < b) punkteNiederlande += 3;
                    else {
                        punkteItalien += 1;
                        punkteNiederlande += 1;
                    }
                    break;

                case 2: System.out.println("(2) Italien - Deutschland");
                    a = sc.nextInt(); b = sc.nextInt();
                    if (a > b) punkteItalien += 3;
                    else if (a < b) punkteDeutschland += 3;
                    else {
                        punkteItalien += 1;
                        punkteDeutschland += 1;
                    }
                    break;

                case 3: System.out.println("(3) Niederlande - Deutschland");
                    a = sc.nextInt(); b = sc.nextInt();
                    if (a > b) punkteNiederlande += 3;
                    else if (a < b) punkteDeutschland += 3;
                    else {
                        punkteNiederlande += 1;
                        punkteDeutschland += 1;
                    }
                    break;
            }
        }

        System.out.println("Italien " + punkteItalien);
        System.out.println("Niederlande " + punkteNiederlande);
        System.out.println("Deutschland " + punkteDeutschland);
    }
}
