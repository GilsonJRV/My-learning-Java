/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticas;
import java.util.Scanner;

/** Exercicio 1 
 *
 * @author gilson.valadares e Roberta Evangelista Izaias
 */
public class VerificaseonumeroÉpositivoOuNegativo {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        numero=scanner.nextInt();
        
        if (numero>1)
            System.out.println("Positivo");
        if (numero<0) {
        System.out.println("Negativo");
        }else{
        if (numero==0)
                System.out.println("Igual a 0");
        
        }
       
    }
   
        
    
}
