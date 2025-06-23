/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticas;

/**
 *
 * @author gilson.valadares
 */
public class arraysequalmaça {
    public static void main(String[] args) {
        String[] frutas = {"Maca", "Banana", "Laranja", "Maca", "Uva", "Maca"};
        String frutaParaContar = "Maca";
        int contador = 0;
        
        //Contar a frequencia da fruta maça
        for(int i = 0; i < frutas.length; i++) {
            if (frutas[i].equals(frutaParaContar)) {
                contador++;
            }
        }
        System.out.println("A fruta " + frutaParaContar + " aparece " + contador + " vezes!! ");
        
    
}
}