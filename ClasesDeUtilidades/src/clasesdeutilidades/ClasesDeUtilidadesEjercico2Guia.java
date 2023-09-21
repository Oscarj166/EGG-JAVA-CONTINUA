/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesdeutilidades;

import entidades.ParDeNumeros;
import java.util.Scanner;
import servicio.ParDeNumerosService;

/**
 *
 * @author estar
 */
public class ClasesDeUtilidadesEjercico2Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sca = new Scanner(System.in);
        ParDeNumerosService p1 = new ParDeNumerosService();
        ParDeNumeros number = p1.mostrarValores();
        
        System.out.println("valores" + p1.mostrarValores());
        System.out.println("------------------------");
         System.out.println("Mayor " + p1.devolverMayor(number));
          System.out.println("------------------------");
          System.out.println("potencia " + p1.calcularPotencia(number));
           System.out.println("------------------------");
           System.out.println(" raiz " + p1.calculaRaiz(number));
        
    }
    
}
