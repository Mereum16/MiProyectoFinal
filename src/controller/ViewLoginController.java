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
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import javax.swing.JOptionPane;
import lista.User;
import lista.cuentas;
/**
 * FXML Controller class
 *
 * @author Miguel Angel
 */
public class ViewLoginController implements Initializable {
    
    
    public static User usuario;
    private cuentas model = new cuentas();

    @FXML
    private TextField txtUser;
   
    @FXML
    private Button btnLogin;
    @FXML
    private PasswordField contra;

    
    @FXML
    private Text Register;



    @FXML
    private void eventKey(KeyEvent event) {
    }

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    void Registro(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewInicio/Registro.fxml"));
            Parent root = loader.load();
            
            RegistroController controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            
            stage.show();
            
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.Register.getScene().getWindow();
            
            myStage.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(RegistroController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     @FXML
    private void ShowInicio(ActionEvent e) {
        /*try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewInicio/PANTALLAINICIO.fxml"));
            Parent root = loader.load();
            
            PANTALLAINICIOController controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            stage.setOnCloseRequest(e -> controller.CloseWindows());
            
            Stage myStage = (Stage) this.btnLogin.getScene().getWindow();
            
            myStage.close();
                    controller.initialize(txtUser.getText(), stage, this);
        } catch (IOException ex) {
            Logger.getLogger(PANTALLAINICIOController.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        /*Object evt = e.getSource();
        
        if(evt.equals(btnLogin)){
            String nombre = txtUser.getText();
            String contraseña = contra.getText();
            usuario = model.BuscarCuenta(nombre, contraseña);
            if(usuario == null){
                JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos");
            }else{
                loadStage("/ViewInicio/PANTALLAINICIO.fxml", e);
            }
        }   */
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
        }catch ( IOException ex){
            Logger.getLogger(ViewLoginController.class.getName()).log(Level.SEVERE,null, ex);
        }
     }
        
    public void CloseWindows(){
        
    }
}
