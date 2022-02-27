package Listas;

import tiposDeMetodos.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Obtener todos los usuarios que tengan una edad mayor a 18.

        List<tiposDeMetodos.User> users = new ArrayList<>();
        users.add(new tiposDeMetodos.User("Rafael", 25));
        users.add(new tiposDeMetodos.User("Daniel", 20));
        users.add(new tiposDeMetodos.User("Tatiana", 15));
        users.add(new tiposDeMetodos.User("Luisa", 24));
        users.add(new Listas.User("Rauuuulll", 21));

        List<Listas.User> newUsers = users.stream().filter(user -> user.getAge() > 18).collect(Collectors.toList() );

        System.out.println(newUsers);

    }
}
