/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopropuesto5;
import javax.swing.JOptionPane;

/**
 *
 * @author Analia
 */
class Alumno{
    
    String alumno;
    String materia;
    float nota1, nota2,nota3;
    float promedio;
    public void setPromedio(float n1, float n2,float n3){
        
       nota1=n1;
       nota2=n2;
       nota3=n3;
    }
    
    public void promedio(){
        promedio= (nota1+nota2+nota3)/3;
      
    }
    public float getPromedio(){
        return promedio;
    }
    public void setDatos(String a, String b){
        alumno=a;
        materia=b;
    }
    
    public String getAlumno(){
        return alumno;
    }
    public String getMateria(){
        return materia;
    }
    
}

public class EjercicioPropuesto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno A= new Alumno();
       
        float not1,not2,not3;
        String nombre,materia;
        nombre=JOptionPane.showInputDialog("Ingrese el nombre del alumno");
        materia=JOptionPane.showInputDialog("Ingrese nombre de la materia");
        not1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la primera nota del alumno"));
        not2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la segunda nota del alumno"));
        not3= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tercera nota del alumno"));
        
       A.setPromedio(not1,not2,not3);
       A.setDatos(nombre,materia);
       A.promedio();
       A.getPromedio();
        JOptionPane.showMessageDialog(null,"El promedio de "+A.getAlumno()+" es: "+A.getPromedio());
        
    }
    
}
