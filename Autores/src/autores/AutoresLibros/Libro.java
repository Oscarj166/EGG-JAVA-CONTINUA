/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.AutoresLibros;

/**
 *
 * @author estar
 */
public class Libro {
    private int ISBN;
    private int numeroPaginas;
    private String Autor;
    private String titulo;
   
    
    public Libro() {
    
}

    public Libro(int ISBN, int numeroPaginas, String Autor, String titulo) {
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
        this.Autor = Autor;
        this.titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
