/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.Entidades;

import java.util.Date;

/**
 *
 * @author estar
 */
public class Usuario {
    public String nombre;
    public String apellido;
    public String dni;
    public int edad;
    public Date fechaN;
    public String pais;
    
     public Usuario() {
    
}

    public Usuario(String nombre, String apellido, String dni, int edad, Date fechaN, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.fechaN = fechaN;
        this.pais = pais;
    }
     
}
