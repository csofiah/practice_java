package functional.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Coleccion
        List<User> users = new ArrayList<>();
        Stream<User> stream = users.stream(); //Abastraccion

        //Stream
        Stream<User> filter = stream.filter(user -> user.getAge() > 18);

        // Arreglos
        int[] numbers = {1,2,3,4};
        Stream numbersS = Stream.of(numbers);

        // Secuencia
        Stream names = Stream.of("codi 1" ,  "codi2" ,  "codi3");

    }
}
