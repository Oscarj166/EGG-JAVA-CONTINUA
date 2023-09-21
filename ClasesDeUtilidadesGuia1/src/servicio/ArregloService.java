/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Arrays;
import java.util.Collections;

/*arreglo
 *
 * @author estar
 */
public class ArregloService {
     public void inicializarA(double[] arregloA) {
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.random() * 100;
        }
    }

    public void mostrar(double[] arregloA) {
        System.out.println(Arrays.toString(arregloA));
    }

    public void ordenar(double[] arregloA) {
        Arrays.sort(arregloA, Collections.reverseOrder());
        System.out.println("Arreglo ordenado" + Arrays.toString(arregloA));
    }

    public void inicializarB(double[] arregloA, double[] arregloB) {
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }
        
       Arrays.fill(arregloA, 10, 19, 0.5);
    }
    
}
