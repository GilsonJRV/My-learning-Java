/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticas;
import java.util.Scanner;
//Switch com laço

public class Switchcomlaço {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia;
        
        do {
            System.out.println("Digite um numero de 1 a 7 para saber o dia da semana: ");
            dia = scanner.nextInt();
            
            switch (dia) {
                case 1:
                    System.out.println("1 = domingo");
                    break;
                case 2:
                    System.out.println("2 = segunda-feira");
                    break;
                case 3:
                    System.out.println("3 = terça-feira");
                    break;
                case 4:
                    System.out.println("4 = quarta-feira");
                    break;
                case 5:
                    System.out.println("5 = quinta-feira");
                    break;
                case 6:
                    System.out.println("6 = sexta-feira");
                    break;
                case 7:
                    System.out.println("7 = sábado");
                    break;
                default:
                    System.out.println("Número inválido, Por favor, digite outro: ");
            }
        } while (dia < 1 || dia > 7);
        
        scanner.close();
    }
}
