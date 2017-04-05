/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke1_lersch_holger;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author holger
 */
public class KE1_Lersch_Holger extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();
        
        //- preparing main navi
        MenuBar mainMenuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        fileMenu.getItems().add(new MenuItem("Save Image"));
        
        //-- create Item "Quit" and add functionality
        MenuItem quitItem = new MenuItem("Quit");
        quitItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }

        });
        fileMenu.getItems().add(quitItem);
        mainMenuBar.getMenus().add(fileMenu);

        
        Menu generatorsMenu = new Menu("Generators");
        generatorsMenu.getItems().add(new MenuItem("Simple Generator"));
        mainMenuBar.getMenus().add(generatorsMenu);
    
        root.setTop(mainMenuBar);
        
        //- preparing statusbar
        Label statusBar = new Label();
        statusBar.setText("TestText");
        root.setBottom(statusBar); 
        
        //-- create a scene and put the root into place  
        Scene scene = new Scene(root, 800, 600);
        
        primaryStage.setTitle("KE1_Lersch_Holger");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
