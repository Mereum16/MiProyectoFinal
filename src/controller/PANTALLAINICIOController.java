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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import principal.LoginController;

/**
 * FXML Controller class
 *
 * @author Miguel Angel
 */
public class PANTALLAINICIOController implements Initializable {
    
    private LoginController controllerLogin;
    private Stage stage;
    @FXML
    private ImageView Lupa;
    @FXML
    private ImageView Producto;
     @FXML
    private ImageView Producto2;
     @FXML
    private ImageView Producto3;
     @FXML
    private ImageView Producto4;
     @FXML
    private ImageView Usuario;
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
    void Buscar2(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewInicio/Usuario.fxml"));
            Parent root = loader.load();
            
            UsuarioController controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            
            stage.show();
            
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.Producto4.getScene().getWindow();
            
            myStage.close();
                   
        } catch (IOException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    @FXML
    void Compra4(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewInicio/Compra4.fxml"));
            Parent root = loader.load();
            
            Compra4Controller controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            
            stage.show();
            
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.Producto4.getScene().getWindow();
            
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(Compra3Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    @FXML
    void Compra3(MouseEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewInicio/Compra3.fxml"));
            Parent root = loader.load();
            
            Compra3Controller controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            
            stage.show();
            
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.Producto3.getScene().getWindow();
            
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(Compra3Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    @FXML
    void Compra2(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewInicio/Compra2.fxml"));
            Parent root = loader.load();
            
            Compra2Controller controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            
            stage.show();
            
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.Producto.getScene().getWindow();
            
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(Compra2Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    @FXML
    void Compra(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewInicio/Compra.fxml"));
            Parent root = loader.load();
            
            CompraController controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            
            stage.show();
            
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.Producto.getScene().getWindow();
            
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(CompraController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    @FXML
    void Buscar(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewInicio/Busqueda.fxml"));
            Parent root = loader.load();
            
            BusquedaController controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            
            stage.show();
            
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.Producto.getScene().getWindow();
            
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(BusquedaController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
    
    

    void initialize(String text, Stage stage, LoginController aThis) {
       lblUser.setText(text);
       this.controllerLogin = aThis;
        this.stage = stage;
        
        
        
        /*throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody*/
    }
    public void CloseWindows(){
        
    }
}
