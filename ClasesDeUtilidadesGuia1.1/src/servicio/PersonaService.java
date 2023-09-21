/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author estar
 */
public class PersonaService {
    
    private Scanner scanner;

    public PersonaService() {
      Scanner  scanner = new Scanner(System.in);
    }

    public Persona crearPersona() {
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la fecha de nacimiento (dd/mm/aaaa): ");
        String fechaString = scanner.nextLine();
        Date fechaNacimiento = convertirFecha(fechaString);
        return new Persona(nombre, fechaNacimiento);
    }

    private Date convertirFecha(String fechaString) {
        // Código para convertir un String en formato "dd/mm/aaaa" a un objeto Date
        return null;
    }
    public Date fechaActual() {
        return new Date();
    }

    public int calcularEdad(Persona persona) {
        Date fecha1 = null;
        Date fecha2 = null;
        long diferencia = fecha1.getTime() - fecha2.getTime();
        long PorAnio = 1000L * 60 * 60 * 24 * 365; // Asumimos que un año tiene 365 días
        long edad =(diferencia / PorAnio);
        return (int) edad ;
    }

    public boolean menorQue(Persona persona, int edad,Date fecha1, Date fecha2) {
        
        long diferencia = fecha1.getTime() - fecha2.getTime();
        long PorAnio = 1000L * 60 * 60 * 24 * 365; // Asumimos que un año tiene 365 días
        int edades = (int) (diferencia / PorAnio);
        int edadPersona = (int) edades;
        int edad1=18;
        System.out.println("su edad es " + edadPersona);
        return edadPersona < edad1;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        PersonaService p1= new PersonaService();
        System.out.println("Edad: " + p1.calcularEdad(persona));
    }
}
