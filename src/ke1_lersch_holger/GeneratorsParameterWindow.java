/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke1_lersch_holger;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author holger
 */
public class GeneratorsParameterWindow {
    
    /* 
    I chose a static function to have only one parameter window open. If during this project a 
    requirement comes up to open more windows at a time, this thing needs to be refactored to 
    add some reusability and probably not using a static function anymore - but for now it should
    do its job.
    */
    
    public static void display(){
        
        Stage window = new Stage();
        
        //-- prepare the window and set message in status bar
        window.setTitle("Simple Generator Parameter");
        window.setWidth(300);
        window.setHeight(200);
        
        KE1_Lersch_Holger.setStatus("ready");
        
        //-- Parameter Height 
        Label heightLabel = new Label("Enter height:");
        TextField heightInput = new TextField();
        
        //-- Parameter Width
        Label widthLabel = new Label("Enter width:");
        TextField widthInput = new TextField();
        
        //-- Generate Button
        Button generateButton = new Button("Generate");
        generateButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                KE1_Lersch_Holger.setStatus("calculating");  
                //-- implement validate input, create canvas, draw cirlce
                //-- todo
                
                window.close();
            }

        });
        
        //-- create layout and plug all elements into it
        VBox layout = new VBox(15);
        layout.setAlignment(Pos.CENTER);
        
        layout.getChildren().addAll(heightLabel, heightInput, widthLabel,widthInput, generateButton);
        
        Scene sceneSimpleGeneratorsParameter = new Scene(layout);
        
        window.setScene(sceneSimpleGeneratorsParameter);
        window.show();
           
    }
}
