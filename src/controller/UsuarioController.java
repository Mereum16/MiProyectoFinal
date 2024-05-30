/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import Vistas.PaginaprincipalController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Miguel Angel
 */
public class UsuarioController implements Initializable {
    @FXML
    private ImageView Volver;
    @FXML
    private ImageView Acceder;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     @FXML
    void Domicilios(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewInicio/ListaDomicilios.fxml"));
            Parent root = loader.load();
            
            ListaDomiciliosController controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            
            stage.show();
            
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.Acceder.getScene().getWindow();
            
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(ListaDomiciliosController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    @FXML
    void Inicio(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewInicio/PANTALLAINICIO.fxml"));
            Parent root = loader.load();
            
            PANTALLAINICIOController controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            
            stage.show();
            
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.Volver.getScene().getWindow();
            
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(PANTALLAINICIOController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void CloseWindows(){
        
    }
}
