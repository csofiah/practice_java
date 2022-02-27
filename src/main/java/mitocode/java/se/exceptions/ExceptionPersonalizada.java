package mitocode.java.se.exceptions;

import java.util.Scanner;

public class ExceptionPersonalizada {

    public static void main(String[] args) {
        ExceptionPersonalizada ep = new ExceptionPersonalizada();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        final int EDAD_MAXIMA = 100;

        try {
            if(edad < EDAD_MAXIMA){
                System.out.println("bienvenido");
            }else{
                throw new EdadExcepcion("edad no permitida");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
