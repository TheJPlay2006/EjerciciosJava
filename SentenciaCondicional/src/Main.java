
/**
 *
 * @author Jairo Herrera
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        if (numero > 0) {
            System.out.print("El número " + numero + " es positivo");
        } else if (numero < 0) {
            System.out.print("El número " + numero + " es negativo");
        } else {
            System.out.print("El número es cero");
        }
      
        if (numero % 5 == 0) {
            System.out.println(" y es divisible entre 5.");
        } else {
            System.out.println(" y no es divisible entre 5.");
        }
        
        scanner.close();
    }
}