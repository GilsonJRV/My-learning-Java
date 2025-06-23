/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticas;

/**
 *
 * @author gilson.valadares
 */
public class somaasvariaveisdoarray {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int soma = 0;
        
        //somar os elementos do array
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
            
        }
        System.out.println("A soma dos elementos e: " + soma);
    }
    
    
    
}
