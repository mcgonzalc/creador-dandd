package cat.mcgonzalc.buscadorgithubjava;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

// Clase principal
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del personaje
        System.out.print("Introduce el nombre de tu personaje: ");
        String nombre = scanner.nextLine();

        // Solicitar la clase del personaje
        System.out.print("Elige una clase (Guerrero, Clérigo, Ladrón, Mago): ");
        String clase = scanner.nextLine();

        // Solicitar el alineamiento del personaje
        System.out.print("Elige un alineamiento (Legal, Neutral, Caótico): ");
        String alineamiento = scanner.nextLine();

        // Crear personaje usando el patrón Builder
        PersonajeBuilder builder = new PersonajeConcretoBuilder();
        DirectorPersonaje director = new DirectorPersonaje(builder);

        Personaje personaje = director.construirPersonaje(nombre, clase, alineamiento);
        System.out.println("\n" + personaje);
    }
}