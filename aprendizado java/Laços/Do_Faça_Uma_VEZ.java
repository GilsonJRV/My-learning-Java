/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticas;
import java.util.Scanner;

/**
 *
 * @author gilson.valadares
 */
public class Do_Faça_Uma_VEZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        
        do {
            System.out.println("Digite um numero " + "inteiro (0 para sair): " );
            numero = scanner.nextInt();
            if (numero > 0) {
                System.out.println("O numero " + numero + " e positivo.");
            } else if (numero < 0) {
                System.out.println("O numero " + numero + " e negativo.");
            }
             
            } while (numero != 0);
        
              System.out.println("Progama encerrado ");
              scanner.close();
                      
        }
    }
    

