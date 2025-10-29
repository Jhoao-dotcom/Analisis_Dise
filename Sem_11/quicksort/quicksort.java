/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort;

/**
 *
 * @author JHARE
 */
public class quicksort {

    public static void main(String[] args) {
        int[] numeros = {34, 12, 9, 56, 23, 87, 45, 16};

        System.out.println("Antes de ordenar:");
        mostrarArreglo(numeros);

        quickSort(numeros, 0, numeros.length - 1);

        System.out.println("\nDespués de ordenar:");
        mostrarArreglo(numeros);
    }

    public static void quickSort(int[] arreglo, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(arreglo, izquierda, derecha);
            quickSort(arreglo, izquierda, indiceParticion - 1);
            quickSort(arreglo, indiceParticion + 1, derecha);
        }
    }

    private static int particion(int[] arreglo, int izquierda, int derecha) {
        int pivote = arreglo[derecha]; // Tomamos el último como pivote
        int i = izquierda - 1;

        for (int j = izquierda; j < derecha; j++) {
            if (arreglo[j] <= pivote) {
                i++;
                // Intercambiamos
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        // Movemos el pivote a su posición correcta
        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[derecha];
        arreglo[derecha] = temp;

        return i + 1; // Devolvemos la posición del pivote
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}