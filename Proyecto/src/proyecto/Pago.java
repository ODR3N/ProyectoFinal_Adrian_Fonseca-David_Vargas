package proyecto;

import javax.swing.JOptionPane;

public class Pago {

    String costo;
    String pago;

    public static void FormaPago() {

        int costo = 25;
        String desc = "";

        int[] condiones_cabaña = new int[5];
        //Creacion de arreglo para almacenar los datos del pago  

        JOptionPane.showMessageDialog(null, " La noche tiene un valor de $25 por persona");
        JOptionPane.showMessageDialog(null, " En este momento tenemos un descuento por cada 4 personas se descuenta una persona.");

        condiones_cabaña[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite las noches a hospedar en la cabina: "));
        condiones_cabaña[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de personas a hospedar: "));
        condiones_cabaña[2] = Integer.parseInt(JOptionPane.showInputDialog("Escriba su numero de tarjeta: "));
        condiones_cabaña[4] = Integer.parseInt(JOptionPane.showInputDialog("Digite el pin de su tarjeta: "));
        condiones_cabaña[3] = Integer.parseInt(JOptionPane.showInputDialog("Que dia de este mes desea reservar? "));
        //El usuario introduce los datos necesarios para el pago

        if (condiones_cabaña[1] < 4) {//Condicion para que NO se aplique el descuento

            int pago = (condiones_cabaña[1] * costo) * condiones_cabaña[0];//Calculo del costo final del alquiler
            JOptionPane.showMessageDialog(null, "El total a pagar es: " + "$" + pago + " IVAI" + "\n" + "Gracias por su reserva. Su reserva esta programada para el dia: " + condiones_cabaña[3] + " de este mes.");
            //Impresion de los datos de los costos

        } else {

            int pago1 = ((condiones_cabaña[1] - 1) * costo) * condiones_cabaña[0];//Calculo del costo final del alquiler con el descuento
            JOptionPane.showMessageDialog(null, "El total a pagar es: " + "$" + pago1 + " IVAI" + "\n" + "Gracias por su reserva. Su reserva esta programada para el dia: " + condiones_cabaña[3] + " de este mes.");
            //Impresion de los datos de los costos con descuento
        }

    }//Fin del metodo FormaPago 

}//Fin de la clase Pago
