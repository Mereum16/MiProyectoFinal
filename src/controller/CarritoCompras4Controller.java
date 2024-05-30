/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import Vistas2.RegistrarDatos_2Controller;
import Vistas3.RegistrarDatos_3Controller;
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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Miguel Angel
 */
public class CarritoCompras4Controller implements Initializable {
    @FXML
     private ImageView Volver;
    @FXML
    private Button btnComprar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    void Inicio(MouseEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewInicio/Carrito4.fxml"));
            Parent root = loader.load();
            
            Carrito4Controller controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            
            stage.show();
            
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.Volver.getScene().getWindow();
            
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(Carrito4Controller.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    @FXML
    void ShowCompra(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas3/RegistrarDatos_3.fxml"));
            Parent root = loader.load();
            
            RegistrarDatos_3Controller controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            
            stage.show();
            
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.btnComprar.getScene().getWindow();
            
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(RegistrarDatos_3Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void CloseWindows(){
        
    }
}
