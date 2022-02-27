package reduccionDeElementos;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Obtener la suma de todos lo elementos

        int result = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).reduce(0, (acumulador, elemento) -> acumulador + elemento);

        int result2 = (int) Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).count();

        System.out.println(result);

        System.out.println(result2);



        String lenguajes = Stream.of("Java", "C", "Python", "Ruby").reduce("", (acumulador, lenguaje) ->  acumulador + lenguaje);

        System.out.println(lenguajes);



    }
}
