/*

 */
package ejerciciointegrador;

import entidades.Estudiante;
import servicio.EstudianteServicio;

/*
 */
public class EjercicioIntegradorIntroduccionJava {

    /*
     */
    public static void main(String[] args) {
        
         EstudianteServicio studentService = new EstudianteServicio();
         
    Estudiante[] estudiantes = studentService.crearEstudiantes();
    
    double promedioNotas = studentService.calcularPromedio(estudiantes);
    
    System.out.println("El promedio de notas es: " + promedioNotas);
    
    Estudiante[] estudiantesConNotaMayorAlPromedio = studentService.EstudiantesMayorAlPromedio(estudiantes, promedioNotas);
    
    System.out.println("Los estudiantes con nota mayor al promedio son:");
    for (int i = 0; i < estudiantesConNotaMayorAlPromedio.length; i++) {
        System.out.println(estudiantesConNotaMayorAlPromedio[i].getNombre() + " - " + estudiantesConNotaMayorAlPromedio[i].getNota());
    
    
    
    }
    }
    
}
