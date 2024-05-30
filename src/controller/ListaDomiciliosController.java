/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import Vistas.PaginaprincipalController;
import Vistas.Paginaprincipal_1Controller;
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
public class ListaDomiciliosController implements Initializable {
      @FXML
    private ImageView Volver;
      @FXML
    private ImageView Domicilio1;

    @FXML
    private ImageView Domicilio2;

    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    void domicilio1(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/Paginaprincipal.fxml"));
            Parent root = loader.load();
            
            PaginaprincipalController controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            
            stage.show();
            
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.Volver.getScene().getWindow();
            
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(PaginaprincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    void domicilio2(MouseEvent event) {
            try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/Paginaprincipal_1.fxml"));
            Parent root = loader.load();
            
            Paginaprincipal_1Controller controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            
            stage.show();
            
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.Volver.getScene().getWindow();
            
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(Paginaprincipal_1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
    void Inicio(MouseEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewInicio/Usuario.fxml"));
            Parent root = loader.load();
            
            UsuarioController controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            
            stage.show();
            
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.Volver.getScene().getWindow();
            
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
                

    }
    public void CloseWindows(){
        
    }
}
