package examenrefactcod;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Metodos {

//MÉTODO PARA LA SALIDA DE DATOS    
    public static void outputData(int x) {
        System.out.println(x);

    }

    //MÉTODO PARA LA ENTRADA DE DATOS
    public static int inputData() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero mayor que 0"));
        return num;

    }

}
