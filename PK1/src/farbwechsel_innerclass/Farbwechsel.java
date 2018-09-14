package farbwechsel_innerclass;


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

class Farbwechsel_IC extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Rectangle rec = new Rectangle(50.0, 50.0, 100.0, 100.0);
        Button b = new Button("Farbenwechsel");
        class MyEventHandler implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent event) {
                int r = (int) (255.0 * Math.random());
                int g = (int) (255.0 * Math.random());
                int b = (int) (255.0 * Math.random());
                rec.setFill(Color.rgb(r, g, b));
            }
        }
        b.setOnAction(new MyEventHandler());
        b.setMaxWidth(400);

        rec.setFill(Color.BLACK);
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
}