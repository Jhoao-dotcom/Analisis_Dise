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

   // Método principal: donde comienza la ejecución del programa
    public static void main(String[] args) {

        // Declaramos un arreglo de enteros con algunos valores desordenados
        int[] numeros = {34, 12, 9, 56, 23, 87, 45, 16};

        // Mostramos los números antes de aplicar Quick Sort
        System.out.println("Antes de ordenar:");
        mostrarArreglo(numeros);

        // Llamamos al método quickSort indicando:
        // arreglo, índice inicial (0), e índice final (longitud - 1)
        quickSort(numeros, 0, numeros.length - 1);

        // Mostramos el arreglo ya ordenado
        System.out.println("\nDespués de ordenar:");
        mostrarArreglo(numeros);
    }

    // Método que aplica el algoritmo Quick Sort de forma recursiva
    public static void quickSort(int[] arreglo, int izquierda, int derecha) {

        // Condición base: si los índices se cruzan, ya no hay nada que ordenar
        if (izquierda < derecha) {

            // Obtenemos el índice donde el arreglo queda dividido (posición del pivote)
            int indiceParticion = particion(arreglo, izquierda, derecha);

            // Ordenamos la parte izquierda (elementos menores o iguales al pivote)
            quickSort(arreglo, izquierda, indiceParticion - 1);

            // Ordenamos la parte derecha (elementos mayores al pivote)
            quickSort(arreglo, indiceParticion + 1, derecha);
        }
    }

    // Método que realiza la partición del arreglo alrededor de un pivote
    private static int particion(int[] arreglo, int izquierda, int derecha) {

        // Elegimos el pivote (en este caso, el último elemento del subarreglo)
        int pivote = arreglo[derecha];

        // i marcará la frontera entre los menores y mayores que el pivote
        int i = izquierda - 1;

        // Recorremos el subarreglo desde la izquierda hasta antes del pivote
        for (int j = izquierda; j < derecha; j++) {

            // Si el elemento actual es menor o igual al pivote
            if (arreglo[j] <= pivote) {

                // Movemos la frontera de los menores hacia la derecha
                i++;

                // Intercambiamos arreglo[i] con arreglo[j]
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        // Al terminar el bucle, colocamos el pivote en su posición final (i + 1)
        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[derecha];
        arreglo[derecha] = temp;

        // Retornamos la posición donde quedó el pivote
        return i + 1;
    }

    // Método auxiliar que muestra los elementos del arreglo
    public static void mostrarArreglo(int[] arreglo) {

        // Recorremos cada elemento y lo imprimimos en la misma línea
        for (int num : arreglo) {
            System.out.print(num + " ");
        }

        // Hacemos un salto de línea al final para que la salida sea más ordenada
        System.out.println();
    }
}
