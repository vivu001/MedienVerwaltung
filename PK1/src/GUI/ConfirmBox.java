/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Vu Viet Duc
 */
public class ConfirmBox {
    public static void display(){
        Stage nebenFenster = new Stage();
        
        nebenFenster.initModality(Modality.APPLICATION_MODAL);
        
        Pane pane = new Pane();
        
        Scene scene = new Scene(pane);
	nebenFenster.setScene(scene);
	nebenFenster.setTitle("BildErfassungView");
	nebenFenster.show();
    }
}
