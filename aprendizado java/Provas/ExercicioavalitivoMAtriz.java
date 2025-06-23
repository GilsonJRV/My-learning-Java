/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticas;
import java.util.Scanner;

public class ExercicioavalitivoMAtriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        
        int[][] matriz = new int[3][3];
        System.out.println("Preencha a matriz 3x3 com numeros inteiros: ");
        
        // Preenche a matriz e calcula a soma
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a posicao [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        }
        
        // Calcula a média (usando divisão inteira)
        int media = soma / 9; // 9 porque é uma matriz 3x3 (3*3=9 elementos)
        
        System.out.println("Soma dos elementos: " + soma);
        System.out.println("Media dos elementos (inteira): " + media);
    }
}