/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguiaservicios;

import Entidades.CuentaBancaria;
import Servicio.CuentaBancariaServicio;

/**
 *
 * @author estar
 */
public class EjerciciosGuiaServicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaBancariaServicio d1= new CuentaBancariaServicio();
       CuentaBancaria c1 = d1.crearCuenta();
       d1.IngresarCuenta(c1);
       d1.RetirarCuenta(c1);
       d1.ExtraccionRapidaCuenta(c1);
       d1.consultarSaldoCuenta(c1);
       d1.consultarDatosCuenta(c1);
    }
    
}
