/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesdeutilidadesguia1.pkg1;

import entidades.Persona;
import java.util.Date;
import servicio.PersonaService;

/**
 *
 * @author estar
 */
public class gGuia1Ejerccicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereService
        
        PersonaService persona1= new PersonaService();
        Persona persona = persona1.crearPersona();
     Date per =  persona1.fechaActual();
     Persona p3 = persona1.crearPersona();
     
        
      
      
        System.out.println(persona1.calcularEdad(persona));
        System.out.println("");
        System.out.println(p3);
        System.out.println("");
        System.out.println(per);
        System.out.println("");
        System.out.println(persona1.menorQue(persona, 0, per, per));
        System.out.println("");
        persona1.mostrarPersona(persona);
     
        
    }
    
}
