/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecctions;

import entidades.Perro;
import java.util.ArrayList;
import servicio.PerroServicio;

/**
 *
 * @author estar
 */
public class ColecctionsArrayslist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        
       PerroServicio servicio = new PerroServicio();
        servicio.guardarRazasPerros();
        String razasPerros = servicio.obtenerRazasPerros();
        System.out.println("Razas de perros guardadas:\n" + razasPerros);
       
    }
       
         
     
      
    }
        
    
    

