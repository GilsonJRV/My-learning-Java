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
public class Whileresolveexponteusario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite a base: ");
        int base = teclado.nextInt();
        
        System.out.print("Digite o expoente: ");
        int expoente = teclado.nextInt();
        
        long resultado = 1;
        long contador = 0;
        
        while (contador < expoente) {
            resultado *= base;
            contador++;
        }
        System.out.println(base + "^" + expoente + "=" + resultado);
    }
    
    
}
