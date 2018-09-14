package GUI;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HauptMenu extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane bp = new BorderPane();
        Scene scene = new Scene(bp, 400, 250);

        // Menubar
        MenuBar menuBar = new MenuBar();
        bp.setTop(menuBar);

        // Datei Menu 
        Menu dateiMenu = new Menu("Datei");
        MenuItem laden_MenuItem = new MenuItem("Laden");
        MenuItem speichern_MenuItem = new MenuItem("Speichern");
        MenuItem medienliste_in_DateiMenuItem = new MenuItem("Medienliste in Datei");
        MenuItem beenden_MenuItem = new MenuItem("Beenden");
        beenden_MenuItem.setOnAction(e -> Platform.exit());

        dateiMenu.getItems().addAll(laden_MenuItem, speichern_MenuItem, 
                    new SeparatorMenuItem(), medienliste_in_DateiMenuItem, 
                    new SeparatorMenuItem(), beenden_MenuItem);

        // Medium Menu
        Menu mediumMenu = new Menu("Medium");
        MenuItem audio_MenuItem = new MenuItem("Audio neu");
        MenuItem bild_MenuItem = new MenuItem("Bild neu");
        
        audio_MenuItem.setOnAction(e -> {
            AudioErfassungView aev = new AudioErfassungView(null, primaryStage);
            aev.showView();
        });

        bild_MenuItem.setOnAction(e -> {
            BildErfassungView bev = new BildErfassungView(null, primaryStage);
            bev.showView();
        });

        mediumMenu.getItems().addAll(audio_MenuItem, bild_MenuItem);

        // Anzeige Menu
        Menu anzeigeMenu = new Menu("Anzeige");
        MenuItem erscheinungsjahr_MenuItem = new MenuItem("Erscheinungsjahr");
        MenuItem neuestes_Medium_MenuItem = new MenuItem("Neuestes Medium");

        anzeigeMenu.getItems().addAll(erscheinungsjahr_MenuItem, neuestes_Medium_MenuItem);
        
        // Menubar get Item
        menuBar.getMenus().addAll(dateiMenu, mediumMenu, anzeigeMenu);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Medienverwaltung");
        primaryStage.show();
    }
}
