/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farbwechsel_outerclass;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * @author Vu Viet Duc
 */
public class Farbwechsel_OC extends Application {
    @Override
    public void start(Stage primaryStage) {

        // Pane pane = new Pane();

        Rectangle rec = new Rectangle(50.0, 50.0, 100.0, 100.0);
        //    pane.getChildren().add(rec);

        Button b = new Button("Farbenwechsel");
        MmyEventHandler me = new MmyEventHandler(rec);
        b.setOnAction(me);
        b.setMaxWidth(400);
        BorderPane border = new BorderPane();
        border.setPadding(new Insets(20));
        border.setCenter(rec);
        //b.setAlignment(Pos.CENTER);

        border.setBottom(b);
        BorderPane.setAlignment(b, Pos.CENTER);
        BorderPane.setAlignment(rec, Pos.CENTER);

        Scene scene = new Scene(border, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Faerbenwechseln");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
