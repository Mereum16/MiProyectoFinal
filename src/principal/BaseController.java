/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package principal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class BaseController implements Initializable {
    
    @FXML
    private Button login, registro;
    
    @FXML
    private StackPane panel;
    
    private VBox loguearse, registrarse;
    
    @FXML
    private void actionEvent(ActionEvent e){
        
        Object evt = e.getSource();
        
        if(evt.equals(login)){
            loguearse.setVisible(true);
            registrarse.setVisible(false);
        }else if(evt.equals(registro)){
            loguearse.setVisible(false);
            registrarse.setVisible(true);
        }
        
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            loguearse = LoadForm("/principal/login.fxml");
            registrarse = LoadForm("/principal/registro.fxml");
            panel.getChildren().addAll(loguearse, registrarse);
            
            loguearse.setVisible(true);
            registrarse.setVisible(false);
            
        } catch (IOException ex) {
            Logger.getLogger(BaseController.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO
    }    
    private VBox LoadForm(String url) throws IOException{
        return (VBox)FXMLLoader.load(getClass().getResource(url));
    } 

    public void CloseWindows() {
    }
}
