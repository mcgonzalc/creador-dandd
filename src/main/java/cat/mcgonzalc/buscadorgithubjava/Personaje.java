package cat.mcgonzalc.buscadorgithubjava;

// Clase que representa el Personaje
class Personaje {
    private String nombre;
    private String clase;
    private int fuerza;
    private int destreza;
    private int constitucion;
    private int inteligencia;
    private int sabiduria;
    private int carisma;
    private int puntosGolpe;
    private String alineamiento;
    private int claseArmadura;

    // Getters y setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setClase(String clase) { this.clase = clase; }
    public String getClase()
    {
        return clase;
    }
    public void setFuerza(int fuerza) { this.fuerza = fuerza; }
    public int getFuerza(){
        return fuerza;
    }
    public void setDestreza(int destreza) { this.destreza = destreza; }
    public int getDestreza(){
        return destreza;
    }
    public void setConstitucion(int constitucion) { this.constitucion = constitucion; }
    public int getConstitucion() { return constitucion; }
    public void setInteligencia(int inteligencia) { this.inteligencia = inteligencia; }
    public int getInteligencia() { return inteligencia; }
    public void setSabiduria(int sabiduria) { this.sabiduria = sabiduria; }
    public int getSabiduria() { return sabiduria; }
    public void setCarisma(int carisma) { this.carisma = carisma; }
    public int getCarisma() { return carisma; }
    public void setPuntosGolpe(int puntosGolpe) { this.puntosGolpe = puntosGolpe; }
    public int getPuntosGolpe() { return puntosGolpe; }
    public void setAlineamiento(String alineamiento) { this.alineamiento = alineamiento; }
    public String getAlineamiento() { return alineamiento; }
    public void setClaseArmadura(int claseArmadura) { this.claseArmadura = claseArmadura; }
    public int getClaseArmadura() { return claseArmadura; }

    @Override
    public String toString() {
        return "Personaje: " + nombre + "\nClase: " + clase + "\nFuerza: " + fuerza + "\nDestreza: " + destreza +
                "\nConstitución: " + constitucion + "\nInteligencia: " + inteligencia + "\nSabiduría: " + sabiduria +
                "\nCarisma: " + carisma + "\nPuntos de golpe: " + puntosGolpe + "\nAlineamiento: " + alineamiento +
                "\nClase de Armadura: " + claseArmadura;
    }
}