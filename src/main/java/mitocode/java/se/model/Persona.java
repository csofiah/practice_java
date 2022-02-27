package mitocode.java.se.model;


public class Persona {

    private int id;
    private String nombre;
    private int edad;

    public void mostrarDeInstancia(){
        System.out.println(this.nombre + ", "+ this.edad);
    }

    public static void mostrarDeClase(){
        System.out.println("metodo estatico");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
