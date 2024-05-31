/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model2;

import model.*;
import Vistas.Paginaprincipal_1Controller;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel zarza
 */
public class objSTACK {
    private Stack<datos2> pila;
    public static datos2 aux = null;
    public objSTACK() {
        this.pila = new Stack<>();
    }
    
    public void setPushProducto (datos2 p){
        if(getInfoProductoId(p.Nom) != null){
            JOptionPane.showMessageDialog(null, "El Nombre ya se encuentra registrado");
        }else if(getInfoProductoNom(p.Apell) != null){
            JOptionPane.showMessageDialog(null, "El Apellido ya se encuentra registrado");
        }else{
            pila.push(p);
            Vistas.Paginaprincipal_1Controller.Productos.add(p);
            Vistas2.Paginaprincipal_2Controller.Productos.add(p);
            JOptionPane.showMessageDialog(null, "Datos registrados exitosamente!");
        }
        
    }
    public datos2 getInfoProductoId (String nom){
        datos2 aux = new datos2();
        int i = 0;
        while(i<pila.size()){
            aux = (datos2) pila.get(i);
            if(aux.Nom.equals(nom))
                return aux;
            i++;
        }
        aux = null;
        return aux;
    }
    public datos2 getInfoProductoNom (String apell){
        datos2 aux = new datos2();
        int i = 0;
        while(i<pila.size()){
            aux = (datos2) pila.get(i);
            if(aux.Apell.equals(apell))
                return aux;
            i++;
        }
        aux = null;
        return aux;
    }
    
}
