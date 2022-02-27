package Ordenamiento2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        //Mostrar en consola los trs titulos mas vendidos.
        //ordenar copias

        books.add(new Book("El señor de los anillos", 150));
        books.add(new Book("Don quijote de la mancha", 150));
        books.add(new Book("Historia en las ciudades", 12000));
        books.add(new Book("el hobbit", 100));
        books.add(new Book("el principito", 140));


        //El Comparator me compara todos los elementos de la lista para ver cual es mayor
        Comparator <Book> comparatorCopies = Comparator.comparing( elementBook-> elementBook.getCopies());

        Comparator <Book> comparatorTitle = Comparator.comparing( elementBook-> elementBook.getTitle());

        books.stream()
                .sorted(comparatorCopies.reversed())
                .limit(3)
                .forEach( book -> System.out.println(book.getTitle()));
    }
}
