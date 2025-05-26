import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un número: ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;
        System.out.println("Promedio: " + promedio);
    }
}

