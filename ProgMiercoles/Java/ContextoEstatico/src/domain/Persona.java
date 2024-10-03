package domain;

public class Persona {
    private int idPersona;
    private static int contadorPersona;
    private String nombre;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
        Persona.contadorPersona++;
        this.idPersona = Persona.contadorPersona;
    }

    // Getters y Setters
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int contadorPersona) {
        Persona.contadorPersona = contadorPersona;
    }

    // Sobrescribimos el método toString para imprimir los detalles del objeto
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre='" + nombre + '\'' + '}';
    }
}
