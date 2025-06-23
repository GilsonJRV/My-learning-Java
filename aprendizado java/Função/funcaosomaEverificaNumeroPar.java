/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticas;

/**
 *
 * @author gilson.valadares
 */
public class funcaosomaEverificaNumeroPar {
    public static boolean isPar(int numero) {
        return numero % 2 == 0;
       }
       public static int somar (int a, int b) {
           return a + b;
       }
    public static void main(String[] args){
        int numero = 4;
        System.out.println("O numero " + numero + " é par? " + isPar(numero+8));
        System.out.println("Soma = "+somar(1,2));
    ;
    }
     
}
