package mitocode.java.se.exceptions;

public class ExcepcionMain {

    public static void main(String[] args) {
        try {
            ExcepcionMain clase = new ExcepcionMain();
            clase.proceso1();
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
        System.out.println(e.getMessage());
        }
        finally {
            System.out.println("bloque finally");
        }


    }


    private void proceso1(){
        int a = 7, b = 0;
        int division = a/b;
        System.out.println(division);
    }


}
