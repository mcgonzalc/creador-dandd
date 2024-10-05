package cat.mcgonzalc.buscadorgithubjava;

// Implementación concreta del Builder
class PersonajeConcretoBuilder implements PersonajeBuilder {
    private Personaje personaje;

    public PersonajeConcretoBuilder() {
        this.personaje = new Personaje();
    }

    @Override
    public void construirCaracteristicas() {
        personaje.setFuerza((int) (Math.random() * 16) + 3); // Tirada 3d6
        personaje.setDestreza((int) (Math.random() * 16) + 3); // Tirada 3d6
        personaje.setConstitucion((int) (Math.random() * 16) + 3); // Tirada 3d6
        personaje.setInteligencia((int) (Math.random() * 16) + 3); // Tirada 3d6
        personaje.setSabiduria((int) (Math.random() * 16) + 3); // Tirada 3d6
        personaje.setCarisma((int) (Math.random() * 16) + 3); // Tirada 3d6
    }

    @Override
    public void elegirClase(String clase) {
        personaje.setClase(clase); // Se elige la clase desde la entrada del usuario
    }

    @Override
    public void apuntarModificadores() {
        // Aquí se podría aplicar la lógica para sumar o restar modificadores según clase
    }

    @Override
    public void calcularPuntosGolpe() {
        // Según la clase del personaje, se asigna el dado adecuado para calcular los puntos de golpe
        switch(personaje.getClase().toLowerCase()) {
            case "guerrero":
                personaje.setPuntosGolpe((int) (Math.random() * 8) + 1); // Tirada d8
                break;
            case "clerigo":
                personaje.setPuntosGolpe((int) (Math.random() * 6) + 1); // Tirada d6
                break;
            case "ladrón":
                personaje.setPuntosGolpe((int) (Math.random() * 4) + 1); // Tirada d4
                break;
            case "mago":
                personaje.setPuntosGolpe((int) (Math.random() * 4) + 1); // Tirada d4
                break;
            default:
                personaje.setPuntosGolpe(1); // Default si no es una clase conocida
        }
    }

    @Override
    public void elegirAlineamiento(String alineamiento) {
        personaje.setAlineamiento(alineamiento); // Se elige el alineamiento desde la entrada del usuario
    }

    @Override
    public void apuntarClaseArmadura() {
        personaje.setClaseArmadura(15); // Valor básico para el personaje, puede cambiar con equipo
    }

    @Override
    public void apuntarNombre(String nombre) {
        personaje.setNombre(nombre);
    }

    @Override
    public Personaje getPersonaje() {
        return this.personaje;
    }
}