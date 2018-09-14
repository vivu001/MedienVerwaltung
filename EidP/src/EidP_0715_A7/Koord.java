/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EidP_0715_A7;

/**
 *
 * @author Vu Viet Duc
 */
public class Koord {

    private int xKoord;
    private int yKoord;

    public Koord(int xKoord) {
        this.xKoord = xKoord;
    }

    public Koord(int xKoord, int yKoord) {
        this.xKoord = xKoord;
        this.yKoord = yKoord;
    }

    public void move(int xOffset, int yOffset) {
        xKoord += xOffset;
        yKoord += yOffset;
        // Zeitpunkt 1
    }

    public int getxKoord() {
        return xKoord;
    }

    public int getyKoord() {
        return yKoord;
    }

    
    
}
