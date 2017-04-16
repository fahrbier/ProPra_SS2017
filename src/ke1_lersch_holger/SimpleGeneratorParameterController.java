/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke1_lersch_holger;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



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
    private Label widthError;
    
    @FXML 
    private TextField height;

    @FXML 
    private Label heightError;    
    
    @FXML
    private Button onGenerate;
    
    /*
    * Event Handler / Actions of this Controller
    *
    */
    
    public void onGenerate(){

        boolean inputOk = true;

        //-- validate input parameters, has to be positive numbers
        String inputHeight = this.height.getText();
        if (!inputHeight.matches("\\d+")) { //--one or more digits, no sign (neither + nor -)
            heightError.setText("only positive Integer values");  
            inputOk = false;
        } 
        
        String inputWidth = this.width.getText();
        if (!inputWidth.matches("\\d+")) { //--one or more digits, no sign (neither + nor -)
            widthError.setText("only positive Integer values");  
            inputOk = false;
        } 
        
       
        if (inputOk) {
            
            this.mainUiController.setHeight(Integer.parseInt(this.height.getText()));
            this.mainUiController.setWidth(Integer.parseInt(this.width.getText()));
            int diameter = (this.mainUiController.getWidth()<this.mainUiController.getHeight())? this.mainUiController.getWidth() : this.mainUiController.getHeight(); 

            //-- resize canvas
            this.mainUiController.getGeneratedImage().setHeight(diameter);
            this.mainUiController.getGeneratedImage().setWidth(diameter);


            //-- manipulate graphicscontext
            this.mainUiController.getGraphicsContext().setFill(Color.BLUE);        
            this.mainUiController.getGraphicsContext().fillOval(0, 0, diameter, diameter);    

            mainUiController.setStatusText("calculating");

            //-- after button click, close the window in which it sits.
            Stage stage = (Stage) onGenerate.getScene().getWindow();
            stage.close();
        }    
        
    }
    
 
}