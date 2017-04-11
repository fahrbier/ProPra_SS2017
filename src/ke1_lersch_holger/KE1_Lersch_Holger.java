/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke1_lersch_holger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author holger
 */
public class KE1_Lersch_Holger extends Application {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene mainScene = new Scene(FXMLLoader.load(getClass().getResource("mainUi.fxml")));
        stage.setScene(mainScene);
        stage.show();
    }
    
    
}
