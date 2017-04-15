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
    
    private MainUiController mainUiController;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

            FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                    "mainUi.fxml"
                )    
            );
            Scene mainScene = new Scene(loader.load());
            
            Stage mainUiStage = new Stage();
            mainUiStage.setTitle("Simple Generator");
            mainUiStage.setScene(mainScene);  
            
            //-- we need the state in the controller later to open the file dialog. 
            mainUiController = loader.<MainUiController>getController();
            mainUiController.setMainUiStage(stage);
            mainUiStage.show();        
        
        
    }
    
    
}
