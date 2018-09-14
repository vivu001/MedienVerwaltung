/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursion;

/**
 *
 * @author Vu Viet Duc
 */
public class reverse_String {

    public static int reka(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return (reka(n - 1) + reka(n - 1));
        }
    }

    public static int rekb(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return 2 * rekb(n - 1);
        }
    }

    public static void ausgeben(String st) {
        int length = st.length();
        if (length > 0) {
            System.out.print(st.charAt(0));
            ausgeben(st.substring(1, length));
            System.out.print(st.charAt(0));
        }
    }

    public static void ausgebenIterativ(String st) {

        for (int i = 0; i < st.length(); i++) {
            System.out.print(st.charAt(i));
        }
        for (int i = st.length() - 1; i >= 0; i--) {
            System.out.print(st.charAt(i));
        }
    }

    public static int summeArten(int n, int k) {

        if (k == 0 || k > n) {
            return 0;
        }
        if (k == n) {
            return 1;
        }

        return summeArten(n - 1, k - 1) + summeArten(n - k, k);

    }

    static int proz1(int n) {
        int k = 0;
        int p = 0;
        int count =0;
        while (p != n) {
            if (p < 7) {
                k++;
            }

            while (k > 7) {
                k--;
            }
            p++;
            count++;
        }
        System.out.println(k);
        return count;
    }

    public static void main(String[] args) {

        System.out.println(proz1(100));

    }
}
