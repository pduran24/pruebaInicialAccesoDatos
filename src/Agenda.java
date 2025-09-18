import java.util.ArrayList;


public class Agenda {


    private ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();


    public void aniadirContacto(String nombre, String telefono) {

        if (!listaContactos.isEmpty()) {
            for (Contacto contacto : listaContactos) {
                if (contacto.getTelefono().equalsIgnoreCase(telefono) && contacto.getNombre().equalsIgnoreCase(nombre)) {
                    throw new ContactoYaExistenteException("El contacto ya existe en la agenda");
                }
            }
        }

        Contacto c = new Contacto(nombre,telefono);
        listaContactos.add(c);
        System.out.println("\nContacto añadido correctamente.");




    }

    public void buscarContactoPorNombre(String nombre) {
        Contacto concacto = null;
        if (!listaContactos.isEmpty()) {
            for (Contacto c : listaContactos) {
                if (c.getNombre().equalsIgnoreCase(nombre)) {
                    concacto = c;

                }
            }

            if (concacto==null)
                System.out.println("No existe dicho contacto en la agenda.");
            else
                System.out.println(concacto);

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
