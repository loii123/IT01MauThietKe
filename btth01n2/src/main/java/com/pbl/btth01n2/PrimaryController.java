package com.pbl.btth01n2;

import com.pbl.utils.MyAlert;
import com.pbl.utils.themes.ThemeTypes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;


public class PrimaryController implements Initializable{ 
    @FXML private ComboBox<ThemeTypes> cbThemes;
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
       this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
    
    
    
    public void manageQuestions(ActionEvent e){
        MyAlert.getInstance().showAlert("Comming soon...");
    }
    
    
    public void practice(ActionEvent e){
         MyAlert.getInstance().showAlert("Comming soon...");
    }
    
    
    public void exam(ActionEvent e){
         MyAlert.getInstance().showAlert("Comming soon...");
    }

   

    

    
    
    
}
