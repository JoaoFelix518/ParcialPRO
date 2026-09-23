package main.java.com.biblioteca;

public class LibroTexto extends Libro {
    private String curso;

    public LibroTexto() {
        super();
        this.curso = "";
    }

    public LibroTexto(String titulo, String autor, int ejemplares, int prestados, String curso) {
        super(titulo, autor, ejemplares, prestados);
        this.curso = curso;
    }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    @Override
    public String toString() {
        return super.toString() + " - Curso: " + curso;
    }
}