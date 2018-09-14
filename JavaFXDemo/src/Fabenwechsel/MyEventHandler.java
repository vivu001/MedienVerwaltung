/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabenwechsel;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Vu Viet Duc
 */
public class MyEventHandler implements EventHandler<ActionEvent> {
    Rectangle rec;
    public MyEventHandler(Rectangle rec) {
        this.rec = rec;
    }
    @Override
    public void handle(ActionEvent event) {
        int r = (int) (255.0 * Math.random());
        int g = (int) (255.0 * Math.random());
        int b = (int) (255.0 * Math.random());
        rec.setFill(Color.rgb(r, g, b));
    }
}
