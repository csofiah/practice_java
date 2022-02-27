package functional.encontrar_Elementos;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Conocer si un alumno posee por lo menos  una calificacion no aprobatoria.
        // la calificacion minima aprobatria es 6.

        List<Integer> calificaciones =  List.of(10, 10, 9, 6, 6, 5, 7, 8, 9 , 10);

        /*
        boolean aprobatoria =  calificaciones.stream()
                                        .filter(x -> x < 6).count() > 0;
        */
        boolean aprobatoria = calificaciones.stream()
                .anyMatch( x -> x < 6);
        System.out.println(aprobatoria);

    }
}
