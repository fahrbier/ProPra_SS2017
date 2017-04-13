/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke1_lersch_holger;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
    private SimpleGeneratorParameterController simpleGeneratorParameter;
    
    @FXML
    private  Label statusText;
    
    public void onQuit(){
        System.exit(0);
    }
    
    @FXML
    public void initialize(){
        System.out.println("App started.");
    }
    
    
    
    public void onSimpleGenerator() {
        try{
            FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                    "simpleGeneratorParameter.fxml"
                )    
            );
            Scene parameterScene = new Scene(loader.load());
            
            Stage stage = new Stage();
            stage.setTitle("Simple Generator");
            stage.setScene(parameterScene);  
            
            //-- after the popup was created, we call an init method in its controller to handover 
            //-- the MainUiController (this) to it to be able to exchange data between the two objects
            simpleGeneratorParameter = loader.<SimpleGeneratorParameterController>getController();
            simpleGeneratorParameter.init(this);
            stage.show();
        }
        catch (IOException e) {
        }
    }
    
    public void setStatusText(String text) {
        statusText.setText(text);
    }
   
    
}