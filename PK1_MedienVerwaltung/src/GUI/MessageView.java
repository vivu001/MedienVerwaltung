package GUI;

import GUI.ModalStage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


/**
 * Die Klasse bietet einen modalen Hinweisdialog, der blockiert.
 * Die Klasse dient als einfacher Ersatz der Swing-Methode
 * <code>JOptionPane.showMessageDialog</code>.
 * Es wird ein Hinweistext in einem Fenster angezeigt.
 * Der Dialog kann mit dem Button "OK" beendet werden.
 * <p>
 * Um eine kompakte Schreibweise zu erzwingen, kann nur mit der Methode <code>create</code> eine neue
 * Instanz erzeugt werden.
 * </p>
 * <p>
 * Der Aufruf der Methode <code>showView</code> zeigt das Hinweisfenster an.
 * Die Verwendung erfolgt nach dem folgenden Muster.
 * </p>
 * <p>
 * <code>
 *  MessageView.create(mainview, "Fehlermeldung", "Datei nicht gefunden").showView();
 * </code>
 * </p>
 * @author dwiesmann
 */
public class MessageView extends ModalStage{
    
    private final String titel;
    private final String nachricht;
    private final TextField tf_input;
    
    /**
    * Der Konstruktor ist privat. Der Nutzer kann mit der Methode </code>create</code> eine neue Instanz anfordern.
    * 
    * @param primaryStage Hauptfenster. Die <code>MessageView</code> ist modal zu diesem Hauptfenster
    * @param titel Ueberschrift, in der Titelzeile des Fensters
    * @param nachricht Text, der im Fenster angezeigt wird
    */
    private MessageView(Stage primaryStage, String titel, String nachricht) {
        
        super(primaryStage);
        this.titel = titel;
        this.nachricht = nachricht;
        tf_input = new TextField();
    }
    
    /**
    * Der Nutzer kann mit der Methode <code>create</code> eine neue Instanz anfordern.
    * 
    * @param primaryStage Hauptfenster. Die <code>MessageView</code> ist modal zu diesem Hauptfenster
    * @param titel Ueberschrift, in der Titelzeile des Fensters
    * @param nachricht Text, der im Fenster angezeigt wird
    * 
    * @return Neue Instanz der Klasse <code>MessageView</code>
    */
    public static MessageView create(Stage primaryStage, String titel, String nachricht){
        return new MessageView(primaryStage, titel, nachricht);
    }
    
    /**
     * Zeigt das Hinweisfenster an. Die Methode blockiert, bis der Anwender den Dialog beendet.
     */
    public void showView()  {
        setTitle(titel);
        BorderPane bp = new BorderPane();
        
        HBox hb = new HBox();
        hb.setPadding(new Insets(20.0, 5.0, 20.0, 5.0));
        hb.setAlignment(Pos.CENTER);
        Label label = new Label(nachricht);
        hb.getChildren().add(label);

        FlowPane fp = new FlowPane();
        fp.setAlignment(Pos.CENTER);
        fp.setPadding(new Insets(20.0));
        fp.setHgap(20.0);
        Button ok = new Button("OK");
        
        ok.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                close();
            }
            
        });
       
        fp.getChildren().add(ok);

        bp.setCenter(hb);
        bp.setBottom(fp);

        Scene scene = new Scene(bp);
        setScene(scene);

        showAndWait();
        
    }
    
    
}