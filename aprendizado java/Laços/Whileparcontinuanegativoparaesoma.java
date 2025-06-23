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
public class Whileparcontinuanegativoparaesoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, soma = 0;
        System.out.println("Digite numeros positivos" + "(ou um numero negativo para parar:)");
        numero = scanner.nextInt();
        while (numero >= 0) {
        soma += numero;
        numero = scanner.nextInt();
        }        
        System.out.println("Soma total:" + (soma - (-numero)));
    }
            
    
}
