/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabenwechsel;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Vu Viet Duc
 */
public class Fabenwechsel extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Button btn = new Button("Farben wechseln");
//        btn.setOnAction(new MyEventHandler());
//        
//        BorderPane bp = new BorderPane();
//        bp.setCenter(btn);
//        
//        Scene scene = new Scene(bp, 200, 100);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("EventHandling");
//        primaryStage.show();

        Pane pane = new Pane();
          
          Rectangle rec = new Rectangle(50.0, 50.0, 100.0, 100.0);
             pane.getChildren().add(rec);
          
          Button b = new Button("Farbenwechsel");
          MyEventHandler me = new MyEventHandler(rec);
          b.setOnAction(me);
          
          BorderPane border = new BorderPane();
          border.setCenter(pane);
          //b.setAlignment(Pos.CENTER);
      
          border.setBottom(b);
          BorderPane.setAlignment(b, Pos.CENTER);
          Scene scene = new Scene(border, 400, 200);
          
          primaryStage.setScene(scene);
          primaryStage.setTitle("Faerbenwechseln");
          primaryStage.show();
          
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
