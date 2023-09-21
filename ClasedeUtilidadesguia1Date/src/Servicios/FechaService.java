/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author estar
 */
public class FechaService {
    public Date fechaNacimiento() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el día de su nacimiento: ");
        int dia = sc.nextInt();
        System.out.print("Ingrese el mes de su nacimiento: ");
        int mes = sc.nextInt() - 1; // Restamos 1 porque en Date los meses van de 0 a 11
        System.out.print("Ingrese el año de su nacimiento: ");
        int anio = sc.nextInt() - 1900; // Restamos 1900 porque en Date se cuentan los años desde 1900
        return new Date(anio, mes, dia);
    }

    public Date fechaActual() {
        return new Date();
    }

    public int diferencia(Date fecha1, Date fecha2) {
        long diferenciaEnMillis = fecha1.getTime() - fecha2.getTime();
        long millisPorAnio = 1000L * 60 * 60 * 24 * 365; // Asumimos que un año tiene 365 días
        return (int) (diferenciaEnMillis / millisPorAnio);
    }
    
}
