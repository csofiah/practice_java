package encontrar_Elementos2;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Obtener el nombre de un usuario que tenga un edad igual a 25

        List<User> users = new ArrayList<>();

        users.add(new User("Rafael", 30));
        users.add(new User("Daniel", 20));
        users.add(new User("Tatiana", 15));
        users.add(new User("Luisa", 24));
        users.add(new User("Rauuuulll", 21));

        User userDefault = new User("Sin nombre", 25);

        User nombre  = users.stream().filter(user -> user.getAge() == 25 )
                .findAny()
                .orElse(userDefault); //.get      orElse es mejor que get ya que nos permite controlar  que falle

        System.out.println(nombre.getUsername());

    }
}
