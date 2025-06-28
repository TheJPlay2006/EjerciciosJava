
/**
 *
 * @author Jairo Herrera
 */
import javax.swing.JOptionPane;

// Clase Calculadora
class Calculadora {
    
    // Método que realiza las operaciones usando switch
    public double calcular(double operando1, double operando2, char operacion) {
        double resultado = 0;
        
        switch (operacion) {
            case '+':
                resultado = operando1 + operando2;
                break;
            case '-':
                resultado = operando1 - operando2;
                break;
            case '*':
                resultado = operando1 * operando2;
                break;
            case '/':
                if (operando2 != 0) {
                    resultado = operando1 / operando2;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: División por cero no permitida", "Error", JOptionPane.ERROR_MESSAGE);
                    return Double.NaN; // Retorna NaN para indicar error
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error: Operación no válida. Use +, -, *, /", "Error", JOptionPane.ERROR_MESSAGE);
                return Double.NaN; // Retorna NaN para indicar error
        }
        
        return resultado;
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "CALCULADORA ELEMENTAL", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
        
        try {
            // Solicitar los dos operandos
            String inputOperando1 = JOptionPane.showInputDialog("Ingrese el primer número:");
            double operando1 = Double.parseDouble(inputOperando1);
            
            String inputOperando2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
            double operando2 = Double.parseDouble(inputOperando2);
            
            // Solicitar la operación
            String inputOperacion = JOptionPane.showInputDialog("Ingrese la operación (+, -, *, /):");
            char operacion = inputOperacion.charAt(0);
            
            // Crear instancia de la calculadora
            Calculadora calculadora = new Calculadora();
            
            // Realizar la operación
            double resultado = calculadora.calcular(operando1, operando2, operacion);
            
            // Mostrar el resultado si no hay error
            if (!Double.isNaN(resultado)) {
                String mensajeResultado = "=== RESULTADO ===\n" +
                                        operando1 + " " + operacion + " " + operando2 + " = " + resultado;
                JOptionPane.showMessageDialog(null, mensajeResultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese números válidos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar una operación", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}