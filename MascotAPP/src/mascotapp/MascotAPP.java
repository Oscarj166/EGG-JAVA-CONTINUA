/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.Scanner;
import mascotapp.Entidades.Mascota;

/**
 *
 * @author estar
 */
public class MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mascota n1 = new Mascota("Jose chiquis", "chiquis", "perro", scanner.nextInt(), true, "Chiuahua");
       
        /*
     public String nombre;
    public String apodo;
    //perro, gato, conejo, loro
    public String tipo;
    public int edad;
    public boolean cola;
    public String raza;
        */
        
        System.out.println("su apodo es; "+n1.apodo+", y su nombre es:  " + n1.nombre+", y tiene "+ n1.edad +" de edad");
    }
    
}
