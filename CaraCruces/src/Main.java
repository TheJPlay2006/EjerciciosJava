
/**
 *
 * @author jh599
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("JUEGO DE CARAS Y CRUCES");
        System.out.println("Presiona Enter para lanzar el dado virtual");
        
        boolean continuar = true;
        while (continuar) {
            scanner.nextLine(); // Esperar Enter para continuar con el dado
            
            // Generar número aleatorio entre 1 y 6
            int aleatorio = (int)(Math.random() * 6) + 1;
            
            System.out.println("Resultado del dado: " + aleatorio);
            
            if (aleatorio == 1 || aleatorio == 2) {
                System.out.println("¡Muévete 1 posición!");
            } else if (aleatorio == 3 || aleatorio == 4) {
                System.out.println("¡Muévete 2 posiciones!");
            } else { boolean name = aleatorio == 5 || aleatorio == 6;
                System.out.println("¡Espera tu turno!");
            }
            
            System.out.print("¿Quieres lanzar nuevamente? (S/N): ");
            String respuesta = scanner.nextLine();
            continuar = respuesta.equalsIgnoreCase("s");
        }
        
        System.out.println("¡Gracias por jugar!");
        scanner.close();
    }
}