import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];
        int pares = 0, impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un número: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) pares++;
            else impares++;
        }

        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
    }
}
