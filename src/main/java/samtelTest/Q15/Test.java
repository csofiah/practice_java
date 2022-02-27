package samtelTest.Q15;

public class Test extends Base {
    public Test(int j) {
    }

    public Test(int j, int k) {
        super(j, k);
    }

    public static void main(String[] args) {
        // Test t = new Test(); //no tiene constructor vacio
        Test t = new Test(1);
        Test t2 = new Test(1, 2);
        // Test t3 = new Test(1,2,3); //no es valida
        //   Test t4 =(new Base()).new Test(1);//no compila
    }

}
