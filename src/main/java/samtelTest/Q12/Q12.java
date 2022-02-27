package samtelTest.Q12;

public class Q12 {
    public static void main(String[] args) {
        metodo();
    }

    private static void metodo() {
        int j = 2;
        switch (j){
            case 2:
                System.out.println("el valor es dos ");
            case 2 +1:
                System.out.println("el valor es tres");
                break;
            default:
                System.out.println("el valor es " + j);
                break;

        }
    }
}
