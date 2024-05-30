/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Vistas;

import ListaMetodo.Lista;
import controller.PANTALLAINICIOController;
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
public class PagarController implements Initializable {
     @FXML
    private Button btnCompra;
     @FXML
    private TextField txtPago;
     @FXML
    private PasswordField txtCuenta;

    

    

    @FXML
    private TextField txtTel;
     @FXML
    private ImageView Volver;
     
      /*Lista estudiantes;*/
    @FXML
    private TextField jtffechaexp;

    @FXML
    private TextField jtfmetodopago;

    @FXML
    private PasswordField jtfnumcuenta;

    @FXML
    private TextField jtftelalt;
    
      
 
    

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
    void actionEvent(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/Finalizar.fxml"));
            Parent root = loader.load();
            
            FinalizarController controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.btnCompra.getScene().getWindow();
            
            myStage.close();
                    controller.initialize(txtPago.getText(),txtCuenta.getText(),txtTel.getText(), stage, this);
                    
        } catch (IOException ex) {
            Logger.getLogger(FinalizarController.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*estudiantes.setAddI(jtfmetodopago, jtftelalt, jtfnumcuenta, jtffechaexp);*/
    }

    
    
    public void CloseWindows(){
        
    }

    
    
}
