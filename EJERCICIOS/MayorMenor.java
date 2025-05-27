import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un número: ");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int num : numeros) {
            if (num > mayor) mayor = num;
            if (num < menor) menor = num;
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}
