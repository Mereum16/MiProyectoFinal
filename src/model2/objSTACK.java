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
    /*public void setRemoveProducto(){
        String fecha = PaginaprincipalController.fecha;
        datos eliminar = new datos();
        for (datos lista : pila){
            eliminar = getInfoProductoFechaV(fecha);
            while(eliminar != null){
                pila.remove(eliminar);
                controller.PaginaprincipalController.Productos.remove(eliminar);
                eliminar = getInfoProductoFechaV(fecha);
            }
        }
        
    }*/
   /*NO BORRAR/* public void listarID(String id){
        for(datos lista : pila){
            if(lista.Nom.equals(id)){
                controller.busqueda.BuscarController.busqueda.add(lista);
                aux = lista;
            }
        }
    }
    public void listarNom(String nom){
        for(datos lista : pila){
            if(lista.Apell.equals(nom)){
                controller.busqueda.BuscarController.busqueda.add(lista);
                aux = lista;
            }
        }
    }
    /*public void listarFechaL(String fechal){
        for(datos lista : pila){
            if(lista.FechaLote.equals(fechal)){
                controller.busqueda.BuscarController.busqueda.add(lista);
                aux = lista;
            }
        }
    }*/
    /*public datos getInfoProductoFechaV (String FechaV){
        datos aux = new datos();
        int i = 0;
        while(i<pila.size()){
            aux = (datos) pila.get(i);
            if(aux.FechaVence.equals(FechaV))
                return aux;
            i++;
        }
        aux = null;
        return aux;
}
    public void listarFechaV(String fechav){
        for(datos lista : pila){
            if(lista.FechaVence.equals(fechav)){
                controller.busqueda.BuscarController.busqueda.add(lista);
                aux = lista;
            }
        }
    }
    public void listarPrecio(float precio){
        for(datos lista : pila){
            if(lista.precioU == (precio)){
                controller.busqueda.BuscarController.busqueda.add(lista);
                aux = lista;
            }
        }
    }
    public float promPrecio(){
        float sum = 0;
        float prom = 0;
        for (datos lista : pila){
            sum = lista.getPrecioU() + sum;
        }
        prom = sum / pila.size();
        return prom;
    }
    public void getMenProm (){
        float prom = promPrecio();
        for (datos lista : pila){
            if(lista.precioU < prom){
                controller.busqueda.BuscarController.busqueda.add(lista);
            }
        }
    }
    public void getMayProm (){
        float prom = promPrecio();
        for (datos lista : pila){
            if(lista.precioU > prom){
                controller.busqueda.BuscarController.busqueda.add(lista);
            }
        }
    }
    public void getMayPrecio(){
        datos mayor = getMay();
        for (datos lista : pila){
            if(lista.precioU > mayor.precioU){
                mayor = lista;
            }
        }
        for (datos lista2 : pila){
            if(lista2.precioU == mayor.precioU){
                controller.busqueda.BuscarController.busqueda.add(lista2);
            }
        }
    }
    public datos getMay(){
        datos mayor = new datos();
        float precio = 0;
        for (datos lista : pila){
            if(lista.precioU > precio){
                mayor = lista;
            }
        }
        return mayor;
    }
    public void getMenPrecio(){
        datos menor = getMay();
        for (datos lista : pila){
            if(lista.precioU < menor.precioU){
                menor = lista;
            }
        }
        for (datos lista2 : pila){
            if(lista2.precioU == menor.precioU){
                controller.busqueda.BuscarController.busqueda.add(lista2);
            }
        }
    }*/
}
