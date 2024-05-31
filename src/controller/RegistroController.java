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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import lista.cuentas;
import lista.User;


/**
 * FXML Controller class
 *
 * @author Miguel Angel
 */
public class RegistroController implements Initializable {
    
    private cuentas model = new cuentas();

     @FXML
    private TextField contra;

    @FXML
    private TextField txtUser;

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
    private void ShowLogin(ActionEvent e) {
        /*Object evt = e.getSource();
        
        if(evt.equals(btnCrearCuenta)){
            String nombre = txtUser.getText();
            String contraseña = contra.getText();
            model.crearCuenta(nombre, contraseña);
            txtUser.setText("");
            contra.setText("");
            /*loadStage("/ViewInicio/MiLOGIN.fxml", e);
        }   */
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
            Logger.getLogger(RegistroController.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
    
    public void CloseWindows(){
        
    }
}
