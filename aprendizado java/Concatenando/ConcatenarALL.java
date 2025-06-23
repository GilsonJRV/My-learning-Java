/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticas;

/**
 *
 * @author gilson.valadares
 */
public class ConcatenarALL {
    
    public static void main(String[] args) {
        // Declaração e inicialização de variáveis do tipo String
        String palavra1 = "Inter";
        String palavra2 = "net";
        
        // Imprime as palavras com um espaço entre elas
        System.out.println(palavra2 + " " + palavra1);
        
        // Concatena as duas palavras e imprime o resultado
        System.out.println(palavra1 + palavra2);
        
        /* Comentário explicativo:
           - System = Sistema
           - out = saída
           - print = imprimir
           - +" "+ é usado para adicionar um espaço entre as palavras */
        
        // Declaração e inicialização de variáveis do tipo String para formar um nome
        String nome1 = "Gil";
        String nome2 = "son";
        
        // Concatena as duas partes do nome e imprime o resultado
        System.out.println(nome1 + nome2);
        
        // Compara se as variáveis nome1 e nome2 são iguais (retorna false)
        System.out.println(nome1 == nome2);
        
        // Compara se as variáveis nome1 e nome2 são diferentes (retorna true)
        System.out.println(nome1 != nome2);
    }
}