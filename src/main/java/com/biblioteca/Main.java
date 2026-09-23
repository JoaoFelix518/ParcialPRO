package main.java.com.biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CREACIÓN DE OBJETOS ===");

        // 1. Objeto libro1 con constructor con parámetros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 5, 2);

        // 2. Objeto libro2 usando constructor por defecto y pidiendo datos por consola
        Libro libro2 = new Libro();
        System.out.println("\n--- Ingrese datos para libro2 ---");
        System.out.print("Título: ");
        libro2.setTitulo(sc.nextLine());
        System.out.print("Autor: ");
        libro2.setAutor(sc.nextLine());
        System.out.print("Número de ejemplares: ");
        libro2.setEjemplares(Integer.parseInt(sc.nextLine()));
        System.out.print("Número de ejemplares prestados: ");
        libro2.setPrestados(Integer.parseInt(sc.nextLine()));

        // 3. Objeto libroTextoUNIAC con todos sus atributos
        LibroTextoUNIAC libroUNIAC = new LibroTextoUNIAC(
            "Estructuras de Datos", "Pérez M.", 10, 4, "Programación II", "Ingeniería"
        );

        // 4. Objeto novela indicando su tipo
        Novela novela = new Novela("Dune", "Frank Herbert", 3, 3, "Ciencia Ficción");

        // Mostrar información inicial
        System.out.println("\n=== ESTADO INICIAL DE LOS LIBROS ===");
        System.out.println("1. " + libro1);
        System.out.println("2. " + libro2);
        System.out.println("3. " + libroUNIAC);
        System.out.println("4. " + novela);

        // Pruebas de Préstamo y Devolución
        System.out.println("\n=== PRUEBAS DE PRÉSTAMO Y DEVOLUCIÓN ===");
        
        System.out.println("\n* Intentando prestar libro1:");
        if (libro1.prestamo()) {
            System.out.println("Préstamo exitoso. Nuevo estado: " + libro1);
        } else {
            System.out.println("No hay ejemplares disponibles.");
        }

        System.out.println("\n* Intentando prestar novela (ejemplares todos prestados):");
        if (novela.prestamo()) {
            System.out.println("Préstamo exitoso.");
        } else {
            System.out.println("No se pudo prestar. No quedan ejemplares disponibles.");
        }

        System.out.println("\n* Intentando devolver una novela:");
        if (novela.devolucion()) {
            System.out.println("Devolución exitosa. Nuevo estado: " + novela);
        } else {
            System.out.println("No se puede devolver, no tiene préstamos activos.");
        }

        sc.close();
    }
}
