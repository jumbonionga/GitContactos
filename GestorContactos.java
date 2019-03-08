import java.util.*;

public class GestorContactos {

	private static Scanner scan = new Scanner(System.in);
	private static List<Contacto> contactos = new ArrayList<>();

	public static void main(String[] args) {
		int opcion;
		do {
			System.out.print("\033[H\033[2J");
			System.out.flush();
			System.out.println("+-------- Gestor de contactos --------+");
			System.out.println("|                                     |");
			System.out.println("| Seleccione una opción:              |");
			System.out.println("| 1) Crear contacto                   |");
			System.out.println("| 2) Eliminar contacto                |");
			System.out.println("| 3) Mostrar todos los contactos      |");
			System.out.println("| 4) Filtrar por nombre               |");
			System.out.println("| 0) Salir                            |");
			System.out.println("|                                     |");
			System.out.println("+-------------------------------------+");
			opcion = scan.nextInt();
			switch (opcion) {
				case 1:
					//crearContacto();
					break;
				case 2:
					//eliminarContacto();
					break;
				case 3:
					mostrarTodos();
					break;
				case 4:
					mostrarFiltrados();
					break;
				case 0:
					System.out.println("\n\nBye ;)");
					return;
				default:
					System.err.println("Opción inválida\n\n\n");
			}
		} while(opcion != 0);
	}

	private static void crearContacto() {}

	private static void eliminarContacto() {}

	private static void mostrarTodos() {
		if (contactos.size() == 0) {
			System.out.println("No existen contactos para mostrar");
			return;
		}
		System.out.printf("%s %20s %20s %20s", "Nombre", "Apellido", "Fecha de Nacimiento", "Telefono");
		System.out.println();
		for (Contacto temp : contactos) {
			System.out.format("%s%20s%20s%20s", temp.getNombre(), temp.getApellido(), temp.getFechaNacimiento(), temp.getTelefono());
			System.out.println();
		}
	}

	private static void mostrarFiltrados() {}

}
