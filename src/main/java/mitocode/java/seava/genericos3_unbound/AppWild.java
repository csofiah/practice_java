package mitocode.java.seava.genericos3_unbound;

import java.util.ArrayList;
import java.util.List;

public class AppWild {

    public static void main(String[] args) {
        AppWild aw = new AppWild();

        Alumno alumno = new Alumno("Mito");
        Alumno alumno2 = new Alumno("Code");
        Alumno alumno3 = new Alumno("Jaime");

        List<Alumno> lista = new ArrayList<>();
        lista.add(alumno);
        lista.add(alumno2);
        lista.add(alumno3);

        aw.listar(lista);
    }

    //extends hace referencia a herencia e implementaciones en concepto wildcard
    //wildcard unbound, va a recibir cualq objeto q herede de la clase object
    public void listar(List<? extends Object> lista){
        for(Object a : lista){
            if(a instanceof Alumno){
                System.out.println(((Alumno) a).getNombre());
            }else if(a instanceof Profesor){
                System.out.println(((Profesor) a).getNombre());
            }

        }
    }
}
