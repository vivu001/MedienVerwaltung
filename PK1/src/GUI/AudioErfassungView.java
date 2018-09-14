/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Prk_022.Bild;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Vu Viet Duc
 */
public class AudioErfassungView extends Stage{
    
    public AudioErfassungView(Bild b, Stage stage) {
        initOwner(stage);
        setTitle("AudioErfassung");
        initModality(Modality.APPLICATION_MODAL);
    }

    public void showView() {

        BorderPane borderpane = new BorderPane();
        borderpane.setPadding(new Insets(10.0));

        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(10.0));
        gridpane.setVgap(5.0);
        gridpane.setHgap(5.0);

        // Titel Label
        Label titel = new Label("Titel:");
        GridPane.setConstraints(titel, 0, 0);
        GridPane.setHalignment(titel, HPos.RIGHT);
        
        // Titel Input
        TextField tf1 = new TextField();
        GridPane.setConstraints(tf1, 1, 0);
        GridPane.setHgrow(tf1, Priority.ALWAYS);  
        
        // Jahr Label
        Label jahr = new Label("Jahr:");
        GridPane.setConstraints(jahr, 0, 1);
        GridPane.setHalignment(jahr, HPos.RIGHT);
        
        // Jahr Input
        TextField tf2 = new TextField();
        GridPane.setConstraints(tf2, 1, 1);
        GridPane.setHgrow(tf2, Priority.ALWAYS);
        
        // Interpret Label
        Label interpret = new Label("Interpret:");
        GridPane.setConstraints(interpret, 0, 2);
        GridPane.setHalignment(interpret, HPos.RIGHT);
        
        // Interpret Input
        TextField tf3 = new TextField();
        GridPane.setConstraints(tf3, 1, 2);
        GridPane.setHgrow(tf3, Priority.ALWAYS);
        
        // Dauer Label
        Label dauer = new Label("Dauer:");
        GridPane.setConstraints(dauer, 0, 3);
        GridPane.setHalignment(dauer, HPos.RIGHT);
        
        // Dauer Input
        TextField tf4 = new TextField();
        GridPane.setConstraints(tf4, 1, 3);
        GridPane.setHgrow(tf4, Priority.ALWAYS);
        
        gridpane.getChildren().addAll(titel, tf1, jahr, tf2, interpret, tf3, dauer, tf4);
        
        /* Label titel = new Label("Titel:");
        Label jahr = new Label("Jahr:");
        Label interpret = new Label("Interpret:");
        Label dauer = new Label("Dauer:");

        gridpane.add(titel, 0, 0);
        gridpane.add(jahr, 0, 1);
        gridpane.add(interpret, 0, 2);
        gridpane.add(dauer, 0, 3);
        GridPane.setHalignment(titel, HPos.RIGHT);
        GridPane.setHalignment(jahr, HPos.RIGHT);
        GridPane.setHalignment(interpret, HPos.RIGHT);
        GridPane.setHalignment(dauer, HPos.RIGHT);

        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        TextField tf4 = new TextField();

        gridpane.add(tf1, 1, 0);
        GridPane.setHgrow(tf1, Priority.ALWAYS);
        gridpane.add(tf2, 1, 1);
        GridPane.setHgrow(tf2, Priority.ALWAYS);
        gridpane.add(tf3, 1, 2);
        GridPane.setHgrow(tf3, Priority.ALWAYS);
        gridpane.add(tf4, 1, 3);
        GridPane.setHgrow(tf4, Priority.ALWAYS); */

        Button b1 = new Button("Neu");
        Button b2 = new Button("Abbrechen");
        b2.setOnAction(e -> close());

        HBox hb = new HBox();
        hb.setPadding(new Insets(10.0));
        hb.setSpacing(10.0);
        hb.getChildren().addAll(b1, b2);
        hb.setAlignment(Pos.BOTTOM_CENTER);

        borderpane.setCenter(gridpane);
        borderpane.setBottom(hb);
        
        Scene scene = new Scene(borderpane, 300, 200);
        setScene(scene);
        
        setMaxHeight(250);
        setMinHeight(230);
        setMinWidth(270);
        show();
    }
}
