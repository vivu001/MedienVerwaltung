/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EidP_0216_A5;

/**
 *
 * @author Vu Viet Duc
 */
public class Bildschirm {

    boolean[][] pixel;

    public Bildschirm(int breite, int hoehe) {
        pixel = new boolean[hoehe][breite];
    }

    public void Rectangle(int z, int s, int b, int h) {
        assert z >= 0;
        assert s >= 0;
        assert z + h <= pixel.length;
        assert s + b <= pixel[0].length;
        assert b >= 2;
        assert h >= 2;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < b; j++) {
                if (i < s || j < z) {
                    System.out.printf("%-6s  ", "  -  ");
                } else if (i == z || i == h - 1 || j == s || j == b - 1) {
                    System.out.printf("%-6s  ", "true");
                } else {
                    System.out.printf("%-6s  ", "false");
                }
            }
            System.out.println();
        }
    }

}
