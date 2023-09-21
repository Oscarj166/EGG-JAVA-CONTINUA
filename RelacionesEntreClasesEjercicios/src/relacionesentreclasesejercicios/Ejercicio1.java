/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionesentreclasesejercicios;

import entidades.Perro;
import entidades.Persona;
import servicios.AdopcionService;

/**
 *
 * @author estar
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creamos los perros
        Perro perro1 = new Perro("Firulais", "Labrador", 2, "Grande");
        Perro perro2 = new Perro("Toby", "Bulldog", 4, "Mediano");

        // Creamos las personas
        Persona persona1 = new Persona("Juan", "Pérez", 30, 12345678);
        Persona persona2 = new Persona("María", "García", 25, 23456789);

        // Asignamos los perros a las personas
        AdopcionService.adoptarPerro(persona1, perro1);
        AdopcionService.adoptarPerro(persona2, perro2);

        // Mostramos la información de las personas y sus perros
        AdopcionService.mostrarInfoPersona(persona1);
        System.out.println();
        AdopcionService.mostrarInfoPersona(persona2);
    }
}

