/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke1_lersch_holger;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;



/**
 * FXML Controller class
 *
 * @author holger
 */
public class SimpleGeneratorParameterController extends Window {

    private MainUiController mainUiController;
    public void setMainUiController(MainUiController mainUiController) {
        this.mainUiController = mainUiController;
    }


    
    @FXML
    private TextField width;
    
    @FXML 
    private TextField height;
    
    /*
    * Event Handler / Actions of this Controller
    *
    */
    
    public void onGenerate(){

        this.mainUiController.setHeight(Integer.parseInt(this.height.getText()));
        this.mainUiController.setWidth(Integer.parseInt(this.height.getText()));
        int diameter = (this.mainUiController.getWidth()<this.mainUiController.getHeight())? this.mainUiController.getWidth() : this.mainUiController.getHeight(); 
        
        //-- manipulate graphicscontext
        this.mainUiController.getGraphicsContext().setFill(Color.BLUE);        
        this.mainUiController.getGraphicsContext().fillOval(0, 0, diameter, diameter);    
         
        mainUiController.setStatusText("calculating");
    }
    
 
}