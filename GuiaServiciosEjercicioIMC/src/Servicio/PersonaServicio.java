
package Servicio;

import entidades.Persona;
import java.util.Scanner;

/*
Método esMayorDeEdad(): indica si la persona es mayor de edad.
La función devuelve un booleano.

Metodo crearPersona(): el método crear persona, le pide los 
valores de los atributos al usuario y después se le asignan a sus 
respectivos atributos para llenar el objeto Persona. Además, 
comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje

Método calcularIMC(): calculara si la persona está en su peso 
ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da por 
resultado un valor menor que 20, significa que la persona está 
por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos),
significa que la persona está en su peso ideal y la función 
devuelve un 0. Finalmente, si el resultado de la fórmula es un
valor mayor que 25 significa que la persona tiene sobrepeso, y
la función devuelve un 1.


 */
public class PersonaServicio {
    
    public Persona esMayorDeEdad(){
        Persona p1= new Persona();
        Scanner sc= new Scanner(System.in);
        
        if(p1.getEdad()>18){
       boolean edad=true;
            System.out.println("es mayor=" + edad);
        }else{
        boolean edad=false;
        System.out.println("es mayor =" + edad);
        
        }
        
        return p1;
    }
    
    public  void crearPersona(Persona p1) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        
        System.out.println("ingrese su sexo");
        
        System.out.println("Ingrese su sexo");
        System.out.println(" 'H' para hombre");
        System.out.println(" 'M' para mujer");
        System.out.println(" 'O' para otro");
        p1.setSexo(sc.next());
        
        if(p1.getSexo()=="H"){
            System.out.println("Hombre");
        }else if(p1.getSexo()=="M"){
            System.out.println("Mujer");
        }else if(p1.getSexo()=="O"){
            System.out.println("Otro");
        }else{
            System.out.println("Error ha ingresado un caracter incorrecto");
        }
        
        System.out.println("Ingrese su altura");
        p1.setAltura(sc.nextDouble());
        
        System.out.println("Ingrese peso");
        p1.setPeso(sc.nextDouble());
        
        System.out.println("Ingrese su edad");
        p1.setEdad(sc.nextInt());
        
    
    }
    
    public  void calcularIMC(Persona p1) {
        
    switch () {
        	case 1:
           System.out.println("Esta línea de código se ejecuta si opcion = 1");
           break;

        	case 2:
           System.out.println("Esta línea de código se ejecuta si opcion = 2");
            break;

        	default:
           System.out.println("El valor ingresado en la variable opcion es diferente" + "a todos los casos analizados por el switch");
    	}

    
    }
    
}
