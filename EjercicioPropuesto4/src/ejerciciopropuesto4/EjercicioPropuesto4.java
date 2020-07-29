/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopropuesto4;

/**
 *
 * @author Analia
 */
import javax.swing.JOptionPane;
public class EjercicioPropuesto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  String nombre, apellido, email;
  int c;
  
  nombre=JOptionPane.showInputDialog("Ingrese su nombre");
  apellido=JOptionPane.showInputDialog("Ingrese su apellido");
  nombre=nombre.toLowerCase();
  apellido=apellido.toLowerCase();
  email=nombre.substring(0,1)+apellido+"@yahoo.com.ar";
  
 
  JOptionPane.showMessageDialog(null,"Su email generado es: "+email);
  
    }
    
}
