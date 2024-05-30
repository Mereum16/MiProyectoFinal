/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Vistas2;

import Vistas.Finalizar_1Controller;
import Vistas.PaginaprincipalController;
import Vistas.Paginaprincipal_1Controller;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Miguel Angel
 */
public class Pagar_2Controller implements Initializable {

    @FXML
    private TextField txtPago;
    @FXML
    private Button btnCompra;
    @FXML
    private TextField txtTel;
    @FXML
    private PasswordField txtCuenta;
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
    private void actionEvent(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas2/Finalizar_2.fxml"));
            Parent root = loader.load();
            
            Finalizar_2Controller controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.btnCompra.getScene().getWindow();
            
            myStage.close();
                    controller.initialize(txtPago.getText(),txtCuenta.getText(),txtTel.getText(), stage, this);
                    
        } catch (IOException ex) {
            Logger.getLogger(Finalizar_2Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void Inicio(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas2/Paginaprincipal_2.fxml"));
            Parent root = loader.load();
            
            Paginaprincipal_2Controller controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.Volver.getScene().getWindow();
            
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(Paginaprincipal_2Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
