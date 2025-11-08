/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iteracionejemplo;

/**
 *
 * @author JHARE
 */
public class IteracionEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Ejemplo 1: Iteración con FOR
        System.out.println("CICLO FOR ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }

        // Ejemplo 2: Iteración con WHILE
        System.out.println("\nCICLO WHILE");
        int j = 1;
        while (j <= 5) {
            System.out.println("Número: " + j);
            j++;
        }

        // Ejemplo 3: Factorial usando iteración
        System.out.println("\n FACTORIAL ITERATIVO}");
        int numero = 5;
        int resultado = factorialIterativo(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);

    }

    // Función que calcula el factorial usando iteración
    public static int factorialIterativo(int n) {
        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
  }
    