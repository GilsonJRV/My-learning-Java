/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticas;

/**
 * Classe que demonstra a soma de todos os elementos de uma matriz
 * @author gilson.valadares
 */
public class MT2 {
    public static void main(String[] args) {
        // Declaração e inicialização de uma matriz 3x3 com valores pré-definidos
        int[][] matriz = {
            {1, 2, 3},    // Primeira linha
            {4, 5, 6},    // Segunda linha
            {7, 8, 9},    // Terceira linha
        };
        
        // Variável para armazenar a soma dos elementos, inicializada com 0
        int soma = 0;
        
        // Loop externo: percorre as linhas da matriz
        // matriz.length retorna o número de linhas (3 neste caso)
        for (int i = 0; i < matriz.length; i++) {
            
            // Loop interno: percorre as colunas da linha atual
            // matriz[i].length retorna o número de colunas na linha i (3 neste caso)
            for (int j = 0; j < matriz[i].length; j++) {
                
                // Acumula o valor do elemento atual na variável soma
                soma += matriz[i][j];
                // Equivalente a: soma = soma + matriz[i][j];
            }
        }
        
        // Imprime o resultado da soma
        System.out.println("Soma dos elementos: " + soma);
    }
}