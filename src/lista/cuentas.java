/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class cuentas {
    public static User cab;
    
    public cuentas () { cab = null; }
    
    public User BuscarNom(String txtUser){
        User p = cab;
        if (cab == null)
            return null;
        else{
            while (p != null){
                if ((p.nombre).equals(txtUser))
                    return p;
                else
                    p=p.sig;
            }
            return null;
        }
    }
    public User BuscarCuenta(String txtUser, String contraseña){
        User p = cab;
        if (cab == null)
            return null;
        else{
            while (p != null){
                if ((p.nombre).equals(txtUser) && (p.contraseña).equals(contraseña))
                    return p;
                else
                    p=p.sig;
            }
            return null;
        }
    }
    
    public User CrearNodo (String nombre, String contraseña){
        User info, p;
        String nom;
        if (nombre.equals("") || nombre.equals("")){
            JOptionPane.showMessageDialog(null, "Ambos campos son obligatorios, por favor ingrese su usuario y contraseña");
            return null;
        } else {
            do {
                nom = nombre;
                p = BuscarNom(nom);
                if(p != null){
                    JOptionPane.showMessageDialog(null, "Este nombre de usuario ya se encuentra registrado\n"
                        + "Ingrese uno diferente");
                    return null;
                }
            }while (p != null);
            if (p == null){
                info = new User(nom, contraseña);
                return info;
            }else{
                return null;
            }
        }
    }
    public void crearCuenta(String nombre, String contraseña){
        User info = CrearNodo(nombre, contraseña);
        if(info != null) {
            if (cab == null) {
                cab = info;
            } else {
                info.sig = cab;
                cab = info;
            }
        }
    }
}
