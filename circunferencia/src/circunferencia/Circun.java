/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

import static circunferencia.Circunferencia.Area;
import static circunferencia.Circunferencia.Perimetro;
import static circunferencia.Circunferencia.crearCircunferencia;
import java.util.Scanner;

/**
 *
 * @author estar
 */
public class Circun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        Circunferencia  r1 = new Circunferencia();
        crearCircunferencia();
       double radio=sc.nextDouble();
        r1.setRadio(radio);
        
       
        Area(radio);
       Perimetro(radio);
   
       
        
    }
  
}


