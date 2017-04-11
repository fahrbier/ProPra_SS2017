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
        //-- connect other windows (hence controller) to the main one to exchange data
        //-- tightly coupled, though. We could look into a different pattern later like
        //-- event bus or something like that.
        
        simpleGeneratorParameter.init(this);
    }
    
    
    
    public void onSimpleGenerator() {
        try{
            
            Scene parameterScene = new Scene(FXMLLoader.load(getClass().getResource("simpleGeneratorParameter.fxml")));
            
            Stage stage = new Stage();
            stage.setTitle("Simple Generator");
            stage.setScene(parameterScene);  
            stage.show();
        }
        catch (IOException e) {
        }
    }
    
    public void setStatusText(String text) {
        statusText.setText(text);
    }
   
    
}