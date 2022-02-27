package Elementos_Unicos;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Imprimir en consola todos lo nombres uncios de la lista"
        List <String> names = List.of("codi2","codi1" , "codi3", "codi1", "codi3");

        names.stream().distinct().forEach( elemento -> System.out.println(elemento));

    }
}
