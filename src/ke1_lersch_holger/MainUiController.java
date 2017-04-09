/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke1_lersch_holger;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;



/**
 * FXML Controller class
 *
 * @author holger lersch
 */
public class MainUiController  {
    
    @FXML
    private Label statusText;
    
    public void onQuit(){
        System.exit(0);
    }
    
    public void onSimpleGenerator() {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("simpleGeneratorParameter.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("ABC");
            stage.setScene(new Scene(root1));  
            stage.show();
        }
        catch (IOException e) {
        }
    }
    
    public void setStatusText(String text) {
        statusText.setText(text);
    }
   
    
}