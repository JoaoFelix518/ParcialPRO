package main.java.com.biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    // Constructor por defecto
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.ejemplares = 0;
        this.prestados = 0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    // Métodos Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getEjemplares() { return ejemplares; }
    public void setEjemplares(int ejemplares) { this.ejemplares = ejemplares; }

    public int getPrestados() { return prestados; }
    public void setPrestados(int prestados) { this.prestados = prestados; }

    // Método préstamo
    public boolean prestamo() {
        if (ejemplares - prestados > 0) {
            prestados++;
            return true;
        }
        return false;
    }

    // Método devolución
    public boolean devolucion() {
        if (prestados > 0) {
            prestados--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Libro [Título: " + titulo + ", Autor: " + autor + 
               ", Ejemplares: " + ejemplares + ", Prestados: " + prestados + 
               ", Disponibles: " + (ejemplares - prestados) + "]";
    }
}