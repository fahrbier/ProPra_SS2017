/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke1_lersch_holger;

import java.io.File;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author holger
 */
public abstract class Window {
    public void saveToFile(String fileName, Stage stage) {
        
        //-- if no file name was provided, show the dialog
        if (fileName == null) {
            FileChooser fileChooser = new FileChooser();
  
              //Set extension filter
              FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
              fileChooser.getExtensionFilters().add(extFilter);
              
              //Show save file dialog
              File file = fileChooser.showSaveDialog(stage);    
        }
        
        
        System.out.println("Writing file " + fileName + " to file.");
        
        
        
    }
}
