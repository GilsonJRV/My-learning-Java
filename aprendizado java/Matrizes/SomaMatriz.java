/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticas;

/**
 *
 * @author gilson.valadares
 */
public class SomaMatriz {
    public static void main(String[] args) {
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        int[][] matriz2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1},
        };
        
        int[][] soma = new int[3][3];
        
        // Calcula a soma das matrizes
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        // Imprime a matriz resultante
        System.out.println("Soma das Matrizes:");
        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < soma[i].length; j++) {
                System.out.print(soma[i][j] + " "); 
            }
            System.out.println(); // Pula linha após cada linha da matriz
        }
    }
}