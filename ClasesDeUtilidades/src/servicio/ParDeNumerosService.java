/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.ParDeNumeros;

/**
 *
 * @author estar
 */
public class ParDeNumerosService {
    public ParDeNumeros  mostrarValores() {
        ParDeNumeros number = new ParDeNumeros();
        System.out.println("Los valores son: " + number.getNum1() + " y " + number.getNum2());
    
    return number;
    }
    
    
    public double devolverMayor(ParDeNumeros number) {
        if (number.getNum1() > number.getNum2()) {
            return number.getNum1();
        } else {
            return number.getNum2();
        }
    }
    
    public double calcularPotencia(ParDeNumeros number) {
       double mayor =  devolverMayor(number);
        double menor = (mayor == number.getNum1() ? number.getNum2() : number.getNum1());
        mayor = Math.round(mayor*20);
        menor = Math.round(menor*20);
 
        System.out.println("mayor" + mayor);
        System.out.println("menor" + menor);
        return Math.pow(mayor, menor);
        
    }
    
    public double calculaRaiz(ParDeNumeros number) {
        double menor = number.getNum1() < number.getNum2() ? number.getNum1() : number.getNum2();
        menor = Math.abs(menor);
        return Math.sqrt(menor);
    }
    
}
