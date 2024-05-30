/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model2;

import model.*;

/**
 * @author Miguel Zarza
 *  */
public class datos2 {
    
    String Nom;
    String Apell;
    String Telefono;
    String Direccion;
    String Departamento;
  
    
    public datos2() {
        Nom = "";
        Apell = "";
        Telefono= "";
        Departamento= "";
        Direccion = "";
        
    }

    public datos2(String Nom, String Apell, String Telefono, String Direccion, String Departamento) {
        this.Nom = Nom;
        this.Apell = Apell;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Departamento = Departamento;
    }
    

    public String getNom() {
        return Nom;
    }

    public String getApell() {
        return Apell;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setApell(String Apell) {
        this.Apell = Apell;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }
}
    
   