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
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
/**
 * FXML Controller class
 *
 * @author Miguel Angel
 */
public class ViewLoginController implements Initializable {

    @FXML
    private TextField txtUser;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button btnLogin;

    @FXML
    private void eventKey(KeyEvent event) {
    }

    @FXML
    private void eventAction(ActionEvent event) {
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     @FXML
    private void ShowInicio(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewInicio/PANTALLAINICIO.fxml"));
            Parent root = loader.load();
            
            PANTALLAINICIOController controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.btnLogin.getScene().getWindow();
            
            myStage.close();
                    controller.initialize(txtUser.getText(), stage, this);
        } catch (IOException ex) {
            Logger.getLogger(PANTALLAINICIOController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void CloseWindows(){
        
    }
}
