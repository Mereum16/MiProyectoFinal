/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaMetodo;


import javafx.scene.control.TextField;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ruben
 */
public class Lista {
    nodo cab;
    nodo info;  //Para creación de nodo a registrar.
    
    Lista(){ cab = null; }
    
    public boolean getEsVacia(){ return cab==null?true:false; }
    
    public int getLongLista(){
        if(getEsVacia()) return 0;
        else{
            nodo p=cab;
            int cont=0;
            while(p!=null){
                cont++;
                p=p.sig;
            }
            return cont;
        }
    }
    
    public nodo getBuscaride(String numcuenta){
        if(getEsVacia())
            return null;
        else{
            nodo p=cab;
            while(p!=null){
                if(p.numCuenta == numcuenta)
                    return p;
                else
                    p=p.sig;
            }
            return null;
        }
        
    }
    
    public boolean getCrearNodo(
            TextField jtfmetodopago, TextField jtftelalt, TextField jtfnumcuenta, TextField jtftfechaexp){
        nodo b=null; 
        info=null;
        try{
            do{
                b=getBuscaride(
                jtfmetodopago.getText());
                if(b!=null){
                    JOptionPane.showMessageDialog(null, 
                    "Error, el código ya existe!!"
                    + " Intente nuevamente.");
                    jtfmetodopago.setText("");
                    jtfmetodopago.requestFocus();
                }
            }while(b!=null);
            info = new nodo(
                jtfmetodopago.getText(),
                jtftelalt.getText(),
                jtfnumcuenta.getText(),
                jtftfechaexp.getText()
                
                
                
               
              
                    
                
                
            );
            JOptionPane.showMessageDialog(null, 
            "Se ha creado un nuevo nodo.");
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, 
                "Error: "+e+".  No fue posible crear el nodo.");
            info=null;
            return false;
        }
    }
    /*public void insertEntreDosNodos (
     JTextField jtfide,
        JTextField jtfnombre,
        JComboBox jcbsexo,
        JComboBox jcbgrado,
        JTextField jtfedad,
        JTextField jtftel
    ){
        getCrearNodo(jtfide, jtfnombre, jcbsexo, jcbgrado, jtfedad, jtftel);
        if(info!=null){
            if(cab==null){
                cab=info;
                JOptionPane.showMessageDialog(null,
                    "Se ha registrado el nodo a la lista, "
                    + "la lista estaba vacía.");
            }else{
                  
            }
        }
    }*/
    public void setAddI(
            TextField jtfmetodopago,
            TextField jtftelalt,
            TextField jtfnumcuenta,
            TextField jtffechaexp
          
       
    ){
        getCrearNodo(jtfmetodopago, jtftelalt, jtfnumcuenta, jtffechaexp);
        if(info!=null){
            if(cab==null){
                cab=info;
                JOptionPane.showMessageDialog(null,
                    "Se ha registrado el nodo a la lista, "
                    + "la lista estaba vacía.");
            }else{
                info.sig=cab;
                cab=info;
                JOptionPane.showMessageDialog(null,
                    "Se ha registrado el nodo al principio "
                    + "de la lista.");
            }
        }
    }
    
   
    
    public void setAddF(
            TextField jtfmetodopago,
            TextField jtftelalt,
            TextField jtfnumcuenta,
            TextField jtffechaexp
          
    ){
        getCrearNodo(jtfmetodopago, jtftelalt, jtfnumcuenta, jtffechaexp);
        if(info!=null){
            if(cab==null){
                cab=info;
                JOptionPane.showMessageDialog(null,
                    "Se ha registrado el nodo a la lista, "
                    + "la lista estaba vacía.");
            }
        }
    }
    
    //Este método registra un dato al JTable
    /*public void setRegistrarFilaJTable(DefaultTableModel miModelo,
        int pFila, nodo p){
        
        miModelo.setValueAt(p.ide, pFila, 0);
        miModelo.setValueAt(p.nombre, pFila, 1);
        miModelo.setValueAt(p.sexo, pFila, 2);
        miModelo.setValueAt(p.grado, pFila, 3);
        miModelo.setValueAt(p.edad, pFila, 4);
        miModelo.setValueAt(p.tel, pFila, 5);
        
        
        
    }    
    
    //Este método actualiza el contenido de la fila
    //de un JTable a partir de su modelo de datos 
    //(JTableModel)
    public void setLlenarJTable(JTable tab){
        int posFilaT=0; //Este índice recorre los elementos de la fila Tabla
        nodo p=cab;  //Este nodo me mueve posición x posición en la lista
        DefaultTableModel miModelo=new DefaultTableModel();

        miModelo.addColumn("Identificacion");
        miModelo.addColumn("Nombres");
        miModelo.addColumn("Sexo");  
        miModelo.addColumn("Grado");
        miModelo.addColumn("Edad");
        miModelo.addColumn("Telefono");
        
        
        while(p!=null){                        
            miModelo.addRow(new Object[]{"", "", "", "", ""});              
            setRegistrarFilaJTable(miModelo,posFilaT,p);            
            p=p.sig;
            posFilaT++;
        }
        tab.setModel(miModelo);
    } 
    
    public nodo getAnterior(nodo p){
        nodo q=cab;
        if(cab==null)
            return null;
        else{
            while(q.sig!=p)
                q=q.sig;
            return q;
        }
    }*/
    
        
   /* public void setEliminar(int Ide){
        if(getEsVacia()){
            JOptionPane.showMessageDialog(null, 
                "La lista se encuentra vacía!!");
        }else{
            nodo b=getBuscaride(Ide);
            nodo p=null;
            if(b==null){
                JOptionPane.showMessageDialog(null, 
                "El código a eliminar no existe!!");
            }else{
                if((b==cab)&&(cab.sig==null)){
                    cab=null;
                    JOptionPane.showMessageDialog(null, 
                        "Elemento eliminado de la cabecera!! "
                        + "La lista quedó vacía.");
                }
                else if((b==cab)&&(cab.sig!=null)){
                    cab=cab.sig;
                    b.sig=null;
                    b=null;
                    JOptionPane.showMessageDialog(null, 
                        "Elemento eliminado de la cabecera!! "
                        + "La lista tiene elementos.");
                }
                else if(b.sig==null){
                    p=getAnterior(b);
                    p.sig=null;
                    b=null;
                    JOptionPane.showMessageDialog(null, 
                        "Elemento eliminado al final de la lista!!");
                }
                else{
                    p=getAnterior(b);
                    p.sig=b.sig;
                    b.sig=null;
                    b=null;
                    JOptionPane.showMessageDialog(null, 
                        "Elemento eliminado entre dos nodos de "
                         + "la lista!!");
                }
            }
        }
    }
    
    public nodo getPos(int pos){
        if (pos > getLongLista())
            return null;
        else {
            if (cab == null) {
                return null;
            } else if ((pos == 0) && (cab != null)) {
                return cab;
            } else {
                nodo p = cab;
                int i = 0;
                while ((i != pos) && (p != null)) {
                    p = p.sig;
                    i++;
                }
                return p;
            }
        }
    }
    
    public void setAddFNodo(
            nodo q
    ) {
        if (cab == null) {
            cab = q;
        } else {
            nodo u = getUltimo();
            u.sig = q;
        }
    }
    
    public void setInvertir(){
        Lista lstAux=new Lista();
        if(cab==null)
            JOptionPane.showMessageDialog(null,
                "La lista se encuentra vacía!");
        else{
            int i;
            nodo info=null, p=null;
            for(i=(getLongLista()-1); i>=0; i--){
                p=getPos(i);
                info=new nodo(p.ide, p.nombre, 
                    p.sexo, p.tel, p.edad, p.grado);
                lstAux.setAddFNodo(info);
                info=p=null;
            }
            cab=lstAux.cab;
        }

    }
    
    public void setInvertir2() {
        Lista lstAux=new Lista();
        nodo u=null, a=null;
        if(cab==null)
            JOptionPane.showMessageDialog(null,
                "La lista se encuentra vacía!");
        else{
            while(cab.sig!=null){
                u=getUltimo();
                a=getAnterior(u);
                a.sig=null;
                lstAux.setAddFNodo(u);
            }
            u=cab;
            lstAux.setAddFNodo(u);
            cab=lstAux.cab;
        }
    }*/

}
