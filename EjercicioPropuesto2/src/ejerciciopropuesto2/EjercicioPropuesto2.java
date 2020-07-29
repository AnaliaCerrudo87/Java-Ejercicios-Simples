/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopropuesto2;

/**
 *
 * @author Analia
 */
import javax.swing.JOptionPane;
public class EjercicioPropuesto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float celsius,fahrenheit;
        celsius=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la temperatura en grados Celsius"));
        fahrenheit= (((celsius*9)/5)+32);
        JOptionPane.showMessageDialog(null,"La temperatura en grados Fahrenheit es :"+fahrenheit);
    }
} 

