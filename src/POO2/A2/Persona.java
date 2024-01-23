package POO2.A2;

public class Persona {

    String dni;
    String nombre;
    String apellidos;
    int edad;

    public Persona(String id, String nom, String ape, int e) {
        this.dni = id;
        this.nombre = nom;
        this.apellidos = ape;
        this.edad = e;
    }

    public Persona(String nom, String ape, int e) {
        this.nombre = nom;
        this.apellidos = ape;
        this.edad = e;
    }

}
