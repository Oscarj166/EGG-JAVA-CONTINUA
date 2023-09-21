/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores;

import autores.AutoresLibros.Libro;
import java.util.Scanner;

/**
 *
 * @author estar
 */
public class Autores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * private int ISBN;
    private int numeroPaginas;
    private String Autor;
    private String titulo;
         */
        System.out.println("Ingrese el numero de ISBN, el numero de paginas, el nombre del autor y el titulo del libro");
        
      Libro n1=new Libro(sc.nextInt(), sc.nextInt(), sc.nextLine(), "El plan");
        
        System.out.println("El nombre del autor es: "+ n1.getAutor()+" su nemero de ISBN: "+ n1.getISBN()+ " las paginas que contiene:" + n1.getNumeroPaginas()+ " paginas, y tiene por titulo ");
        System.out.println(n1.getTitulo()+"");
    }
    
}
