/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Vu Viet Duc
 */
public class JavaFXDemo extends Application { 

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gridpane = new GridPane(); // tao ra layout dang Grid
        gridpane.setHgap(5.0); // set khoang cach giua 2 mat luoi theo chieu doc 
        gridpane.setVgap(5.0); // set khoang cach giua 2 mat luoi theo chieu ngang
        gridpane.setPadding(new Insets(10.0)); // set khoang cach cua khoi Grid so voi vien
        
        ListView listview = new ListView(); // tao 1 Listview dang cuon
        for (int i = 0; i < 20; i++) {
            listview.getItems().add("Item " + i);
        }

        Label label_1 = new Label("Label 0"); // tao ra Label chinh la Text
        Label label_2 = new Label("Label 0");

        TextField tf0 = new TextField("TextField 0"); // tao ra o chua noi dung Text
        TextField tf1 = new TextField("TextField 1");
      
        Button btn = new Button("Start"); // tao nut
        
        gridpane.add(listview, 0, 0, 1, 3); // dat List vua tao vao layout
        gridpane.add(label_1, 1, 0); // dat Label vao layout theo toa do
        gridpane.add(label_2, 1, 1);
        gridpane.add(tf0, 2, 0); // dat Textfield vao layout
        gridpane.add(tf1, 2, 1); 
        gridpane.add(btn, 2, 3); // dat Button vao layout
        
        GridPane.setHalignment(btn, HPos.CENTER); // dat button theo chieu doc vao trung tam cua phan Grid ma no dang nam 
        
        Scene scene = new Scene(gridpane); // tao ra 1 scene va xep layout da tao vao
        
        primaryStage.setScene(scene); // set Scene vua tao vao Stage 
        primaryStage.setTitle("GridPane Layout"); // dat tieu de cho Stage
        primaryStage.show(); // hien thi Stage
    }
}
