package samtelTest.Q13;

public class Q13 {
    public static void main(String[] args) {
        metodo();
    }

    private static void metodo() {
       char c = 'c';
       try{
     //   int a = Integer.parseInt(c);  //no compila!!!
           System.out.println("el valor de la variable es "+ c);
       }catch(NumberFormatException e){
           System.out.println("error");
       }
    }
}
