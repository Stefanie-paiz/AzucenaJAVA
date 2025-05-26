import java.util.Scanner;

public class MatrizInvertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] articulos = new String[3][3]; // 3x3 = 9 artículos

        for (int i = 0; i < articulos.length; i++) {
            for (int j = 0; j < articulos[i].length; j++) {
                System.out.print("Ingresa un artículo: ");
                articulos[i][j] = sc.nextLine();
            }
        }

        System.out.println("Matriz con filas invertidas:");
        for (int i = articulos.length - 1; i >= 0; i--) {
            for (int j = 0; j < articulos[i].length; j++) {
                System.out.print(articulos[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
