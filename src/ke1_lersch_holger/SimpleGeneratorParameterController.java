/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke1_lersch_holger;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;



/**
 * FXML Controller class
 *
 * @author holger
 */
public class SimpleGeneratorParameterController extends Window {

    private MainUiController mainUiController;
    
    @FXML
    private TextField width;
    
    @FXML 
    private TextField height;
    
    
    public void onGenerate(){

        /*Canvas image = mainUiController.getGeneratedImage();
        image.setHeight(Double.parseDouble(this.height.getText()));
        image.setWidth(Double.parseDouble(this.width.getText()));
        GraphicsContext gc = image.getGraphicsContext2D();
 
        gc.setFill(Color.BLUE);
        gc.fillRect(75,75,100,100);        
        */
        //-- send a message back to the MainUi and tell the status  
        mainUiController.setStatusText("calculating");
    }
    
    public void setMainUiController(MainUiController mainUiController) {
        this.mainUiController = mainUiController;
    }
    
}
