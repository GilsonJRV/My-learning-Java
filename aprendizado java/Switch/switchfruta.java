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
public class switchfruta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha uma fruta: ");
        System.out.println("1. Maçã");
        System.out.println("2. Banana");
        System.out.println("3. Laranja");
        System.out.println("4 Uva");
        System.out.print("Digite o numero da fruta (1-4): ");
        int escolha = scanner.nextInt();
        
        switch (escolha) {
            case 1:
                System.out.println("Você escolheu Maçã");
                break;
                
            case 2:
                System.out.println("Você escolheu Banana");
                break;
                
            case 3:
                System.out.println("Você escolheu laranja");
                break;
                
            case 4:
                System.out.println("Você escolheu uva");
                break;
                
            default: 
                System.out.println("Você não escolheu nenhuma fruta");
        }
        scanner.close();
             
             
            
    }
    
}
