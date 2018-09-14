package farbwechsel_outerclass;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MmyEventHandler implements EventHandler<ActionEvent> {
    Rectangle rec;

    public MmyEventHandler(Rectangle rec) {
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