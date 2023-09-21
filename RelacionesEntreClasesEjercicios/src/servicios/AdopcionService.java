/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Perro;
import entidades.Persona;

/**
 *
 * @author estar
 */
public class AdopcionService {
    
    public static void adoptarPerro(Persona persona, Perro perro) {
        persona.setPerro(perro);
        System.out.println(persona.getNombre() + " adoptó a " + perro.getNombre());
    }

    public static void mostrarInfoPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Documento: " + persona.getDocumento());
        System.out.println("Perro adoptado:");
        System.out.println("Nombre: " + persona.getPerro().getNombre());
        System.out.println("Raza: " + persona.getPerro().getRaza());
        System.out.println("Edad: " + persona.getPerro().getEdad());
        System.out.println("Tamaño: " + persona.getPerro().getTamano());
    }
    
}
