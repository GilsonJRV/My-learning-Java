/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticas;

/**
 *
 * @author gilson.valadares
 */
public class multiplicaosvetores {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        int[] resultado = new int[array1.length];
        
        //Multiplica os elmentos de 2 array
        for(int i = 0; i < array1.length; i++) {
            resultado[i] = array1[i] * array2[i]; 
        
        }
        //Exibe na tela
        System.out.println("Resultado do arrays multiplicados: ");
        for(int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i] + " ");
        }
    }
    
}
