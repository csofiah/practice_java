package mitocode.java.seava.genericos1;

public class Clase<T> {

    private T objeto;

    public Clase(T objeto){
        this.objeto = objeto;
    }

    public void mostrarTipo(){
        System.out.println("T es un objeto de : " + objeto.getClass().getName());
    }
}
