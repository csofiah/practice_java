package Ordenamiento;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Imprimir en consola todos lo nombres uncios de la lista"
            List <Integer> numbers = List.of( 1,4,6,8,9,2,4,6,7,8,10,1,2,3 );

        List <Integer> result = numbers.stream()
                .sorted(Comparator.reverseOrder()).distinct()
                .collect(Collectors.toList());



        System.out.println(result);

    }
}
