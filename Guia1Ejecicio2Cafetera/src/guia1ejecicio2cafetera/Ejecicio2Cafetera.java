/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1ejecicio2cafetera;

import Entidades.Cafetera;
import Servicio.CafeteraServicio;

/**
 *
 * @author estar
 */
public class Ejecicio2Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CafeteraServicio t1 = new CafeteraServicio();
        Cafetera c1 = t1.llenarCafetera();
    }
    
}
