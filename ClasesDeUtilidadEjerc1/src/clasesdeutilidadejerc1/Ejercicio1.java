/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesdeutilidadejerc1;

import entidades.Cadena;
import java.util.Scanner;
import sevicios.CadenaServicio;

/**
 *
 * @author estar
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       System.out.println("Ingrese una palabra");
        Scanner sc = new Scanner(System.in);
        Cadena cadena = new Cadena(sc.nextLine());
        CadenaServicio service = new CadenaServicio();
        System.out.println(cadena);
        System.out.println(service.mostrarVocales(cadena));
        service.invertirFrase(cadena);
        System.out.println("Ingrese una letra");
        String letra = sc.next();
        service.vecesRepetido(letra, cadena);
        service.compararLong(letra,cadena);
        service.unirFrases(letra, cadena);
        service.remplazar(letra, cadena);
        System.out.println("Es" + service.contiene(letra, cadena));

        
    }
    
}
