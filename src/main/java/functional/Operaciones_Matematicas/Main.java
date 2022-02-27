package Operaciones_Matematicas;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);

       //sum
        System.out.println("Suma de la lista:");
        int suma = numeros.stream().mapToInt(n -> n).sum();
        System.out.println(suma);

       //average
        System.out.println("Promedio de la lista:");
        double promedio = numeros.stream().mapToInt(n->n).average().orElse(0);
        System.out.println(promedio);

        //min
        System.out.println("El valor mas pequeño  de la lista:");
        int menor = numeros.stream().mapToInt(n -> n).min().getAsInt();
        System.out.println(menor);

        //max
        System.out.println("El valor mas grande  de la lista:");
        int mayor = numeros.stream().mapToInt(n -> n).max().getAsInt();
        System.out.println(mayor);

    }
}
