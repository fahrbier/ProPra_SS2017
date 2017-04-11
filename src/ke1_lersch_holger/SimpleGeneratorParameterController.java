/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke1_lersch_holger;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.TextField;



/**
 * FXML Controller class
 *
 * @author holger
 */
public class SimpleGeneratorParameterController {

    private MainUiController mainUi;
    
    @FXML
    private TextField width;
    
    @FXML 
    private TextField height;
    
    public void onGenerate(){

        mainUi.setStatusText("calculating");
    }
    
    public void init(MainUiController mainUi) {
        this.mainUi = mainUi;
    }
    
}
