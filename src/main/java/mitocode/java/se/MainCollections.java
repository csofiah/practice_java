package mitocode.java.se;

import java.util.*;

public class MainCollections {
    public static void main(String[] args) {
       // arrayList();
        //linkedList();
        //hashmap();
        set();
    }

    //no permite valores repetidos, es decir , no da error pero hace un distinc de los valores
    //los valores no salen ordenados como se ingresan, salen aleatoriamente
    private static void set() {
        Set<String> lista = new HashSet<String>();
        lista.add("b");
        lista.add("a");
        lista.add("c");

        for (String dato: lista ) {
            System.out.println(dato);
        }
    }

    private static void hashmap(){
        HashMap diccionario = new HashMap();
        diccionario.put("user", "mitocode");
        diccionario.put("user2", "mitocode2");
        diccionario.put("user3", "mitocode3");

        String contenido = diccionario.get("user").toString();
        boolean resp = diccionario.containsKey("user2");

        System.out.println(contenido);
        System.out.println(resp);
    }

    //cada elemento tiene relacion con su proximo dato
    private static void linkedList() {
        List<Integer> lista = new LinkedList();
        //LinkedList lista2 = new LinkedList();
        lista.add(1);
        lista.add(2);
        //lista.add("Mitocode");

        System.out.println(lista.size());
        System.out.println(lista.size()-1);

        //utilizar ArrayList cuando tengan q acceder aleatoriamente a un elemento
        //Arraylist get: 1
        //LinkedList: 114  es mas lento porque tiene q recorrer toda la aplicacion

        //ArrayList = get
        //LinkedList = add/remove cuando se tengan muchas operaciones de agregar o remover elementos
    }

    private static void LiarrayList() {
        long inicio1 = System.currentTimeMillis();
        List<Integer> lista = new ArrayList<>();
        for (int i=0; i<1000000; i++)
            lista.add(i); //1 procesador 1 bloque
        long fin1 = System.currentTimeMillis();
        lista.add(2,20);
        System.out.println(fin1-inicio1);

        //al inicializar la capacidad inicial de arraylist reserva ese espacio de memoria
        //de una sola vez, es mas rapido
        long inicio2 = System.currentTimeMillis();
        List<Integer> lista2 = new ArrayList<>(1000000);
        for (int i=0; i<1000000; i++)
            lista.add(i); //1 procesador 1 bloque
        long fin2= System.currentTimeMillis();

        System.out.println(fin2-inicio2);


    }


}
