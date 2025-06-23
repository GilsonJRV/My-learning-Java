/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticas;
import java.util.Scanner;

/**
 * Classe que demonstra o uso de matrizes em Java
 * @author gilson.valadares
 */
public class M1matriz {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Declara e inicializa uma matriz 3x3 de inteiros
        int[][] matriz = new int[3][3];
        
        System.out.println("Preencha a matriz 3x3 com numeros inteiros: ");
        
        /*
         * Loop aninhado para preencher a matriz:
         * - O primeiro for percorre as linhas (i)
         * - O segundo for percorre as colunas (j)
         */
        for (int i= 0; i < 3; i++) {
            for (int j= 0; j < 3; j++) {
                // Solicita ao usuário o valor para cada posição da matriz
                System.out.print("Digite o valor para a posicao [" + i +"] [" + j + "]: "  );
                // Armazena o valor digitado na posição correspondente da matriz
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        // Exibe a matriz preenchida (observação: há um pequeno erro aqui com "/n" que deveria ser "\n")
        System.out.println("\nMatriz preenchida:");
        
        // Loop aninhado para exibir a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Imprime cada elemento da matriz seguido de espaço
                System.out.print(matriz[i][j] + " ");
            }
            // Pula linha após cada linha da matriz ser impressa
            System.out.println();
        }
       
        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}