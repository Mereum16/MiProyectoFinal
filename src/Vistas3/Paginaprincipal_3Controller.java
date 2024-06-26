/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Vistas3;

import static Vistas.PaginaprincipalController.Productos;
import static Vistas.PaginaprincipalController.pilaP;
import Vistas2.Paginaprincipal_2Controller;
import Vistas2.RegistrarDatos_2Controller;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
public class Paginaprincipal_3Controller implements Initializable {
    
    static public objSTACK pilaP = new objSTACK();
    RegistrarDatos_3Controller registro = new RegistrarDatos_3Controller();

    @FXML
    private TableView<datos> tbList;
    @FXML
    private TableColumn<datos, String> Nom;
    @FXML
    private TableColumn<datos, String> Apell;
    @FXML
    private TableColumn<datos, String> Departamento;
    @FXML
    private TableColumn<datos, String> Direccion;
    @FXML
    private TableColumn<datos, String> Telefono;
    @FXML
    private TextField txtFecha;
    @FXML
    private Button btnRegistrar;
    @FXML
    private Button btnPagar;
    @FXML
    private Button btnVolver;
    
     public static ObservableList<datos> Productos = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         Vistas3.RegistrarDatos_3Controller.pila = pilaP;
       /* dia = controller.registro.RegistrarprodController.dia;
        mes = controller.registro.RegistrarprodController.mes;
        año = controller.registro.RegistrarprodController.año;
        fecha = String.valueOf(dia) + "/" + String.valueOf(mes+1) + "/" + String.valueOf(año);
        txtFecha.setText(fecha);*/
        Nom.setCellValueFactory(new PropertyValueFactory<datos, String>("Nom"));
        Apell.setCellValueFactory(new PropertyValueFactory<datos, String>("Apell"));
        Departamento.setCellValueFactory(new PropertyValueFactory<datos, String>("Departamento"));
        Direccion.setCellValueFactory(new PropertyValueFactory<datos, String>("Direccion"));
        Telefono.setCellValueFactory(new PropertyValueFactory<datos, String>("Telefono"));
        
        tbList.setItems(Productos);
    }    

    @FXML
    private void actionEvent(ActionEvent e) {
         Object evt = e.getSource();
        
        if(evt.equals(btnRegistrar)){
            loadStage("/Vistas3/RegistrarDatos_3.fxml", e);
        }
        if(evt.equals(btnPagar)){
            loadStage("/Vistas3/Pagar_3.fxml", e);
        }
        if(evt.equals(btnVolver)){
            loadStage("/ViewInicio/PANTALLAINICIO.fxml", e);
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
            Logger.getLogger(Paginaprincipal_3Controller.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
        public void CloseWindows(){
            
        }
}
