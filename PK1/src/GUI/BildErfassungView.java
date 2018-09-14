package GUI;

import Prk_022.*;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
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

public class BildErfassungView extends Stage {

    public BildErfassungView(Bild b, Stage stage) {
        initOwner(stage);
        setTitle("BildErfassung");
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

        // Ort Label
        Label ort = new Label("Ort:");
        GridPane.setConstraints(ort, 0, 1);
        GridPane.setHalignment(ort, HPos.RIGHT);

        // Ort Input
        TextField tf2 = new TextField();
        GridPane.setConstraints(tf2, 1, 1);
        GridPane.setHgrow(tf2, Priority.ALWAYS);
        
        // Aufnahmejahr Label
        Label aufnahmejahr = new Label("Aufnahmejahr:");
        GridPane.setConstraints(aufnahmejahr, 0, 2);
        GridPane.setHalignment(aufnahmejahr, HPos.RIGHT);

        // Aufnahmejahr Input
        TextField tf3 = new TextField();
        GridPane.setConstraints(tf3, 1, 2);
        GridPane.setHgrow(tf3, Priority.ALWAYS);
        
        gridpane.getChildren().addAll(titel, tf1, ort, tf2, aufnahmejahr, tf3);
        
        /* 
        gridpane.add(titel, 0, 0);
        gridpane.add(ort, 0, 1);
        gridpane.add(aufnahmejahr, 0, 2);
        GridPane.setHalignment(titel, HPos.RIGHT);
        GridPane.setHalignment(ort, HPos.RIGHT);
        GridPane.setHalignment(aufnahmejahr, HPos.RIGHT);     

        gridpane.add(tf1, 1, 0);
        GridPane.setHgrow(tf1, Priority.ALWAYS);        
        gridpane.add(tf2, 1, 1);
        GridPane.setHgrow(tf2, Priority.ALWAYS);
        gridpane.add(tf3, 1, 2);
        GridPane.setHgrow(tf3, Priority.ALWAYS); */

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

        Scene scene = new Scene(borderpane);
        setScene(scene);
        
        setMaxHeight(230);
        setMinHeight(200);
        setMinWidth(300);
        show();
    }
}
