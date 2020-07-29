/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopropuesto6;
import javax.swing.JOptionPane;



    class TCirculo{
    protected double radio;
    public void leerRadio(double x){ radio = x; }
    public double areaCirculo(){return Math.PI*radio*radio; }
    public double verRadio(){return radio;}
    }


    class TCilindro extends TCirculo{
    protected double altura;
    public void leerDatos(double x, double y){
    radio=x; //heredado del circulo
    altura=y;
    }
    public double volCilindro(){
    double v= areaCirculo()*altura; //llamo al método heredado
    return v;
    }
    public double verAltura(){return altura;}
    }

    class TCilindroHueco{
    private double volumenTotal,perexterno,perinterno,volpared;
    protected TCilindro cil1;
    protected TCilindro cil2;
     TCilindroHueco() {
     cil1= new TCilindro();
     cil2= new TCilindro();
     }
     public void datosCilindroH(double r1, double r2, double l1){
     cil1.leerDatos(r1, l1);
     cil1.volCilindro();
     cil2.leerDatos(r2, l1);
     cil2.volCilindro();
     };
    
     public void perimetroExtreno(){
        perexterno=2*Math.PI*cil1.verRadio()*cil1.verAltura();
                
     }
    
     public double verPerexterno(){
        return ((double)Math.round(perexterno * 100d) / 100d); //Utilizola función Math.round()para 
     }                                                        //mostrar solo 2 decimales del resultado
     public void perimetroInterno(){
        perinterno=2*Math.PI*cil2.verRadio()*cil2.verAltura();
    
     }
     public double verPerinterno(){
        return ((double)Math.round(perinterno * 100d) / 100d);
     }
     
     public void volPared(){
         
         volpared=2*Math.PI*(cil1.volCilindro()-cil2.volCilindro());
     
     }
      public double verVolpared(){
        return  ((double)Math.round(volpared * 100d) / 100d);
     }
     
    }
public class EjercicioPropuesto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TCilindroHueco C = new TCilindroHueco();
        double rad1,rad2, alt;
        rad1= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio exterior del cilindro"));
        rad2= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio interior del cilindro"));
        alt= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del cilindro"));
        C.datosCilindroH (rad1,rad2,alt);
        C.volPared();
        C.perimetroExtreno();
        C.perimetroInterno();
       
        
        JOptionPane.showMessageDialog(null, "El volumen de la pared del cilindro es "+"" + C.verVolpared()+"\n El perimetro extreno del cilindro es "+""+C.verPerexterno()+"\n El perimetro interno del cilindro es "+""+C.verPerinterno());
       
        
    }
    
}
