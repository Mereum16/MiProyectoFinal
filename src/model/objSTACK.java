/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Vistas.PaginaprincipalController;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel zarza
 */
public class objSTACK {
    private Stack<datos> pila;
    public static datos aux = null;
    public objSTACK() {
        this.pila = new Stack<>();
    }
    
    public void setPushProducto (datos p){
        if(getInfoProductoId(p.Nom) != null){
            JOptionPane.showMessageDialog(null, "El Nombre ya se encuentra registrado");
        }else if(getInfoProductoNom(p.Apell) != null){
            JOptionPane.showMessageDialog(null, "El Apellido ya se encuentra registrado");
        }else{
            pila.push(p);
            Vistas.PaginaprincipalController.Productos.add(p);
            Vistas3.Paginaprincipal_3Controller.Productos.add(p);
            JOptionPane.showMessageDialog(null, "Datos registrados exitosamente!");
        }
        
    }
    public datos getInfoProductoId (String nom){
        datos aux = new datos();
        int i = 0;
        while(i<pila.size()){
            aux = (datos) pila.get(i);
            if(aux.Nom.equals(nom))
                return aux;
            i++;
        }
        aux = null;
        return aux;
    }
    public datos getInfoProductoNom (String apell){
        datos aux = new datos();
        int i = 0;
        while(i<pila.size()){
            aux = (datos) pila.get(i);
            if(aux.Apell.equals(apell))
                return aux;
            i++;
        }
        aux = null;
        return aux;
    }
    
}
