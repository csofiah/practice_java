package mitocode.java.se;

import mitocode.java.se.model.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CursoSE {
    public static void main(String[] args) {
        //herencia();
       //polimorfismo();
       // metodoEstaticoyClase();
        //interfaz();
        //iterator();


    }

    private static void iterator() {

        Persona p = new Persona();
        p.setNombre("mito1");
        p.setEdad(24);

        Persona p2 = new Persona();
        p2.setNombre("mito2");
        p2.setEdad(24);

        Persona p3 = new Persona();
        p3.setNombre("mito3");
        p3.setEdad(24);

        List<Persona> personas = new ArrayList<>();
        personas.add(p);
        personas.add(p2);
        personas.add(p3);

        //Interfaz i = new Class()
        List<String> lista = new ArrayList<>();
        lista.add("Mito");
        lista.add("Code");
        lista.add("mitocode");

//        for (String nombre : lista){
//            System.out.println(nombre);
//        }

        Iterator<String> iterador = lista.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
        System.out.println("--------------");


        Iterator<Persona> iteradorP = personas.iterator();
        while(iteradorP.hasNext()){
            System.out.println(iteradorP.next().getNombre());
        }

        for (Persona per: personas){
            System.out.println(per.getEdad());
        }
    }

    //la clase abstracta obliga a heredar de una clase particular,
    // solo podrian usar las cosas q estan definidas  en esa clase
    //interfaces  pueden implementar varias interfaces en una clase, es simular la herencia multiple
    //recibir atributos de varias clases en paralelo
    private static void interfaz() {
        PerroImpl p = new PerroImpl();
        p.mostrarTipoDeAnimal();

        String nombre = p.mostrarNombre();
        System.out.println(nombre);
        p.mostrarVida();
    }

    private static void metodoEstaticoyClase() {
       //metodos de instancia, a traves de un objeto de una clase
        Persona p = new Persona();
        p.setEdad(24);
        p.setNombre("mitocode");
        p.mostrarDeInstancia();

        //metodos de clase, con la palabra static, puede ser accedido sin un objeto sino Clase.metodoestatico
        Persona.mostrarDeClase();
    }

    //encapsular es ocultar como esta implementado cada metodo, solo utilizarlo

    //se debe declarar la clase padre como abstract y luego en las clases hijas deben sobreescribir
    //los metodos
    //tener comportamientos distintos dependiendo del tipo de instancias
    private static void polimorfismo() {
        Animal a = new Perro("Kaiser","carnivoro",3,"Pastor Aleman");
        a.alimentarse();

        Animal c = new Caballo();
        c.alimentarse();
    }

    //herencia
    //si se define un constructor con parametros en la clase padre
    //es obligatorio que las clases hijas definan constructor
    public static void herencia(){

        Perro p = new Perro("Kaiser","carnivoro",3,"Pastor Aleman");

        p.mostrar();

    }
}
