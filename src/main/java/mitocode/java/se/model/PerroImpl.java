package mitocode.java.se.model;

import mitocode.java.se.interfaces.IAnimal;
import mitocode.java.se.interfaces.SerVivo;

public class PerroImpl implements IAnimal, SerVivo {
    @Override
    public void mostrarTipoDeAnimal() {
        System.out.println("soy un mamifero, perro");
    }

    @Override
    public String mostrarNombre() {
        return "Kaiser";
    }

    @Override
    public void mostrarVida() {
        System.out.println("estoy vivo");
    }
}
