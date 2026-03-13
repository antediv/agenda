import java.util.Scanner;
import java.time.LocalDate;

public class Agenda {
    public Persona[] lista = new Persona[10];
    public int total = 0;
    Scanner leer = new Scanner(System.in);

    public void registrarContacto() {
        if (total < 10) {
            System.out.println("Crear un nuevo contacto");
            System.out.print("Nombre: ");
            String nom = leer.nextLine();
            System.out.print("Sexo: ");
            String sex = leer.nextLine();
            System.out.print("Teléfono: ");
            String tel = leer.nextLine();
            System.out.print("Fecha de nacimiento (AAAA-MM-DD): ");
            String fechaTexto = leer.nextLine();
            LocalDate fechaNac = LocalDate.parse(fechaTexto);
            Persona persona = new Persona(nom, sex, fechaNac, tel);

            lista[total] = persona;
            total=total+1;
            System.out.println("Contacto guardado!");
        } else {
            System.out.println("La agenda esta llena");
        }
    }

    public void mostrarAgenda() {
        System.out.println("Contactos:");
        System.out.println(" ");
        for (int i = 0; i < total; i++) {
            System.out.println("Nombre: " + lista[i].getNombre() +
                    " | Tel: " + lista[i].getNumeroTelefono() +
                    " | Fecha: " + lista[i].getFechaDeNacimiento());

        }
    }

    public int buscar(String nombreBusca) {
        for (int i = 0; i < total; i++) {
            String nombreGuardado = lista[i].getNombre().toLowerCase();
            String nombreBuscado = nombreBusca.toLowerCase();
            if (nombreGuardado.equals(nombreBuscado)) {
                System.out.println("Nombre: " + lista[i].getNombre());
                System.out.println("Tel: " + lista[i].getNumeroTelefono());
                System.out.println("Sexo: " + lista[i].getSexo());
                System.out.println("Fecha: " + lista[i].getFechaDeNacimiento());
                return i;
            }
        }
        return -1;
    }

    public void actualizarContacto() {
        System.out.print("Ingresa el nombre del contacto a buscar:");
        String nom = leer.nextLine();
        int nombre = buscar(nom);

        if (nombre != -1) {
            System.out.print("Nuevo Teléfono: ");
            String nuevoTel = leer.nextLine();
            System.out.print("Fecha de nacimiento (AAAA-MM-DD): ");
            String nuevaFechaTexto = leer.nextLine();
            LocalDate fechaNac = LocalDate.parse(nuevaFechaTexto);
            lista[nombre].setNumeroTelefono(nuevoTel);
            lista[nombre].setFechaDeNacimiento(fechaNac);
            System.out.println("Datos actualizados correctamente!");
        } else {
            System.out.println("User no existe");
        }
    }

    public void eliminarContacto() {
        System.out.print("Nombre a borrar: ");
        String nom = leer.nextLine();
        int nombre = buscar(nom);

        if (nombre != -1) {
            lista[nombre] = lista[total - 1];
            lista[total - 1] = null;
            total=total-1;
            System.out.println("Borrado.");
        } else {
            System.out.println("No se encontró.");
        }
    }
}