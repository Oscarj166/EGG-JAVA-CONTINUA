/*
 Realizar una clase llamada CuentaBancaria en el paquete Entidades
con los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
 
Método para crear cuenta pidiéndole los datos al usuario.

Método ingresar(double): recibe una cantidad de dinero a ingresar
y se le sumará al saldo actual.

Método retirar(double): recibe una cantidad de dinero a retirar
y se le restara al saldo actual. Si la cuenta no tiene la cantidad 
de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.

Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. 
Validar que el usuario no saque más del 20%.

Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.

Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
package Servicio;

import Entidades.CuentaBancaria;
import java.util.Scanner;


public class CuentaBancariaServicio {
    
    public CuentaBancaria crearCuenta(){
    
    CuentaBancaria c1 = new CuentaBancaria();
     // Llenar los atributos
    Scanner sc = new Scanner(System.in);
   
   
    System.out.println("Ingrese el número de cuenta");  
    c1.setNumeroCuenta(sc.nextInt());

    System.out.println("Ingrese el número de DNI");
    c1.setDniCliente(sc.nextLong());
      
    System.out.println("Ingrese su saldo actual");
    c1.setSaldoActual(sc.nextDouble());
    return c1;
    }
       public void IngresarCuenta(CuentaBancaria c1){
        Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese monto a acreditar");
        int ingresar = sc.nextInt();
        double suma= c1.getSaldoActual()+ingresar;
        c1.setSaldoActual(suma);
       } 
       public void RetirarCuenta(CuentaBancaria c1){
        Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese monto a retirar");
        int retirar = sc.nextInt();
       if(retirar<c1.getSaldoActual()){ 
           double resta= c1.getSaldoActual()- retirar;
        c1.setSaldoActual(resta);
       } else{
           System.out.println("El monto ingresado es mayor a su saldo actual se le retirara el monto maximo de su cuenta");
           double resta= c1.getSaldoActual()- c1.getSaldoActual();
           c1.setSaldoActual(resta);
       }
       }
       public void ExtraccionRapidaCuenta(CuentaBancaria c1){
        Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese monto a retirar");
           System.out.println("Solo puede sacar el 20% de su saldo  en cuenta es decir: " + (c1.getSaldoActual()*0.20));
        int retirar = sc.nextInt();
        double resta= c1.getSaldoActual()- retirar;
        c1.setSaldoActual(resta);
}
       
       public void consultarSaldoCuenta(CuentaBancaria c1){
        Scanner sc = new Scanner(System.in);
      System.out.println("Desea consultar el saldo en cuenta");
        String saldo = sc.next();
        if(saldo.equals("si")){
            System.out.println("su saldo actual es: " + c1.getSaldoActual());
       } 
       }
        public void consultarDatosCuenta(CuentaBancaria c1){
        Scanner sc = new Scanner(System.in);
      System.out.println("Datos de la cuenta");
            System.out.println("su DNI es: " + c1.getDniCliente());
            System.out.println("su número de cuenta es: " + c1.getNumeroCuenta()));
            System.out.println("su saldo actual es: " + c1.getSaldoActual());
        
       } 
}



       
       


  
 
  
    
   
   
    
        
    
   
    
   
    
    

