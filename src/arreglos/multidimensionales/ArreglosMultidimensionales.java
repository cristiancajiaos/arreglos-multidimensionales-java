package arreglos.multidimensionales;

public class ArreglosMultidimensionales {

    public static void main(String[] args) {
        // Matriz de ceros 
        /*
        int[][] numeros = new int[3][3];
        int i, j; // i = filas, j = columnas
        
        // Recorrer filas
        for (i = 0; i < numeros.length; i++) {
            System.out.println();
            // Recorrer columnas
            for (j = 0; j < numeros.length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
        }
        */
        
        int[][] matriz = new int[4][4];
        matriz[0][0] = 4;
        matriz[0][1] = 3;
        matriz[1][0] = 7;
        matriz[1][1] = 6;
        int fila, columna; 
        
        // Recorrer filas
        for (fila = 0; fila < matriz.length; fila++) {
            System.out.println("");
            for (columna = 0; columna < matriz.length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
        }

    }

}
