package proyecto;

import javax.swing.JOptionPane;

public class Proyecto {

    public static void main(String[] args) {

        Cabañas B = new Cabañas();
        
        B.Cabañas();
        B.Est();
        B.estatus();
        B.Ocupado();

//***********************************************        
        
        Cliente C = new Cliente();
        
        C.Clientes();
        C.usuario = "Nombre usuario";
        
//*********************************************** 
        
        Pago A = new Pago();
        
        A.FormaPago();

    }//Fin del main

}//Fin de la clase
