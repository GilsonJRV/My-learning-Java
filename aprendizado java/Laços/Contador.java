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
public class Contador {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        String continuar;
        
        do {
            contador++;
            System.out.println("Contagem atual:" + contador);
            
            System.out.println("Deseja continuar? (s/n); ");
            continuar = scanner.nextLine();
            
        }while (continuar.equalsIgnoreCase("s"));
        
        System.out.println("Contagem final: " + contador);
        }
    }
    
    

