package mitocode.java.seava.genericos3_wildcard;

import java.util.ArrayList;
import java.util.List;

public class AppWild {

    public static void main(String[] args) {
        AppWild aw = new AppWild();

        Persona alumno = new Profesor("Mito");
        Alumno alumno2 = new Alumno("Code");
        Alumno alumno3 = new Alumno("Jaime");

        //que la lista reciba de tipo Persona
        List<Persona> lista = new ArrayList<>();
        lista.add(alumno);
        lista.add(alumno2);
        lista.add(alumno3);

        aw.listarUpperBounded(lista);
    }

   //va aceptar cualq tipo de datos q herede de Persona, subclase de la clase q indique
    public void listarUpperBounded(List<? extends Persona> lista){
        for(Persona per : lista){
                System.out.println(per.getNombre());
        }
    }

    //va aceptar cualq tipo de clase que son mayores que la clase alumno, q sean super clases de alumno
    public void listarLowerBounded(List<? super Alumno> lista){
        for(Object al : lista){
            System.out.println(((Persona)al).getNombre());
        }
    }

    public void listarUnBounded(List<?> lista){
        for(Object al : lista){
            System.out.println(((Alumno)al).getNombre());
        }
    }
}
