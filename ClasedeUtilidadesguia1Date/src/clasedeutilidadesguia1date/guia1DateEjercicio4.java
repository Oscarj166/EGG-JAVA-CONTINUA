/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasedeutilidadesguia1date;

import Servicios.FechaService;
import java.util.Date;

/**
 *
 * @author estar
 */
public class guia1DateEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    FechaService fechaService = new FechaService();
    Date fechaNacimiento = fechaService.fechaNacimiento();
    Date fechaActual = fechaService.fechaActual();
    int edad = fechaService.diferencia(fechaActual, fechaNacimiento);
    System.out.println("Su edad es: " + edad + " años.");
    }
    
}
