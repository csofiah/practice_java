package mitocode.java.se.hilos;

public class MainHilo {

    public static void main(String[] args) {
        Hilo hilo1 = new Hilo("Hilo1");
        hilo1.start();

        Hilo hilo2 = new Hilo("Hilo2");
        hilo2.start();
    }
}
