package examenrefactcod;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Metodos {

    public static void outputData(int x) {
        System.out.println(x);

    }

    public static int inputData() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero mayor que 0"));
        return num;

    }

}
