/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laberintobacktraking;

/**
 *
 * @author JHARE
 */
public class LaberintoBacktraking {

    /**
     * @param args the command line arguments
     */
    
    
            // Movimientos: abajo, derecha, arriba, izquierda
    private static final int[][] MOVES = {
        {1, 0},   // abajo
        {0, 1},   // derecha
        {-1, 0},  // arriba
        {0, -1}   // izquierda
    };

    public static void main(String[] args) {

        int[][] laberinto = {
            {0, 1, 0, 0},
            {0, 0, 0, 1},
            {1, 0, 1, 0},
            {0, 0, 0, 0}
        };

        int n = laberinto.length;
        int[][] solucion = new int[n][n];

        if (resolverLaberinto(laberinto, 0, 0, solucion)) {
            System.out.println("Ruta encontrada:");
            imprimir(solucion);
        } else {
            System.out.println("No existe ruta.");
        }
    }

    // Función principal de backtracking
    public static boolean resolverLaberinto(int[][] maze, int x, int y, int[][] sol) {
        int n = maze.length;

        // Caso base: si llegamos al final
        if (x == n - 1 && y == n - 1 && maze[x][y] == 0) {
            sol[x][y] = 1;
            return true;
        }

        // Validar que estamos dentro del laberinto y en un camino
        if (esValido(maze, x, y)) {

            // Marcar este paso en la solución
            sol[x][y] = 1;

            // Probar los 4 movimientos posibles
            for (int[] move : MOVES) {
                int nuevoX = x + move[0];
                int nuevoY = y + move[1];

                if (resolverLaberinto(maze, nuevoX, nuevoY, sol)) {
                    return true;
                }
            }

            // BACKTRACK: si no funcionó, desmarcar
            sol[x][y] = 0;
        }

        return false;
    }

    // Verificar que la celda es válida
    public static boolean esValido(int[][] maze, int x, int y) {
        int n = maze.length;
        return (x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 0);
    }

    // Imprimir matriz
    public static void imprimir(int[][] mat) {
        for (int[] fila : mat) {
            for (int v : fila) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
    
