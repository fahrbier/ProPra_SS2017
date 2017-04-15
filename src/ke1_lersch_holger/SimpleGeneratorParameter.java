/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke1_lersch_holger;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author holger
 */
public class SimpleGeneratorParameter {

    private SimpleGeneratorParameterController simpleGeneratorParameter;
    private Stage generatorStage;
    
    private static final SimpleGeneratorParameter instance = new SimpleGeneratorParameter();
    
    private SimpleGeneratorParameter() {}
    
    public static SimpleGeneratorParameter getInstance(){
        System.out.println("getInstance: " + instance.toString());
        return instance;
    }
    
    public void show(MainUiController mainUiController) {
    
        if (generatorStage == null) {
            try{
                FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(
                        "simpleGeneratorParameter.fxml"
                    )    
                );
                Scene parameterScene = new Scene(loader.load());

                generatorStage = new Stage();
                generatorStage.setTitle("Simple Generator");
                generatorStage.setScene(parameterScene);  

                //-- after the popup was created, we call an init method in its controller to handover 
                //-- the MainUiController (this) to it to be able to exchange data between the two objects
                simpleGeneratorParameter = loader.<SimpleGeneratorParameterController>getController();
                simpleGeneratorParameter.setMainUiController(mainUiController);
                
            }
            catch (IOException e) {
            }
        }
     
        generatorStage.show();
        generatorStage.toFront();

    
    
    }    
}
