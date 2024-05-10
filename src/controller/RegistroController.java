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
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Miguel Angel
 */
public class RegistroController implements Initializable {

    
    @FXML
    private Button btnCrearCuenta;
    
    @FXML
    private Text Sesion;
    @FXML
    private ImageView Volver;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     @FXML
    void IniciaSesion(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewInicio/MiLOGIN.fxml"));
            Parent root = loader.load();
            
            ViewLoginController controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.Sesion.getScene().getWindow();
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(ViweINICOController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    @FXML
    private void ShowLogin(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewInicio/MiLOGIN.fxml"));
            Parent root = loader.load();
            
            ViewLoginController controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.btnCrearCuenta.getScene().getWindow();
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(ViweINICOController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void Volver(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewInicio/MiLOGIN.fxml"));
            Parent root = loader.load();
            
            ViewLoginController controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.Volver.getScene().getWindow();
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(ViweINICOController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
   
    public void CloseWindows(){
        
    }
}
