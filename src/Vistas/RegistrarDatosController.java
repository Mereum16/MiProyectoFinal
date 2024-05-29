/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Vistas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import model.datos;
import model.objSTACK;

/**
 * FXML Controller class
 *
 * @author Miguel Angel
 */
public class RegistrarDatosController implements Initializable {
    
     public static objSTACK pila = new objSTACK();

    @FXML
    private TextField txtApell;
    @FXML
    private TextField txtNom;
    @FXML
    private TextField txtDepartamento;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtDireccion;
    @FXML
    private Button btnRegistrar;
    @FXML
    private Button btnBack;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void keyEvent(KeyEvent e) {
         Object evt = e.getSource();
        
        if(evt.equals(txtNom) || evt.equals(txtTelefono)){
            if (!Character.isDigit(e.getCharacter().charAt(0))){
                e.consume();
            }
        }else if (evt.equals(txtApell)){
            if (!Character.isLetter(e.getCharacter().charAt(0))){
                e.consume();
            }
        }
    }

    @FXML
    private void actionEvent(ActionEvent e) {
        Object evt = e.getSource();
        
        if(evt.equals(btnRegistrar)){
            String nom = txtNom.getText();
            String apell = txtApell.getText();
            String direccion = txtDireccion.getText();
            String departamento = txtDepartamento.getText();
            String telefono = txtTelefono.getText();
            
            datos prod = new datos(nom, apell, telefono, direccion, departamento);
            pila.setPushProducto(prod);
            loadStage("/Vistas/PaginaPrincipal.fxml", e);
            
        
       }
        if(evt.equals(btnBack)){
            loadStage("/ViewInicio/CarritoCompras.fxml", e);
        }
    }
    
    private void loadStage(String url, Event event){
        
        try {
            Object eventSource = event.getSource();
            Node sourceAsNode = (Node) eventSource;
            Scene oldScene = sourceAsNode.getScene();
            Window window = oldScene.getWindow();
            Stage stage = (Stage) window;
            stage.hide();
            
            Parent root = FXMLLoader.load(getClass().getResource(url));
            Scene scene = new Scene(root);
            Stage newStage = new Stage();
            newStage.setScene(scene);
            newStage.show();
            
            newStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    Platform.exit();
                }
            });
        } catch (IOException ex) {
            Logger.getLogger(PaginaprincipalController.class.getName()).log(Level.SEVERE,null, ex);
        }
        
    }
    
    public void CloseWindows(){
        
    }
}
