package mitocode.java.se.arrays;

public class Main {

    //https://dcodingames.com/arreglos-bidimensionales-java/
    public static void main(String args[]) {
        int[] x= new int[25];
        System.out.println(x.length);


      //  int[][] arreglo = new int[5][4];

     /*   arrayIrregulares();
        inicializarArrays();
        leyendoDatosxFila();
        leyendoDatosxColumna();*/
    }

    private static void leyendoDatosxColumna() {
        int[][] arreglo = new int[5][4];
        int[][] auxiliar = new int[5][4];
      /*
        for (int i=0; i<auxiliar.length; i++){
            for (int j=0; j<auxiliar.length; j++){
                System.out.println("Escribe el elemento:["+i+", "+j+"] del arreglo: ");
                entrada = bufer.readLine();
                arreglo[j][i] = Integer.parseInt(entrada);
            }
        }*/
    }

    private static void leyendoDatosxFila() {
      /*  for (int i=0; i<auxiliar.length; i++){
            for (int j=0; j<auxiliar.length; j++){
                System.out.println("Escribe el elemento:["+i+", "+j+"] del arreglo:");
                entrada = bufer.readLine();
                arreglo[i][j] = Integer.parseInt(entrada);
            }
        }*/
    }

    private static void inicializarArrays() {
        int[][] matriz = { {1, 2}, {3, 4, 5}, {6, 7}, { 8, 9, 10, 11} };
    }

    private static void arrayIrregulares() {
        int[][] matriz = new int[4][];  // Sólo se indica el número de renglones, pero no el de columnas, porque será diferente en cada renglón.
        matriz[0] = new int[2]; // En el renglón 0, se construyen 2 columnas
        matriz[1] = new int[3]; // El renglón 1 contiene 3 columnas
        matriz[2] = new int[2]; // El renglón 2 contiene 2 columnas
        matriz[3] = new int[4]; // El renglón 3 contiene 4 columnas
    }


}
