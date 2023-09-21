/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Estudiante;

/**
 *
 * @author estar
 */
public class EstudianteServicio {
     public Estudiante[] crearEstudiantes() {
        Estudiante[] student = new Estudiante[8];
        student[0] = new Estudiante("Dani", 7.8);
        student[1] = new Estudiante("María", 8.3);
        student[2] = new Estudiante("Steef", 9.5);
        student[3] = new Estudiante("Ana", 9.0);
        student[4] = new Estudiante("Luis", 5.5);
        student[5] = new Estudiante("Juan", 7.7);
        student[6] = new Estudiante("Carlos", 8.6);
        student[7] = new Estudiante("Laura", 6.5);
        return student;
    }

    public double calcularPromedio(Estudiante[] student) {
        double sumaNotas = 0;
        for (int i = 0; i < student.length; i++) {
            sumaNotas += student[i].getNota();
        }
        double promedioNotas = sumaNotas / student.length;
        return promedioNotas;
    }

    public Estudiante[] EstudiantesMayorAlPromedio(Estudiante[] student, double promedio) {
        int cantidadMayorAlPromedio = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i].getNota() > promedio) {
                cantidadMayorAlPromedio++;
            }
        }
        Estudiante[] studentConNotaMayor = new Estudiante[cantidadMayorAlPromedio];
        int indice = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i].getNota() > promedio) {
                studentConNotaMayor[indice] = student[i];
                indice++;
            }
        }
        return studentConNotaMayor;
    }
    
}
