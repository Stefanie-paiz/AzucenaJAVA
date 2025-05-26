import java.util.Scanner;

public class JuegoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Juego juego = new Juego();
        juego.iniciar(sc);

        sc.close();
    }
}

// Clase Juego con dos niveles
class Juego {
    private int puntaje = 0;

    public void iniciar(Scanner sc) {
        nivel1(sc);
        nivel2(sc);

        System.out.println("\n--- Puntaje total acumulado ---");
        System.out.println("Puntaje final: " + puntaje);
    }

    private void nivel1(Scanner sc) {
        System.out.println("=== Nivel 1 ===");
        System.out.println("Pregunta: ¿Cuál es la capital de Francia?");
        System.out.print("Respuesta: ");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("París") || respuesta.equalsIgnoreCase("Paris")) {
            puntaje += 10;
            System.out.println("¡Correcto! +10 puntos.");
        } else {
            puntaje -= 5;
            System.out.println("Incorrecto. -5 puntos.");
        }
    }

    private void nivel2(Scanner sc) {
        System.out.println("\n=== Nivel 2 ===");

        String[] preguntas = {
            "¿Cuántos planetas hay en el sistema solar?",
            "¿Cuál es el resultado de 5 x 4?",
            "¿Qué animal es conocido como el rey de la selva?",
            "¿Cuál es el océano más grande del mundo?"
        };

        String[] respuestas = {
            "8", "20", "leon", "pacifico"
        };

        for (int i = 0; i < preguntas.length; i++) {
            System.out.println("Pregunta " + (i + 1) + ": " + preguntas[i]);
            System.out.print("Respuesta: ");
            String resp = sc.nextLine().toLowerCase();

            if (resp.equals(respuestas[i])) {
                puntaje += 20;
                System.out.println("¡Correcto! +20 puntos.");
            } else {
                puntaje -= 10;
                System.out.println("Incorrecto. -10 puntos.");
            }
        }
    }
}
