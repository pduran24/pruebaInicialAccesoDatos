import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda a = new Agenda();

        int opcion = 10;

        do {
            System.out.println("""
                \n
                
                --------AGENDA DE CONTACTOS---------

                1. Añadir contactos.
                2. Mostrar todos los contactos.
                3. Buscar contacto por nombre.
                4. Salir
                """);

            System.out.println("Introducir una opcion: ");
            opcion = Integer.parseInt(sc.next());


            switch (opcion) {
                case 1 -> {
                    System.out.println("Introducir el nombre del contacto: ");
                    String nombre = sc.next();
                    System.out.println("Introducir el telefono del contacto: ");
                    String telefono = sc.next();

                    a.aniadirContacto(nombre,telefono);
                }
                case 2 -> {
                    a.mostrarContactos();
                }
                case 3 -> {
                    System.out.println("Introducir el nombre del contacto a buscar: ");
                    String nombre = sc.next();
                    a.buscarContactoPorNombre(nombre);
                }
                case 4 -> {
                    System.out.println("Saliendo...");
                    sc.close();
                }
            }

        } while (opcion!=4);

    }
}