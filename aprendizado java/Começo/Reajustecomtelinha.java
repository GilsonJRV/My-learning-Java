package praticas;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Reajustecomtelinha {
    public static void main(String[] args) {
        float gasolina;
        float etanol;
        final double REAJUSTE = 1.1; // Constante para o reajuste de 10%
        Scanner ler = new Scanner(System.in);
        
        JOptionPane.showMessageDialog(null, "Bem-vindo ao Sistema de Reajuste de Combustíveis!");
        
        // Entrada dos valores usando JOptionPane para as mensagens e Scanner para a leitura
        JOptionPane.showMessageDialog(null, "Digite o valor da gasolina:");
        gasolina = ler.nextFloat();
        
        JOptionPane.showMessageDialog(null, "Digite o valor do etanol:");
        etanol = ler.nextFloat();
        
        // Cálculo dos valores com reajuste
        double gasolinaReajustada = gasolina * REAJUSTE;
        double etanolReajustado = etanol * REAJUSTE;
        
        // Exibição dos resultados formatados
        JOptionPane.showMessageDialog(null, 
            "Valores reajustados em 10%:\n\n" +
            "Gasolina: R$ " + String.format("%.2f", gasolina) + 
            " → R$ " + String.format("%.2f", gasolinaReajustada) + "\n" +
            "Etanol: R$ " + String.format("%.2f", etanol) + 
            " → R$ " + String.format("%.2f", etanolReajustado));
        
        ler.close(); // Fechar o Scanner
    }
}