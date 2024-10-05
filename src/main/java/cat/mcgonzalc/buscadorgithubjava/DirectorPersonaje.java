package cat.mcgonzalc.buscadorgithubjava;

class DirectorPersonaje {
    private PersonajeBuilder builder;

    public DirectorPersonaje(PersonajeBuilder builder) {
        this.builder = builder;
    }

    public Personaje construirPersonaje(String nombre, String clase, String alineamiento) {
        builder.construirCaracteristicas();
        builder.elegirClase(clase);
        builder.apuntarModificadores();
        builder.calcularPuntosGolpe();
        builder.elegirAlineamiento(alineamiento);
        builder.apuntarClaseArmadura();
        builder.apuntarNombre(nombre);
        return builder.getPersonaje();
    }
}
