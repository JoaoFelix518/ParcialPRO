package main.java.com.biblioteca;

public class Novela extends Libro {
    private String tipo; // histórica, romántica, policíaca, realista, ciencia ficción, aventuras

    public Novela() {
        super();
        this.tipo = "";
    }

    public Novela(String titulo, String autor, int ejemplares, int prestados, String tipo) {
        super(titulo, autor, ejemplares, prestados);
        this.tipo = tipo;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        return super.toString() + " - Tipo de Novela: " + tipo;
    }
}