package cat.mcgonzalc.buscadorgithubjava;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

// Clase principal
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del personaje
        System.out.print("Introduce el nombre de tu personaje: ");
        String nombre = scanner.nextLine();

        // Calcular las características del personaje
        PersonajeBuilder builder = new PersonajeConcretoBuilder();

        // Primero construimos las características
        builder.construirCaracteristicas();

        ArrayList<String> clasesAescoger = new ArrayList<>();
        builder.determinarClasesNoDisponible(clasesAescoger);

        StringBuilder clasesDisponibles = new StringBuilder();
        for (int i = 0; i < clasesAescoger.size(); i++)
        {
            clasesDisponibles.append(clasesAescoger.get(i)).append(", ");
        }

        clasesDisponibles.delete(clasesDisponibles.length() - 2, clasesDisponibles.length());

        boolean claseEscogidaDisponible = false;

        while (!claseEscogidaDisponible)
        {
            // Solicitar la clase del personaje
            System.out.print("Elige una clase (" + clasesDisponibles + "): ");
            String claseEscogida = scanner.nextLine();
            for (int i = 0; i < clasesAescoger.size(); i++)
            {
                if (claseEscogida.equalsIgnoreCase(clasesAescoger.get(i)))
                {
                    builder.elegirClase(claseEscogida);
                    claseEscogidaDisponible = true;
                }
            }
        }

        // Aplicar modificadores según la clase elegida
        //builder.aplicarModificadores();

        // Calcular los puntos de golpe
        builder.calcularPuntosGolpe();

        // Solicitar el alineamiento del personaje
        System.out.print("Elige un alineamiento (Legal, Neutral, Caótico): ");
        String alineamiento = scanner.nextLine();
        builder.elegirAlineamiento(alineamiento);

        // Asignar clase de armadura y nombre
        builder.apuntarClaseArmadura();
        builder.apuntarNombre(nombre);

        // Construir el personaje final
        Personaje personaje = builder.getPersonaje();
        System.out.println("\n" + personaje);
    }
}