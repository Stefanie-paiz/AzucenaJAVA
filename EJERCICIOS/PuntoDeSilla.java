import java.util.Scanner;

public class PuntoDeSilla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        System.out.println("Ingresa los valores de la matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor en [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean encontrado = false;
        for (int i = 0; i < 3; i++) {
            int minCol = 0;
            for (int j = 1; j < 4; j++) {
                if (matriz[i][j] < matriz[i][minCol]) {
                    minCol = j;
                }
            }

            boolean esPuntoSilla = true;
            for (int k = 0; k < 3; k++) {
                if (matriz[k][minCol] > matriz[i][minCol]) {
                    esPuntoSilla = false;
                    break;
                }
            }

            if (esPuntoSilla) {
                System.out.println("Punto de silla encontrado en [" + i + "][" + minCol + "] = " + matriz[i][minCol]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún punto de silla.");
        }
    }
}
