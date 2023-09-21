/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

import static circunferencia.Circunferencia.Area;
import static circunferencia.Circunferencia.Perimetro;
import java.util.Scanner;

/**
 *
 * @author estar
 */
public class Circunferencia {
    private double radio;
    
            

    public Circunferencia() {
      
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
     public double getRadio() {
        
        return this.radio;
    }

    public void setRadio(double radio) {
       
        
        this.radio = radio;
    }
    
    
     public static void crearCircunferencia() {
          System.out.println("Ingrese radio");
        
    }
   
    
    public static double Area(double radio) {
     
        double area= 3.14*(radio*radio);
        System.out.println("El area es: " + area);
        return area;
    }
    
    public static double Perimetro(double radio) {
       double peri, pi=3.14;
        peri=2*pi*radio;
        System.out.println("El perietro es: " + peri);
        return peri;
    }

    

    
   
    
    }
    
    

