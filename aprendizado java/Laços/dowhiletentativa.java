/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticas;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author gilson.valadares
 */
public class dowhiletentativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(100) +1;
        int tentativa;
        
        System.out.println("Tente adivinhar o numero entre 1 e 100");
        do {
            System.out.println("Digite a sua tentativa: ");
            tentativa = scanner.nextInt();
            
            if (tentativa < numeroSecreto) {
                System.out.println("O numero e maior! ");
                
            }else if (tentativa > numeroSecreto) {
                System.out.println ("O numero e menor!");
            }
            
            }while (tentativa != numeroSecreto);
            
            System.out.println("Parabens! vc acertou o numero!!! ");
            
        
        
        
    }
    
    
}