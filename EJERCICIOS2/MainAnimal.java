import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal miAnimal = new Animal();

        System.out.print("Ingrese el nombre del animal: ");
        miAnimal.setNombre(sc.nextLine());

        System.out.print("Ingrese el orden del animal: ");
        miAnimal.setOrden(sc.nextLine());

        System.out.print("Ingrese la cantidad de extremidades del animal: ");
        miAnimal.setExtremidades(sc.nextInt());

        
        System.out.println("\n--- Información del Animal ---");
        System.out.println("Nombre: " + miAnimal.getNombre());
        System.out.println("Orden: " + miAnimal.getOrden());
        System.out.println("Extremidades: " + miAnimal.getExtremidades());

        sc.close();
    }
}


class Animal {
    private String nombre;
    private String orden;
    private int extremidades;

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrden() {
        return orden;
    }
    public void setOrden(String orden) {
        this.orden = orden;
    }

    
    public int getExtremidades() {
        return extremidades;
    }
    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }
}
