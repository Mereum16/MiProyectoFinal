/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaMetodo;

/**
 *
 * @author ruben
 */
public class nodo {
    String metodoPago;
    String telAlt;
    String numCuenta;
    String fechaExp;
    nodo sig;
    nodo nodo1;

    public nodo() {
    }

    public nodo(String metodoPago, String telAlt, String numCuenta, String fechaExp) {
        this.metodoPago = metodoPago;
        this.telAlt = telAlt;
        this.numCuenta = numCuenta;
        this.fechaExp = fechaExp;
        this.sig = sig;
        this.nodo1 = nodo1;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public String getTelAlt() {
        return telAlt;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public String getFechaExp() {
        return fechaExp;
    }

    public nodo getSig() {
        return sig;
    }

    public nodo getNodo1() {
        return nodo1;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setTelAlt(String telAlt) {
        this.telAlt = telAlt;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }

    public void setSig(nodo sig) {
        this.sig = sig;
    }

    public void setNodo1(nodo nodo1) {
        this.nodo1 = nodo1;
    }

}