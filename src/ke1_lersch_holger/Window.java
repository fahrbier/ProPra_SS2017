/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke1_lersch_holger;

import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.WritableImage;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;

/**
 *
 * @author holger
 * 
 * String fileName       what names will the file get. Can be null
 * Stage  stage          the stage where the file dialog will be shown. Can be null
 * Canvas generatedImage the image which should be saved
 * 
 */
public abstract class Window {
    
    private File fileToSave;
    
    public void saveToFile(String fileName, Stage stage, Canvas generatedImage) throws Exception {
        
        //-- if no filename and no stage, throw exception - we need a stage to show the file dialog
        if (fileName == null && stage == null) {
            throw new Exception("Stage and Name cannot be null.");
        }
        
        
        //-- if no file name was provided, show the dialog
        if (fileName == null) {
            FileChooser fileChooser = new FileChooser();
  
            //Set extension filter
            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.png");
            fileChooser.getExtensionFilters().add(extFilter);
              
            //Show save file dialog
            fileToSave = fileChooser.showSaveDialog(stage);    
        }
        
        System.out.println("Writing file " + fileToSave.getName() + " to file.");
        
        try {
            Double h = generatedImage.getHeight();
            Double w = generatedImage.getWidth();
            
            WritableImage writableImage = new WritableImage(w.intValue(), h.intValue());
            generatedImage.snapshot(null, writableImage);
            RenderedImage renderedImage = SwingFXUtils.fromFXImage(writableImage, null);
            ImageIO.write(renderedImage, "png", fileToSave);
        } catch (IOException ex) {
            
        }        

}
}
