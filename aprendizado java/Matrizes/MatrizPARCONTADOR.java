/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticas;

import java.util.Scanner;

/**
 * Classe que lê uma matriz 3x3 do usuário e conta quantos números pares ela contém.
 * @author gilson.valadares
 */
public class MatrizPARCONTADOR { 
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);
        
        // Declara e inicializa uma matriz 3x3 de inteiros
        int[][] matriz = new int[3][3];
        
        // Variável para armazenar a quantidade de números pares
        int contadorDePares = 0;
        
        System.out.println("Preencha a matriz 3x3 com numeros inteiros: ");
        
        // Loop para percorrer cada linha da matriz (i = linha)
        for (int i = 0; i < 3; i++) {
            // Loop para percorrer cada coluna da matriz (j = coluna)
            for (int j = 0; j < 3; j++) {
                // Solicita ao usuário o valor para a posição [i][j]
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                
                // Lê o valor digitado e armazena na matriz
                matriz[i][j] = scanner.nextInt();
                
                // Verifica se o número é par (resto da divisão por 2 é 0)
                if (matriz[i][j] % 2 == 0) {
                    contadorDePares++; // Incrementa o contador se for par
                }
            }
        }
        
        // Exibe o total de números pares encontrados na matriz
        // Obs: "/n" está errado, o correto é "\n" para pular linha
        System.out.println("\nQuantidade de numeros pares na matriz: " + contadorDePares);
        
        // Fecha o Scanner para liberar recursos (boa prática)
        scanner.close();
    }
}