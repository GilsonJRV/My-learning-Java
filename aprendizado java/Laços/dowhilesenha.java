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
public class dowhilesenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "gs9517531";
        String senhaDigitada;
        
        do {
            System.out.println("Digite sua senha: ");
            senhaDigitada = scanner.nextLine();
            
            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente");
            }
            
        } while (!senhaDigitada.equals(senhaCorreta));
          
        System.out.println("Acesso concedido!");
        scanner.close();
    }
    
}
