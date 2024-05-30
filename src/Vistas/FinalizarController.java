/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Vistas;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Miguel Angel
 */
public class FinalizarController implements Initializable {
     @FXML
    private Label lblPago;
    @FXML
    private Label lblCuenta;
    @FXML
    private Label lblTel;
    private Stage stage;
    private PagarController controllerPagar;
    @FXML
    private Button btnFin;



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    void initialize(String text,String text2,String text3, Stage stage, PagarController aThis) {
        lblPago.setText(text);
        lblCuenta.setText(text2);
        lblTel.setText(text3);
       this.controllerPagar = aThis;
        this.stage = stage;
    }
     @FXML
    void actionEvent(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewInicio/PANTALLAINICIO.fxml"));
            Parent root = loader.load();
            
            PANTALLAINICIOController controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            
            stage.show();
            
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.btnFin.getScene().getWindow();
            
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(PANTALLAINICIOController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void CloseWindows(){
        
    }
}
