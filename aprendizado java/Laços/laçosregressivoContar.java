/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;

/**
 *
 * @author Abraão
 */
public class laçosregressivoContar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para iniciar a contagem regressiva: ");
        int numero = sc.nextInt();
        
        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }
        
        System.out.println("Contagem concluida!");
        sc.close();
                
    }
    }