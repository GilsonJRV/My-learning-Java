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
public class provaconverterFemC {
    public static double converter(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Digite a temperatura em fahrenheit ");
         double fahrenheit = scanner.nextDouble();
         
         double celsius = converter(fahrenheit);
         System.out.printf("A temperatura em Celsius: %.2f", celsius);
         
         scanner.close();
         
         
        
    }
   
    
    
}
