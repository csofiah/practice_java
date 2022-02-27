package mitocode.java.seava.genericos1;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Clase<String> c = new Clase<>("Mito");
        Clase<Integer> i = new Clase<>(5);
        c.mostrarTipo();
        i.mostrarTipo();

        //typesafety valida que se use el tipo de dato
        //el operador diamante no es obligatorio indicar el tipo del lado derecho
        //no requiere q se haga casteo en genericos
        List<String> lista = new ArrayList<String>();
        lista.add("Mito");
        //lista.add(5);

        String[] array = new String[5];
        array[0] = "Mitocode";
       // array[1] = 1;

    }



}
