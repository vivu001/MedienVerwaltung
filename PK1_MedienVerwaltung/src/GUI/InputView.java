package GUI;
import GUI.ModalStage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;


/**
 * Die Klasse bietet einen modalen Eingabedialog, der blockiert.
 * Die Klasse dient als einfacher Ersatz der Swing-Methode
 * <code>JOptionPane.showInputDialog</code>.
 * Es wird ein Textfeld angezeigt, das mit einer Eingabeaufforderung versehen ist.
 * Die Methode <code>showView</code> liefert die Eingabe des Anwenders, 
 * sobald dieser den Dialog beendet. Der Dialog kann mit den beiden Buttons "OK" und
 * "Abbrechen" beendet werden.
 * <p>
 * Um eine kompakte Schreibweise zu erzwingen, kann nur mit der Methode <code>create</code> eine neue
 * Instanz erzeugt werden.
 * </p>
 * <p>
 * Der Aufruf der Methode <code>showView</code> zeigt das Eingabefenster an.
 * Die Verwendung erfolgt nach dem folgenden Muster.
 * </p>
 * <p>
 * <code>
 *  String dateiname = InputView.create(mainview, "Eingabe", "Dateiname", null).showView();
 * </code>
 * </p>
 * @author dwiesmann
 */
public class InputView extends ModalStage{
    
    private final String input;
    private final String titel;
    private final String nachricht;
    private final TextField tf_input;
    
    /**
    * Der Konstruktor ist privat. Der Nutzer kann mit der Methode <code>create</code> eine neue Instanz anfordern.
    * 
    * @param primaryStage Hauptfenster. Die <code>InputView</code> ist modal zu diesem Hauptfenster
    * @param titel Ueberschrift in der Titelzeile des Fensters
    * @param nachricht Eingabaufforderung vor dem Textfeld
    * @param input Initialer Inhalt fuer das Textfeld
    */
    private InputView(Stage primaryStage, String titel, String nachricht, String input) {
   
        super(primaryStage);
        this.input = input;
        this.titel = titel;
        this.nachricht = nachricht;
        tf_input = new TextField();
    }
    
    /**
    * Der Nutzer kann mit der Methode <code>create</code> eine neue Instanz der Klasse <code>InputView</code> anfordern.
    * 
    * @param primaryStage Hauptfenster. Die <code>InputView</code> ist modal zu diesem Hauptfenster
    * @param titel Ueberschrift, in der Titelzeile des Fensters
    * @param nachricht Eingabeaufforderung, vor dem Textfeld
    * @param input Initialer Inhalt fuer das Textfeld
    * @return Neue Instanz der Klasse <code>InputView</code>
    */
    public static InputView create(Stage primaryStage, String titel, String nachricht, String input){
        return new InputView(primaryStage, titel, nachricht, input);
    }
    
    /**
     * Zeigt das Eingabefenster an. Die Methode blockiert, bis der Anwender den Dialog beendet.
     * Falls der Dialog mit dem Button "Abbrechen" beendet wird, dann liefert die Funktion den
     * Rueckgabewert <code>null</code>
     * 
     * @return Inhalt des Eingabefeldes (die Eingabe des Nutzers)
     */
    public String showView(){
        setTitle(titel);
        BorderPane bp = new BorderPane();
        GridPane gp = new GridPane();
        gp.setPadding(new Insets(10.0));
        gp.setHgap(5.0);
        gp.setVgap(10.0);

        if (input != null) {
            update();
        }

        Label inputLabel = new Label(nachricht);
        GridPane.setHalignment(inputLabel, HPos.RIGHT);
        GridPane.setHgrow(tf_input, Priority.ALWAYS);
        gp.addRow(1, inputLabel, tf_input);

        FlowPane fp = new FlowPane();
        fp.setAlignment(Pos.CENTER);
        fp.setPadding(new Insets(20.0));
        fp.setHgap(20.0);
        Button ok = new Button("OK");
        Button abbrechen = new Button("Abbrechen");
        
        ok.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                close();
            }
            
        });
        abbrechen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tf_input.setText(null);
                close();
            }
        });
        fp.getChildren().addAll(ok, abbrechen);

        bp.setCenter(gp);
        bp.setBottom(fp);

        Scene scene = new Scene(bp);
        setScene(scene);

        showAndWait();
        
        return tf_input.getText();
    }
    
    private void update() {
        tf_input.setText(input);
    }
  
    
}
