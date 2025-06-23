/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Declaração do pacote ao qual a classe pertence
// O pacote organiza classes relacionadas em um namespace único
package praticas;

// Importação da classe JOptionPane da biblioteca javax.swing
// JOptionPane é usada para criar caixas de diálogo interativas
import javax.swing.JOptionPane;

/**
 *
 * @author gilson.valadares
 */

// Declaração da classe pública Confirmação
// Uma classe em Java é um modelo para criar objetos e definir comportamentos (métodos) e estados (atributos)
public class Confirmação {

    // Método principal (main), ponto de entrada do programa
    // O Java Runtime Environment (JRE) chama este método para iniciar a execução do programa
    public static void main(String[] args) {
        // Declaração de uma variável do tipo String chamada Gilson e inicialização com valor nulo
        String Gilson = null;

        // Exibe uma caixa de diálogo de entrada de dados (JOptionPane.showInputDialog)
        // O usuário digita seu nome, e o valor é armazenado na variável Gilson
        Gilson = JOptionPane.showInputDialog("Qual é o seu nome?");

        // Exibe uma caixa de diálogo de confirmação (JOptionPane.showConfirmDialog)
        // Mostra uma mensagem com o nome digitado pelo usuário
        JOptionPane.showConfirmDialog(null, "O seu nome é " + Gilson + "!");
    }
}