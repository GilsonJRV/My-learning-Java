/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticas;

/**
 *
 * @author gilson.valadares
 */
public class arraymaioremenorsearch {
    public static void main(String[] args) {
        double[] numeros = {2.5, 4.8, 1.3, 9.7, 5.6};
        
        double maior = numeros[0];
        double menor = numeros[0];
        
        //Encontrar o amior e o menor valor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("O valor do menor e: " + maior);
        System.out.println("O valor do maior e: " + menor);
 }
    
    
}
