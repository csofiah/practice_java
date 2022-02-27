package forEach;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Obtener el cuadrado de todos los numeos de la lista

        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);

        numeros.stream()
                .forEach(num -> {
                    int resultado = num * num;
                    System.out.println(resultado);
                });


    }
}
