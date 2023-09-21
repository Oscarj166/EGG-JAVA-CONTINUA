/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3poo;

/**
 *
 * @author estar
 */
public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public static void crearOperacion() {
        System.out.println("Ingrese 2 numeros enteros");
        
    }
    
    
    public static int Suma(int numero1,int numero2) {
        int suma =  numero1 +  numero2;
         System.out.println("La suma es: " + suma);
        return suma;
    }
    public static int Resta(int numero1,int numero2) {
        int resta =  numero1 -  numero2;
         System.out.println("La resta es: " + resta);
        return resta;
    }
    public static int Multiplicaion(int numero1,int numero2) {
        int multiplicaion =  numero1 *  numero2;
                System.out.println("La multiplicacion es: " + multiplicaion);

        return multiplicaion;
    }
    public static double Division(int numero1,int numero2) {
        
        
        if(numero1!=0 && numero2 !=0){
            double division =  numero1 /  numero2;
            System.out.println("La division es: " + division);
        }else{
            System.out.println("ingrese numeros diferentes  de 0");
        }
        double division;
        return 0;
        
        

    }
    
}
    
   
  


