/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticas;

/**
 *
 * @author gilson.valadares
 */
public class Arrayexerciciosala {
    public static void main(String[] args) {
        int[] numeros = {3, 5, 7, 8,};
        
        //Exibir os elementos do array
        System.out.println("Elementos do array: ");
        for (int i = 0; i < numeros.length; i++) {
        System.out.println(numeros[i]);
    }
   
      int[] vetor2 = {8, 9, 3, 1,};
        System.out.println("Elementos vetor2(array): ");
        for (int i = 0; i < vetor2.length; i++) {
        System.out.println(vetor2[i]);
        
    }
        vetor2 [1] = 5;
        for (int i = 0; i < vetor2.length; i++) {
        System.out.println(vetor2[i]);
        
    }  
      
}
}