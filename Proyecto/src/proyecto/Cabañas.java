package proyecto;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Cabañas {

    String alqui;
    String libre;
    String ocupada;
    String mantenimiento;
    private Estados estados[][] = new Estados[4][3];//Arreglo de objetos

    public Cabañas() {//Metodo para llenar el arreglo con objetos vacios

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 3; j++) {
                estados[i][j] = new Estados();

            }//Fin del for 

        }//Fin del for

    }//Fin de metodo Cabañas 

    public void Cabañas() {//Metod para imprimir croquis de la ubicacion de las cabañas

        JOptionPane.showMessageDialog(null, "Croquis de las cabañas : \n"
                + "*************************************************\n"
                + "|  " + "  Cabaña 1  " + "  |  " + "  Cabaña 2  " + "  |  " + "  Cabaña 3  " + "  | \n"
                + "|  " + "  Ocupada   " + "  Mantenimiento   \n"
                + "*************************************************\n"
                + "|  " + "  Cabaña 4  " + "  |  " + "  Cabaña 5  " + "  |  " + "  Cabaña 6  " + "  | \n"
                + "|  " + "                                                 Mantenimiento  \n"
                + "*************************************************\n"
                + "|  " + "  Cabaña 7  " + "  |  " + "  Cabaña 8  " + "  |  " + "  Cabaña 9  " + "  | \n"
                + "|                             Ocupada \n"
                + "*************************************************\n"
                + "| " + " Cabaña 10 " + "  |  " + " Cabaña 11 " + "  |  " + " Cabaña 12 " + "  | \n"
                + "*************************************************\n"
        );

    }//Fin del metodo Cabañas 

    public void Est() {//Metodo para introducir los datos dentro de cada espacio del arreglo

        estados[0][0].estado = ("Cabaña 1: Ocupada ");
        estados[0][1].estado = ("Cabaña 2: Mantenimeinto ");
        estados[0][2].estado = ("Cabaña 3: Libre ");
        estados[1][0].estado = ("Cabaña 4: Libre ");
        estados[1][1].estado = ("Cabaña 5: Libre ");
        estados[1][2].estado = ("Cabaña 6: Mantenimiento ");
        estados[2][0].estado = ("Cabaña 7: Libre ");
        estados[2][1].estado = ("Cabaña 8: Ocuapada ");
        estados[2][2].estado = ("Cabaña 9: Libre ");
        estados[3][0].estado = ("Cabaña 10: Libre ");
        estados[3][1].estado = ("Cabaña 11: Libre ");
        estados[3][2].estado = ("Cabaña 12: Libre ");

    }//Fin del metodo Est

    public void estatus() {//Metodo para imprimir los datos dentro del arreglo de objetos

        JOptionPane.showMessageDialog(null, "Cabaña = " + estados[0][0].estado);
        JOptionPane.showMessageDialog(null, "Cabaña = " + estados[0][1].estado);
        JOptionPane.showMessageDialog(null, "Cabaña = " + estados[0][2].estado);
        JOptionPane.showMessageDialog(null, "Cabaña = " + estados[1][0].estado);
        JOptionPane.showMessageDialog(null, "Cabaña = " + estados[1][1].estado);
        JOptionPane.showMessageDialog(null, "Cabaña = " + estados[1][2].estado);
        JOptionPane.showMessageDialog(null, "Cabaña = " + estados[2][0].estado);
        JOptionPane.showMessageDialog(null, "Cabaña = " + estados[2][1].estado);
        JOptionPane.showMessageDialog(null, "Cabaña = " + estados[2][2].estado);
        JOptionPane.showMessageDialog(null, "Cabaña = " + estados[3][0].estado);
        JOptionPane.showMessageDialog(null, "Cabaña = " + estados[3][1].estado);
        JOptionPane.showMessageDialog(null, "Cabaña = " + estados[3][2].estado);

    }//Fin del metodo estatus

    public static void Ocupado() {//Metodo para determinar si una Cabaña no se encuentra disponible
        String alqui = "";

        int a = 0;

        while (a == 0) {
            alqui = String.format(JOptionPane.showInputDialog("Digite el numero de la cabaña que desea alquilar:  "));

            switch (alqui) {

                case "1","8":
                    JOptionPane.showMessageDialog(null, "Esta cabaña ocupada!");
                    break;

                case "2","6":
                    JOptionPane.showMessageDialog(null, "Esta cabaña esta en matenimiento!");
                    break;

                case "3","4","5","7","9","10","11","12":
                    JOptionPane.showMessageDialog(null, "Perfecto! "
                            + "Esta Cabaña esta libre!");
                    JOptionPane.showMessageDialog(null, "Proceda con la introduccion de sus datos.");
                    a = 1;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Esta cabaña no existe.");

            }

        }//Fin del while

    }//Fin del metodo ocupado

}//Fin de la clase Cabañas

