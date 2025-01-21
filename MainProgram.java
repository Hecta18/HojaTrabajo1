// MainProgram.java
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        IBlender blender = new Blender();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Prender la licuadora");
            System.out.println("2. Llenar la licuadora");
            System.out.println("3. Incrementar velocidad");
            System.out.println("4. Consultar velocidad actual");
            System.out.println("5. Consultar si está llena");
            System.out.println("6. Vaciar la licuadora");
            System.out.println("7. Apagar la licuadora y salir");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1 -> blender.turnOn();
                case 2 -> {
                    System.out.print("Ingrese el contenido: ");
                    String content = scanner.nextLine();
                    blender.fill(content);
                }
                case 3 -> blender.increaseSpeed();
                case 4 -> System.out.println("Velocidad actual: " + blender.getSpeed());
                case 5 -> System.out.println("¿Licuadora llena? " + (blender.isFilled() ? "Sí" : "No"));
                case 6 -> blender.empty();
                case 7 -> {
                    blender.turnOff();
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }
}
