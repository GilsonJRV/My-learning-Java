/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticas;
import java.util.Scanner;
/**
 * Exercicio 1
 * @author gilson.valadares e Roberta Evangelista Izaias
 */
public class Veficadormaiorque10 {
    public static void main(String[] args) {
     int numero; 
     Scanner scanner = new Scanner(System.in);
     System.out.print("Digite um numero inteiro: ");
     numero=scanner.nextInt();
        
    if (numero>10)
     System.out.println("Maior que 10"); 
    
    if (numero<10) {
    System.out.println("Menor que 10");
    }
  
        
    }    
}
