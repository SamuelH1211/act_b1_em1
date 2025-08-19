package com.example;

public class Main {
    public static void main(String[] args) {

        // TODO: Crear método main para:
        // 1. Crear dos objetos Estudiante con diferentes valores
        Estudiante estudiante1 = new Estudiante("Ana", 20, 8.5);
        Estudiante estudiante2 = new Estudiante("Luis", 22, 9.0);

        // 2. Mostrar la información de ambos estudiantes
         estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        // 3. Modificar algún atributo usando un setter
        estudiante1.setPromedio(9.2);
        estudiante2.setPromedio(7.5);
        // 4. Mostrar la información actualizada
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();

        // TODO: Crear método main para:
        // 1. Crear un libro usando el constructor completo
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 20.0);
        // 2. Crear un libro usando el constructor con solo titulo y autor
        Libro libro2 = new Libro("1984", "George Orwell", 15.0);
        // 3. Mostrar información de ambos libros
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        // 4. Aplicar descuento usando ambas versiones del método
        libro1.aplicarDescuento(10); 
        libro2.aplicarDescuento(15); 
        // 5. Mostrar información actualizada de los libros
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}