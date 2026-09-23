package main.java.com.biblioteca;

public class LibroTextoUNIAC extends LibroTexto {
    private String facultad;

    public LibroTextoUNIAC() {
        super();
        this.facultad = "";
    }

    public LibroTextoUNIAC(String titulo, String autor, int ejemplares, int prestados, String curso, String facultad) {
        super(titulo, autor, ejemplares, prestados, curso);
        this.facultad = facultad;
    }

    public String getFacultad() { return facultad; }
    public void setFacultad(String facultad) { this.facultad = facultad; }

    @Override
    public String toString() {
        return super.toString() + " - Facultad: " + facultad;
    }
}