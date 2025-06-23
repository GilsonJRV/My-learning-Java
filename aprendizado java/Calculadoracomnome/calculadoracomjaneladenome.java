package praticas;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class calculadoracomjaneladenome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Usando JOptionPane para mensagens e entrada do nome
        JOptionPane.showMessageDialog(null, "Bem-vindo à Calculadora!");
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        
        // Usando Scanner para entrada dos números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        // Usando JOptionPane para escolher a operação
        String opr = JOptionPane.showInputDialog("Escolha a operação (+, -, *, /):");
        char operacao = opr.charAt(0);
        
        double resultado = 0;
        boolean operacaoValida = true;
        
        if (operacao == '+') {
            resultado = num1 + num2;
        } 
        else if (operacao == '-') {
            resultado = num1 - num2;
        } 
        else if (operacao == '*') {
            resultado = num1 * num2;
        } 
        else if (operacao == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                JOptionPane.showMessageDialog(null, "Erro: Divisão por zero!");
                operacaoValida = false;
            }
        } 
        else {
            JOptionPane.showMessageDialog(null, "Operação inválida!");
            operacaoValida = false;
        }
        
        // Mostra o resultado apenas se a operação foi válida
        if (operacaoValida) {
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        }
        
        scanner.close(); // Fecha o Scanner para evitar vazamentos
    }
}