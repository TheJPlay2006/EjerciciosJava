/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Jairo Herrera
 */
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "CÁLCULO DE COSTO TOTAL DE VEHÍCULO", "Sistema de Vehículos", JOptionPane.INFORMATION_MESSAGE);
        
        // Solicitar datos del vehículo
        String inputPasajeros = JOptionPane.showInputDialog("Ingrese la cantidad de pasajeros:");
        int pasajeros = Integer.parseInt(inputPasajeros);
        
        String inputEjes = JOptionPane.showInputDialog("Ingrese el número de ejes:");
        int ejes = Integer.parseInt(inputEjes);
        
        String inputCosto = JOptionPane.showInputDialog("Ingrese el costo del vehículo:");
        double costoVehiculo = Double.parseDouble(inputCosto);
        
        // Calcular impuesto base (1% del costo)
        double impuestoBase = costoVehiculo * 0.01;
        double montoImpuesto = impuestoBase;
        
        // Incremento por cantidad de pasajeros
        if (pasajeros < 20) {
            montoImpuesto += impuestoBase * 0.01;
        } else if (pasajeros >= 20 && pasajeros <= 60) {
            montoImpuesto += impuestoBase * 0.05;
        } else { // pasajeros > 60
            montoImpuesto += impuestoBase * 0.08;
        }
        
        // Incremento por número de ejes
        if (ejes == 2) {
            montoImpuesto += impuestoBase * 0.05;
        } else if (ejes == 3) {
            montoImpuesto += impuestoBase * 0.10;
        } else if (ejes > 3) {
            montoImpuesto += impuestoBase * 0.15;
        }
        
        // Calcular costo total
        double costoTotal = costoVehiculo + montoImpuesto;
        
        // Mostrar resultados
        String resultado = "=== RESUMEN DEL CÁLCULO ===\n" +
                          "Costo del vehículo: $" + String.format("%.2f", costoVehiculo) + "\n" +
                          "Impuesto base (1%): $" + String.format("%.2f", impuestoBase) + "\n" +
                          "Impuesto total: $" + String.format("%.2f", montoImpuesto) + "\n" +
                          "COSTO TOTAL: $" + String.format("%.2f", costoTotal);
        
        JOptionPane.showMessageDialog(null, resultado, "Resultado del Cálculo", JOptionPane.INFORMATION_MESSAGE);
    }
}