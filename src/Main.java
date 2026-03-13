import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner leer = new Scanner(System.in);
        Agenda miAgenda = new Agenda();

        while (opcion != 6) {
            System.out.println("::: AGENDA UPEM :::");
            System.out.println("1. Registrar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Actualizar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Mostrar toda la agenda");
            System.out.println("6. Salir");
            System.out.print("Escoge una opcion: ");

            opcion = leer.nextInt();
            leer.nextLine();

            if (opcion == 1) {
                miAgenda.registrarContacto();
            }
            else if (opcion == 2) {
                System.out.print("Escribe el nombre: ");
                String nombre = leer.nextLine();
                int pos = miAgenda.buscar(nombre);

                if (pos == -1) {
                    System.out.println("No se encontro.");
                } else {
                    System.out.println("Contacto encontrado!");
                    System.out.println(" ");
                    System.out.println(" ");
                }
            }
            else if (opcion == 3) {
                miAgenda.actualizarContacto();
            }
            else if (opcion == 4) {
                miAgenda.eliminarContacto();
            }
            else if (opcion == 5) {
                miAgenda.mostrarAgenda();
            }
            else if (opcion == 6) {
                System.out.println("Adios!");
            }
            else {
                System.out.println("Esa opción no existe.");
            }
        }
    }
}