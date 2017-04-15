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
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.stage.Stage;



/**
 * FXML Controller class
 *
 * @author holger lersch
 */
public class MainUiController extends Window  {
    
    private Stage mainUiStage;
    
    @FXML
    private SimpleGeneratorParameterController simpleGeneratorParameter;
    
    @FXML
    private  Label statusText;
    
    @FXML 
    private Canvas generatedImage;
    
    public void onQuit(){
        System.exit(0);
    }
    
    @FXML
    public void initialize(){
        System.out.println("App started.");
    }
    
    public void onSaveImage() {
        
        this.saveToFile(null, mainUiStage);
    }
    
    
    public void onSimpleGenerator() {
        SimpleGeneratorParameter simpleGenerator = SimpleGeneratorParameter.getInstance();
        simpleGenerator.show(this);
    }
    
    public void setStatusText(String text) {
        statusText.setText(text);
    }
    
    public Canvas getGeneratedImage(){
        return this.generatedImage;
    }

    public void setGeneratedImage(Canvas image){
        this.generatedImage = image;
    }
    
    public void setMainUiStage(Stage stage) {
        this.mainUiStage = stage;
    }
    
}