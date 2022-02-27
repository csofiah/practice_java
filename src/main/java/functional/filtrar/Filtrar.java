package filtrar;

import java.util.ArrayList;
import java.util.List;

public class Filtrar {

    public static void main(String[] args) {
        // Main
        // Obtener la cantidad de ususarios con una edad mayor a 18  y que su username comience con la R mayuscula.

        List<User> users = new ArrayList<>();
        users.add(new User("Rafael", 25));
        users.add(new User("Daniel", 20));
        users.add(new User("Tatiana", 15));
        users.add(new User("Luisa", 24));
        users.add(new User("Rauuuulll", 21));

        long cantidad = users.stream().count();

        long cantidad2 = users.stream()
                .filter( user -> user.getAge() > 18)
                .filter( user -> user.getUsername().startsWith("R"))
                .count();

        System.out.println(cantidad2);
    }
}
