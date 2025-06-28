
/**
 *
 * @author jh599
 */
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "SISTEMA DE ASIGNACIÓN DE NOTAS", "Evaluación de Examen", JOptionPane.INFORMATION_MESSAGE);
        
        // Solicitar la puntuación del examen del estudiante 
        String inputPuntuacion = JOptionPane.showInputDialog("Ingrese la puntuación del examen (0-100):");
        double puntuacion = Double.parseDouble(inputPuntuacion);
        
        // Variable para almacenar la nota
        String nota;
        
        // Asignar nota basada en la puntuación
        if (puntuacion >= 90) {
            nota = "Sobresaliente";
        } else if (puntuacion >= 80) {
            nota = "Notable";
        } else if (puntuacion >= 70) {
            nota = "Bien";
        } else {
            nota = "Insuficiente";
        }
        
        // Mostrar el resultado
        String resultado = "RESULTADO DE LA EVALUACIÓN\n" +
                          "Puntuación obtenida: " + puntuacion + "\n" +
                          "Calificación: " + nota;
        
        JOptionPane.showMessageDialog(null, resultado, "Calificación Final", JOptionPane.INFORMATION_MESSAGE);
    }
}