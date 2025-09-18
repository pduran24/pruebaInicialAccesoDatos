import java.util.ArrayList;
import java.util.Date;

public class Agenda {


    private ArrayList<Contacto> listaContactos = new ArrayList<>();


    public void aniadirContacto(String nombre, String telefono) {

        if (!listaContactos.isEmpty()) {
            for (Contacto contacto : listaContactos) {
                if (contacto.getTelefono().equalsIgnoreCase(telefono)) {
                    System.out.println("El contacto ya existe en la agenda.");
                }
                else {
                    Contacto c = new Contacto(nombre,telefono);
                    listaContactos.add(c);
                    System.out.println("\nContacto añadido correctamente.");
                }
            }
        }
        else {
            Contacto c = new Contacto(nombre,telefono);
            listaContactos.add(c);
            System.out.println("\nContacto añadido correctamente.");
        }

    }

    public void buscarContactoPorNombre(String nombre) {
        if (!listaContactos.isEmpty()) {
            for (Contacto c : listaContactos) {
                if (c.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println(c);
                    return;
                }
                else {
                    System.out.println("No existe dicho contacto en la agenda.");
                }
            }
        }
        else {
            System.out.println("No hay contactos en la agenda.");
        }
    }

    public void mostrarContactos() {
        if (!listaContactos.isEmpty()) {
            for (Contacto c : listaContactos) {
                System.out.println(c);
            }
        }
        else {
            System.out.println("No hay contactos en la agenda.");
        }
    }
}
