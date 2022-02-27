package tiposDeMetodos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Procesos {

    public static void main(String[] args) {
        // Main
        // Obtener la cantidad de ususarios con una edad mayor a 18  y que su username comience con la R mayuscula.

        List<User> users = new ArrayList<>();
        users.add(new User("Rafael", 25));
        users.add(new User("Daniel", 20));
        users.add(new User("Tatiana", 15));
        users.add(new User("Luisa", 24));
        users.add(new User("Rauuuulll", 21));


        //Proceso
        //Iteracion interna

        //Retornan nuevo stream
        //Retornan un valor en contreto
        //Retornan un nuevo stream
        Stream<User> stream = users.stream();

        //Filter -> Abstraccion -> Nuevo Stream
        System.out.println(stream.filter(user -> user.getAge() > 18).count());

    }
}
