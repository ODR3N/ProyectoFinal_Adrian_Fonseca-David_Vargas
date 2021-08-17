package proyecto;

import javax.swing.JOptionPane;

public class Cliente {

    String usuario;

    public static void Clientes() {

        String usuario[] = new String[3];//Se crea arreglo con los datos del cliente

        usuario[0] = String.format(JOptionPane.showInputDialog("Digite su nombre o nombre de usuario: "));
        usuario[1] = String.format(JOptionPane.showInputDialog("Digite su direccion de correo: "));
        usuario[2] = String.format(JOptionPane.showInputDialog("Digite su numero de cedula: "));

        JOptionPane.showMessageDialog(null, "Usuario = " + usuario[0] + "   Correo: " + usuario[1] + "   Cedula: " + usuario[2]);//Se imprimen todos los datos dentro del arreglo

        JOptionPane.showMessageDialog(null, "Su reservacion esta casi lista, proceda con el pago");

    }//Fin del metodo Clientes

}//Fin de la clase cliente
