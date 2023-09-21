/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3poo;

import static ejercicio3poo.Operacion.Division;
import static ejercicio3poo.Operacion.Multiplicaion;
import static ejercicio3poo.Operacion.Resta;
import static ejercicio3poo.Operacion.Suma;
import static ejercicio3poo.Operacion.crearOperacion;
import java.util.Scanner;

/**
 *
 * @author estar
 */
public class Ejercicio3Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        Operacion op= new Operacion();
       crearOperacion();
       int num1=sc.nextInt();
       int num2=sc.nextInt();
       
       op.setNumero1(num1);
       op.setNumero2(num2);
       Suma(num1,num2);
       Resta(num1,num2);
       Multiplicaion(num1,num2);
       Division(num1,num2);
       
       
       
    }

  
    
}
