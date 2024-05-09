/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Miguel Angel
 */
public class PANTALLAINICIOController implements Initializable {
    
    private ViewLoginController controllerViewLogin;
    private Stage stage;
    @FXML
    private Button btnCompra;
     @FXML
    private Label lblUser;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     @FXML
    void ShowCompra(ActionEvent event) {
      try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewInicio/Compra.fxml"));
            Parent root = loader.load();
            
            CompraController controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            
            stage.show();
            
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.btnCompra.getScene().getWindow();
            
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(CompraController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    void initialize(String text, Stage stage, ViewLoginController aThis) {
       lblUser.setText(text);
       this.controllerViewLogin = aThis;
        this.stage = stage;
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void CloseWindows(){
        
    }
}
