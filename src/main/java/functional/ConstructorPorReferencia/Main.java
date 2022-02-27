package functional.ConstructorPorReferencia;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Referencia a un constructor.

        //Generar nuevos usuarios e imprimir sus nombres en consola.

        List<User> users = new ArrayList<>();
        IUser iUser = User::new;


        User user1 =  iUser.create("codi1", 1);
        User user2 =  iUser.create("codi2", 2);
        User user3 = iUser.create("codi3", 3);
        User user4 = iUser.create("codi4", 4);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        users.stream().map(User::getUsername).forEach( System.out::println );

    }
}
