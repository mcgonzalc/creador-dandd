package cat.mcgonzalc.buscadorgithubjava;

import java.util.ArrayList;

// Interfaz del Builder
interface PersonajeBuilder {
    void construirCaracteristicas(); // Paso 1: Tira 3d6 por característica y multiplica por 10
    void determinarClasesNoDisponible(ArrayList<String> clase);
    void elegirClase(String clase);  // Paso 2: Selección de clase según la entrada del usuario
    //void aplicarModificadoresClase(); // Modificadores de características según la clase
    //void aplicarModificadoresAlineamiento(String alineamiento); // Modificadores de características según alineamiento
    void calcularPuntosGolpe();      // Paso 5 y 6: Puntos de golpe según clase y constitución
    void elegirAlineamiento(String alineamiento); // Paso 8: Elegir alineamiento según la entrada del usuario
    void apuntarClaseArmadura();     // Paso 11: Definir CA según equipo y destreza
    void apuntarNombre(String nombre); // Paso 13: Asignar nombre
    Personaje getPersonaje();
}
