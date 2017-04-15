/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke1_lersch_holger;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.stage.Stage;



/**
 * FXML Controller class
 *
 * @author holger lersch
 */
public class MainUiController extends Window  {
    
    private Stage mainUiStage;
    public Stage getMainUiStage() {
        return mainUiStage;
    }    
    public void setMainUiStage(Stage stage) {
        this.mainUiStage = stage;
    }
    
    @FXML
    private SimpleGeneratorParameterController simpleGeneratorParameter;
    
    @FXML
    private  Label statusText;
    public Label getStatusText() {
        return statusText;
    }
    public void setStatusText(Label statusText) {
        this.statusText = statusText;
    }
    //-- for convenience add overwritten setter which expects a simple String
    public void setStatusText(String text) {
        statusText.setText(text);
    }   
    
    
    @FXML 
    private Canvas generatedImage;
    public Canvas getGeneratedImage(){
        return this.generatedImage;
    }
    public void setGeneratedImage(Canvas image){
        this.generatedImage = image;
    }
    
  
    private int height;
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    
    private int width;
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    
    private GraphicsContext graficsContext;
    public GraphicsContext getGraphicsContext() {
        return this.graficsContext;
    }
    public void setGraphicsContext (GraphicsContext gc){
        this.graficsContext = gc;
    }

    /*
    * Event Handler / Actions of this Controller
    *
    */
 
    
    public void onQuit(){
        System.exit(0);
    }
  
    
    public void onSaveImage() {
        
        this.saveToFile(null, mainUiStage);
    }
    
    
    public void onSimpleGenerator() {
        SimpleGeneratorParameter simpleGenerator = SimpleGeneratorParameter.getInstance();
        simpleGenerator.show(this);
    }
    

    

    
    
    public void initialize(){
        System.out.println("App started.");
    }

    
}