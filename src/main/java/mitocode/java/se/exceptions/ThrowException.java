package mitocode.java.se.exceptions;


public class ThrowException {

    private void metodo1(){
        try{
            metodo2();
        }catch(Exception e){
            System.out.println("metodo 1"  +e.getMessage());
        }
    }

    private void metodo2() throws Exception{
        try{
            metodo3();
        }catch(Exception e){
           throw  e;
        }
    }

    //throws + Clase
    //throw + instancia de un objeto
    private void metodo3() throws Exception{
        try{
            int division = 1/0;
        }catch(Exception e){
            //la palabra throw necesita de una instancia de objeto
            throw new Exception("enviando a metodo superior");
        }
    }

    private void lanzarException(){
        throw new ArithmeticException();

    }
    public static void main(String[] args) {
        ThrowException main = new ThrowException();
        main.metodo1();
        //main.lanzarException();
    }
}
