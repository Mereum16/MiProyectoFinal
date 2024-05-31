/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author Admin
 */
public class User {
    String nombre, contraseña;
    User sig;
    
    public User(String nombre, String contraseña){
        this.nombre = nombre;
        this.contraseña = contraseña;
        sig = null;      
    }  
}
