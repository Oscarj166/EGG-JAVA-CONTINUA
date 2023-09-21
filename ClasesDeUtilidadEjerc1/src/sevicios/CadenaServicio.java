/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sevicios;

import entidades.Cadena;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeArray.reverse;
/**
 *
 * @author estar
 */
public class CadenaServicio {
    
    public int mostrarVocales(Cadena cadena){
/*MÃ©todo mostrarVocales(), deberÃ¡ contabilizar la cantidad de vocales
que tiene la frase ingresada.*/
    int contVoc=0;    
    for (int i = 0; i < cadena.getLongitud(); i++) {
         if(cadena.getFrase().substring(i,(i+1)).equalsIgnoreCase("a")){
         contVoc++;
         }
         if(cadena.getFrase().substring(i,(i+1)).equalsIgnoreCase("e")){
         contVoc++;
         }
         if(cadena.getFrase().substring(i,(i+1)).equalsIgnoreCase("i")){
         contVoc++;
         }
         if(cadena.getFrase().substring(i,(i+1)).equalsIgnoreCase("o")){
         contVoc++;
         }
         if(cadena.getFrase().substring(i,(i+1)).equalsIgnoreCase("u")){
         contVoc++;
         }
        }
    return contVoc;
    }
public void invertirFrase(Cadena cadena){
/*MÃ©todo invertirFrase(), deberÃ¡ invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".
*/
String str = cadena.getFrase();
		System.out.println(str);
		StringBuilder strb = new StringBuilder(str);
		str = strb.reverse().toString();
		System.out.println(str);
}
public void vecesRepetido(String letra, Cadena cadena){
/*
MÃ©todo vecesRepetido(String letra), recibirÃ¡ un carÃ¡cter ingresado
por el usuario y contabilizar cuÃ¡ntas veces se repite el carÃ¡cter en la
frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carÃ¡cter 'a' se repite 4
veces.
*/  
int cont =0;
    String frase = cadena.getFrase();
    for (int i = 0; i < cadena.getLongitud(); i++) {
        if (frase.substring(i,(i+1)).equals(letra)) {
            cont++;
        }

    }
    System.out.println("El carÃ¡cter "+ letra + " se repite "+ cont);
}

public void compararLong(String frase, Cadena cadena){
/*MÃ©todo compararLongitud(String frase), deberÃ¡ comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.
*/
    Scanner ingreso = new Scanner(System.in);
    System.out.println("Ingrese otra frase");
    String frase2 = ingreso.nextLine();
    int long2 = frase2.length();
    if (cadena.getLongitud()>long2) {
        System.out.println("La frase ingresada es mÃ¡s corta");    
    }else if(cadena.getLongitud()<long2){
    System.out.println("La frase ingresada es mÃ¡s larga");
    }
    else {
    System.out.println("La frase ingresada es mÃ¡s larga");
    }
} 


public void unirFrases(String frase, Cadena cadena){
/*MÃ©todo unirFrases(String frase), deberÃ¡ unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.
*/
    Scanner ingreso = new Scanner(System.in);
    System.out.println("Ingrese otra frase");
    String frase2 = ingreso.nextLine();
    System.out.println(cadena.getFrase()+frase2);
}
public void remplazar(String letra, Cadena cadena){
/*MÃ©todo reemplazar(String letra), deberÃ¡ reemplazar todas las letras
â€œaâ€� que se encuentren en la frase, por algÃºn otro carÃ¡cter
seleccionado por el usuario y mostrar la frase resultante.*/
    
    System.out.println(cadena.getFrase().replace("a", letra));
    
    
}

public boolean contiene(String letra, Cadena cadena){
/*MÃ©todo contiene(String letra), deberÃ¡ comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.*/
boolean resp=false;
    for (int i = 0; i < cadena.getLongitud(); i++) {
        if (cadena.getFrase().substring(i, (i+1)).equalsIgnoreCase(letra)) {
            resp= true;
            
        }else{
        resp= false;
        }
    }
    return resp;
}
    
}
