/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busquedabinaria;

import java.util.Scanner;
/**
 *
 * @author LAB-USR-AREQUIPA
 */

public class BusquedaBinaria {
    public static void main(String[] args) {
        // Arreglo ordenado (requisito para búsqueda binaria)
        int[] numeros = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa el número que deseas buscar: ");
            int buscado = sc.nextInt();
            
            int resultado = busquedaBinaria(numeros, buscado);
            
            if (resultado == -1) {
                System.out.println("El número " + buscado + " no se encuentra en la lista.");
            } else {
                System.out.println("El número " + buscado + " se encuentra en la posición: " + resultado);
            }
        }
    }
    
    // Método de búsqueda binaria
    public static int busquedaBinaria(int[] arreglo, int valor) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            
            if (arreglo[medio] == valor) {
                return medio; // encontrado
            }
            
            if (arreglo[medio] < valor) {
                inicio = medio + 1; // buscar en la mitad derecha
            } else {
                fin = medio - 1; // buscar en la mitad izquierda
            }
        }
        
        return -1; // no encontrado
    }
}
    


