package farbewechsel_self;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Farbwechsel_Self extends Application implements EventHandler<ActionEvent> {
    Rectangle rec;
    @Override
    public void start(Stage primaryStage) throws Exception {
        rec = new Rectangle(50.0, 50.0, 100.0, 100.0);
        Button b = new Button("Farbenwechsel");
        b.setOnAction(this);
        b.setMaxWidth(400);

        BorderPane border = new BorderPane();
        border.setPadding(new Insets(20));
        border.setCenter(rec);

        border.setBottom(b);
        BorderPane.setAlignment(b, Pos.CENTER);
        BorderPane.setAlignment(rec, Pos.CENTER);

        Scene scene = new Scene(border, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Faerbenwechseln");
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        int r = (int) (255.0 * Math.random());
        int g = (int) (255.0 * Math.random());
        int b = (int) (255.0 * Math.random());
        rec.setFill(Color.rgb(r, g, b));
    }
}
